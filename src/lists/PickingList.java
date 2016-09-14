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
    ArrayList<K_BA> pickingListArray = new ArrayList<>();
    List result;

    public PickingList() {
        this.getData();
    }

    public void getData() {
        database.DB_Connect con = new database.DB_Connect();
        /*result = con.Connect("FROM Kund k JOIN k.best best WHERE best.BNR = 1");*/
        result = con.Connect("FROM K_BA kba WHERE kba.best.STATUS = 'offen'and ROWNUM <= 40 ORDER BY kba.best.BESTELLDATUM ASC ,kba.best.BNR DESC, kba.POSITION DESC");
    }

    public void showTable(JTable Table1,ArrayList pickingListArrayget) {
        
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        System.out.println(result.size());

        for (Object kba : pickingListArrayget) {

            K_BA k_ba = (K_BA) kba;
            rowData[0] = k_ba.getBest().getBNR();
            rowData[1] = k_ba.getPOSITION();
            rowData[2] = k_ba.getBest().getBESTELLDATUM();
            rowData[3] = k_ba.getArti().getBEZEICHNUNG();
            rowData[4] = k_ba.getANZAHL();
            rowData[5] = k_ba.getArti().getBESTANDSMENGE();
            rowData[6] = k_ba.getArti().getF_LNR();

            model.addRow(rowData);
        }
    }
    
    public ArrayList buildPickinglist() {
        int artikelinBest = 0;
        int letzteBNR = 0;
        for (Object o : result) {
                K_BA k_ba = (K_BA) o;

                if (k_ba.getBest().getBNR() != letzteBNR) {
                    artikelinBest += anzahlAtikelproBest(k_ba.getBest().getBNR());
                    System.out.println(artikelinBest);
                    int nachImportBest = artikelinBest;
                    if (artikelinBest >= 100)return pickingListArray;
                    pickingListArray.add(k_ba);
                }
                letzteBNR = k_ba.getBest().getBNR();
                //Hier muss noch eine Methode implementiert werden die den Status der Bestellungen auf inArbeit setzt
            
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
    
}
