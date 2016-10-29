
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package lists;

import entity.Arti;
import entity.Best;
import entity.K_BA;
import entity.Lief;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PickingList {

    //Deklaration der Klassenvariablen
    private ArrayList<Arti> zaehlerArti = new ArrayList<>();
    private ArrayList<Integer> BestAusPList = new ArrayList<>();
    private ArrayList<K_BA> pickingListArray = new ArrayList<>();
    private List result;

    public PickingList() {
        //Konstruktor
        //Füllen der result List
        this.getData();
    }

    public void getData() {
        //neue Datenbank Verbindung
        database.DB_Connect con = new database.DB_Connect();
        //abrufen der Kreuztabelle K_BA alles Bestellungen die offen sind, Sortiert nach dem Bestelldatum, nach der Bestellnummer und nach der Position
        result = con.Connect("FROM K_BA kba WHERE kba.best.STATUS = 'offen' ORDER BY kba.best.BESTELLDATUM ASC ,kba.best.BNR ASC, kba.POSITION ASC");
    }

    public void showTable(JTable guiTable, ArrayList pickingListArrayget) {
        //Methode die aus der picklistGUI aufgerufen wird zur Ausgabe einer ArrayList in der JTable GUI
        //erzeugen eines DefaultTableModel aus der Übergebenen guitable
        DefaultTableModel model = (DefaultTableModel) guiTable.getModel();
        //Rohobjekte als Array zum füllen der Spalten
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        //Iteration durch die Übergebene ArrayList
        for (Object kba : pickingListArrayget) {
            //Casten der kba Objekte auf K_BA Objekte
            K_BA k_ba = (K_BA) kba;
            //füllen des rowData Arrays mit Werten
            rowData[0] = k_ba.getBest().getBNR();
            rowData[1] = k_ba.getPOSITION();
            rowData[2] = k_ba.getArti().getBEZEICHNUNG();
            rowData[3] = k_ba.getANZAHL();
            rowData[4] = k_ba.getArti().getBESTANDSMENGE();
            rowData[5] = k_ba.getArti().getLage().getRegal();
            rowData[6] = k_ba.getArti().getLage().getFach();
            //hinzufügen der rowData Datensätze zu dem GUI Table Model
            model.addRow(rowData);
        }
    }

    public ArrayList buildPickinglist() {
        //Variablen Deklaration
        Best bestellung = new Best();
        int artikelinPickingList = 0;
        int letzteBNR = 0;
        boolean ignoreBNR = false;
        this.buildZaehlerArti();

        //Iteration durch das Ergebnis der SQL Abfrage
        for (Object o : result) {
            //Casten der SQL Objekte auf K_BA Objekte
            K_BA k_ba = (K_BA) o;
            if (k_ba.getBest().getBNR() != letzteBNR) {
                //neue Bestellung also neue BNR
                if (artikelinPickingList == 0 && anzahlArtikelproBest(k_ba.getBest().getBNR()) > 100) {
                    //Einzelner großer (mehr Artikel als 100) ältester Auftrag und leere PickingArrayList
                    if (checkBestand(k_ba.getBest().getBNR())) {
                        //Bestandsprüfung für die BNR
                        //Hinzufügen aller Positionen dieser großen Bestellung zu PickingArrayList
                        for (Object i : result) {
                            K_BA tk_ba = (K_BA) i;
                            if (k_ba.getBest().getBNR() == tk_ba.getBest().getBNR()) {
                                getPickingListArray().add(tk_ba); //Hinzufügen
                                k_ba.getBest().UpdateStatus("inArbeit"); //Status in der DB
                                this.updateZaehlerArti(tk_ba); //Bestandsberechnung für weite Bestellungen
                            }
                        }
                        return getPickingListArray();
                    } else { //Kein Bestand für großen Auftrag
                        letzteBNR = k_ba.getBest().getBNR(); //merken der geprüften BNR
                        ignoreBNR = true; //Marker zum ignorieren dieser BNR
                    }
                } else if (anzahlArtikelproBest(k_ba.getBest().getBNR()) <= 100) {
                    //Kleiner(weniger Artikel als 100) neuer Auftrag
                    int nachImportBest = artikelinPickingList + anzahlArtikelproBest(k_ba.getBest().getBNR()); //
                    if (nachImportBest < 150) {
                        //Ist nach dem Import dieses neuen Auftrags die Summe der Artikel in der PickingList kleiner als 150?
                        ignoreBNR = false; //Rücksetzen der IgnorBNR Marke da eine neue bestellung geprüft wird
                        if (checkBestand(k_ba.getBest().getBNR())) { //Bestandsprüfung
                            artikelinPickingList += anzahlArtikelproBest(k_ba.getBest().getBNR()); //Zähler der Artikel in PList hochzählen
                            getPickingListArray().add(k_ba);//Hinzufügen
                            k_ba.getBest().UpdateStatus("inArbeit");//Status in der DB
                            this.updateZaehlerArti(k_ba);//Bestandskorrektur für weite Bestellungen
                        } else { //Kein Bestand für diesen Auftrag
                            ignoreBNR = true; //BNR Ignorieren
                        }
                        letzteBNR = k_ba.getBest().getBNR();//prüfung dieser BNR merken
                    } else if (artikelinPickingList > 120) { //PickingList füllen bis mindestens 120 und weniger als 150 Artikel enthalten sind
                        return getPickingListArray(); //Rückgabe PList
                    }
                }

            } else if (!ignoreBNR) {
                //Positionen einer geprüften Bestellung werden zum Array hinzugefügt wenn die Prüfung der BNR Positiv war
                getPickingListArray().add(k_ba);
                k_ba.getBest().UpdateStatus("inArbeit");
                this.updateZaehlerArti(k_ba);
            }

        }
        return getPickingListArray();
    }

    public int anzahlArtikelproBest(int bnr) {
        //Zählen der Artikelmengen pro BNR
        int artikelinBest = 0;
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (bnr == k_ba.getBest().getBNR()) {
                artikelinBest += k_ba.getANZAHL();
            }
        }
        return artikelinBest;
    }

    private boolean checkBestand(int bnr) {
        //Prüfung ob für jede Position einer BNR genug Bestand vorhanden ist
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (bnr == k_ba.getBest().getBNR()) {
                for (Arti i : zaehlerArti) {
                    if (k_ba.getArti().getANR() == i.getANR() && k_ba.getANZAHL() > i.getBESTANDSMENGE()) {
                        //Bestand reicht für die Bestellung bnr in mindestens einer POS nicht aus
                        return false;
                    }
                }
            }
        }
        //Bestand reich für alle POS der Bestellung bnr aus
        return true;
    }

    private void updateZaehlerArti(K_BA k_ba) {
        //Aktualisierung der temporären Bestandsberechnung
        for (Arti j : zaehlerArti) {
            if (j.getANR() == k_ba.getArti().getANR()) {
                j.setBESTANDSMENGE(j.getBESTANDSMENGE() - k_ba.getANZAHL());
            }
        }
    }

    private void buildZaehlerArti() {
        //Klonen der ArtikelObjekte zur temporären Bestandsberechnung
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (!zaehlerArti.contains(k_ba.getArti())) {
                zaehlerArti.add(k_ba.getArti().clone());
            }
        }
    }

    public void resetStatusAllBEST() {
        //setzt für das pickingListArray den Status offen in die DB wenn in der GUI zurück ansgewählt wird
        for (K_BA i : getPickingListArray()) {
            i.getBest().UpdateStatus("offen");
        }

    }

    public void setAbgeschlossen(ArrayList rowPickingList) {
        ArrayList<Integer> bestellungen = new ArrayList<>();
        //Status der BNR auf Abgeschlossen setzen wenn der MA die Artikel aus dem Lager gesammelt hat.
        for (Object j : rowPickingList) {
            K_BA k_ba = (K_BA) j;
            //Einmal pro Bestellung
            if (!bestellungen.contains(k_ba.getBest().getBNR())) {
                bestellungen.add(k_ba.getBest().getBNR());
                k_ba.getBest().UpdateStatus("Abgeschlossen");
                //Für jede abgeschlossene Bestellung entsprechende Lieferung anlegen
                Lief lief = k_ba.getBest().createLief();
            }

        }

    }

    /**
     * @return the pickingListArray
     */
    public ArrayList<K_BA> getPickingListArray() {
        return pickingListArray;
    }

}
