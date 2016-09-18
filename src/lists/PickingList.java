/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

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

    ArrayList<Integer> BestAusPList = new ArrayList<>();
    ArrayList<K_BA> pickingListArray = new ArrayList<>();
    List result;

    public PickingList() {
        this.getData();
    }

    public void getData() {
        database.DB_Connect con = new database.DB_Connect();
        /*result = con.Connect("FROM Kund k JOIN k.best best WHERE best.BNR = 1");*/
        result = con.Connect("FROM K_BA kba WHERE kba.best.STATUS = 'offen' and ROWNUM <= 40 ORDER BY kba.best.BESTELLDATUM ASC ,kba.best.BNR ASC, kba.POSITION ASC");
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
        int artikelinPickingList = 0;
        int letzteBNR = 0;
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (k_ba.getBest().getBNR() != letzteBNR) {
                //neue Bestellung
                if (artikelinPickingList == 0 && anzahlAtikelproBest(k_ba.getBest().getBNR()) > 100) {
                    //Einzelner großer ältester Auftrag 
                    for (Object i : result) {
                        K_BA tk_ba = (K_BA) i;
                        if (k_ba.getBest().getBNR() == tk_ba.getBest().getBNR()) {
                            pickingListArray.add(tk_ba);
                        }
                    }
                    return pickingListArray;
                } else if (anzahlAtikelproBest(k_ba.getBest().getBNR()) <= 100) {
                    int nachImportBest = artikelinPickingList + anzahlAtikelproBest(k_ba.getBest().getBNR());
                    if (nachImportBest < 150) {
                        //Ist nach dem Import dieses neuen Auftrags die Summe der Artikel in der PickingList kleiner als 100?
                        artikelinPickingList += anzahlAtikelproBest(k_ba.getBest().getBNR());
                        //Position zur PickingList hinzufügen
                        pickingListArray.add(k_ba);
                        letzteBNR = k_ba.getBest().getBNR();

                    } else if (artikelinPickingList > 120) {
                        return pickingListArray;
                    }
                }

            } else {
                //Positionen einer geprüften Bestellung werden zum Array hinzugefügt
                pickingListArray.add(k_ba);
            }

            Best bestellung = new Best();
            //bestellung.UpdateStatus(letzteBNR);

        }
        return pickingListArray;
    }

    public int anzahlAtikelproBest(int BNR) {
        int artikelinBest = 0;
        for (Object o : result) {
            K_BA k_ba = (K_BA) o;
            if (BNR == k_ba.getBest().getBNR()) {
                artikelinBest += k_ba.getANZAHL();
            }
        }
        return artikelinBest;
    }

    public ArrayList<K_BA> keineArtiImBestand(ArrayList<K_BA> pickingListArray) {
        for (Object i : pickingListArray) {
            K_BA k_ba = (K_BA) i;
            int anzahlAller = zaehleArtiinPL(pickingListArray, k_ba.getArti().getANR());
            if (anzahlAller > k_ba.getArti().getBESTANDSMENGE()) {
                BestAusPList.add(k_ba.getBest().getBNR());
            }
        }
        return allePOSdieserBestloeschen(pickingListArray, BestAusPList);
    }

    public int zaehleArtiinPL(ArrayList<K_BA> pickingListArray, int checkarti) {
        int anzahl = 0;
        for (Object i : pickingListArray) {
            K_BA k_ba = (K_BA) i;
            if (checkarti == k_ba.getArti().getANR()) {
                anzahl += k_ba.getANZAHL();
            }
        }
        return anzahl;
    }

    private ArrayList<K_BA> allePOSdieserBestloeschen(ArrayList<K_BA> pickingListArray, ArrayList<Integer> BNRArray) {
        ArrayList<K_BA> pickingListArrayNew = new ArrayList<>(pickingListArray);
        for (Object i : pickingListArray) {
            K_BA k_ba = (K_BA) i;
            for (Object j : BNRArray) {
                if (j.equals(k_ba.getBest().getBNR())) {
                    pickingListArrayNew.remove(i);
                    System.out.println(k_ba.getBest().getBNR() + ", " + k_ba.getArti().getBEZEICHNUNG() + ", " +  k_ba.getANZAHL()  + ", " + k_ba.getArti().getBESTANDSMENGE());

                    
                }
            }
        }
        return pickingListArrayNew;
    }

}
