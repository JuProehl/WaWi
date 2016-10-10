/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import database.DB_Connect;
import entity.Arti;
import entity.Best;
import entity.Kund;
import entity.K_BA;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marc Czolbe
 */
public class PickingList {

    private ArrayList<Arti> zaehlerArti = new ArrayList<>();
    private ArrayList<Integer> BestAusPList = new ArrayList<>();
    private ArrayList<K_BA> pickingListArray = new ArrayList<>();
    private List result;

    public PickingList() {
        this.getData();
    }

    public void getData() {
        database.DB_Connect con = new database.DB_Connect();
        /*result = con.Connect("FROM Kund k JOIN k.best best WHERE best.BNR = 1");*/
        //nicht auf 40 begrenzen!!!!
        result = con.Connect("FROM K_BA kba WHERE kba.best.STATUS = 'offen' ORDER BY kba.best.BESTELLDATUM ASC ,kba.best.BNR ASC, kba.POSITION ASC");
    }

    public void showTable(JTable Table1, ArrayList pickingListArrayget) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        //System.out.println(result.size());

        for (Object kba : pickingListArrayget) {

            K_BA k_ba = (K_BA) kba;
            rowData[0] = k_ba.getBest().getBNR();
            rowData[1] = k_ba.getPOSITION();
            rowData[2] = k_ba.getArti().getBEZEICHNUNG();
            rowData[3] = k_ba.getANZAHL();
            rowData[4] = k_ba.getArti().getBESTANDSMENGE();
            rowData[5] = k_ba.getArti().getLage().getRegal();
            rowData[6] = k_ba.getArti().getLage().getFach();

            model.addRow(rowData);
        }
    }

    public ArrayList buildPickinglist() {
        Best bestellung = new Best();
        int artikelinPickingList = 0;
        int letzteBNR = 0;
        boolean ignoreBNR = false;
        this.buildZaehlerArti();
        
        
        
        
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (k_ba.getBest().getBNR() != letzteBNR) {
                //neue Bestellung
                if (artikelinPickingList == 0 && anzahlArtikelproBest(k_ba.getBest().getBNR()) > 100) {
                    //Einzelner großer ältester Auftrag 
                    if (checkBestand(k_ba.getBest().getBNR())) {
                        for (Object i : result) {
                            K_BA tk_ba = (K_BA) i;
                            if (k_ba.getBest().getBNR() == tk_ba.getBest().getBNR()) {
                                pickingListArray.add(tk_ba);
                                k_ba.getBest().UpdateStatus("inArbeit");
                                this.updateZaehlerArti(tk_ba);
                            }
                        }
                        return pickingListArray;
                    } else {
                        letzteBNR = k_ba.getBest().getBNR();
                        ignoreBNR = true;
                    }
                } else if (anzahlArtikelproBest(k_ba.getBest().getBNR()) <= 100) {
                    int nachImportBest = artikelinPickingList + anzahlArtikelproBest(k_ba.getBest().getBNR());
                    if (nachImportBest < 150) {
                        //Ist nach dem Import dieses neuen Auftrags die Summe der Artikel in der PickingList kleiner als 150?
                        ignoreBNR = false;
                        if (checkBestand(k_ba.getBest().getBNR())) {
                            artikelinPickingList += anzahlArtikelproBest(k_ba.getBest().getBNR());
                            //Position zur PickingList hinzufügen

                            pickingListArray.add(k_ba);
                            k_ba.getBest().UpdateStatus("inArbeit");
                            this.updateZaehlerArti(k_ba);
                        } else {
                            ignoreBNR = true;
                        }
                        letzteBNR = k_ba.getBest().getBNR();
                    } else if (artikelinPickingList > 120) {
                        return pickingListArray;
                    }
                }

            } else if (!ignoreBNR) {
                //Positionen einer geprüften Bestellung werden zum Array hinzugefügt
                pickingListArray.add(k_ba);
                k_ba.getBest().UpdateStatus("inArbeit");
                this.updateZaehlerArti(k_ba);
            }
            

        }
        return pickingListArray;
    }

    public int anzahlArtikelproBest(int bnr) {
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
        for (Arti j : zaehlerArti) {
            if (j.getANR() == k_ba.getArti().getANR()) {
                j.setBESTANDSMENGE(j.getBESTANDSMENGE() - k_ba.getANZAHL());
            }
        }
    }

    private void buildZaehlerArti() {
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (!zaehlerArti.contains(k_ba.getArti())) {
                zaehlerArti.add(k_ba.getArti().clone());
            }
        }
    }
    
    
    public void resetStatusAllBEST(){
        for(K_BA i : pickingListArray){
            i.getBest().UpdateStatus("offen");
        }
        
        
    }

    public void setAbgeschlossen(ArrayList rowPickingList) {
        for (Object j : rowPickingList) {
            K_BA k_ba = (K_BA) j;
            k_ba.getBest().UpdateStatus("Abgeschlossen");
        }
        
        
    }
    
    
}
