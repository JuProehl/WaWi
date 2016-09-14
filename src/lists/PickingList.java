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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marc Czolbe
 */
public class PickingList {

    List result;

    public PickingList() {
        this.getData();
    }

    public void getData() {
        database.DB_Connect con = new database.DB_Connect();
        /*result = con.Connect("FROM Kund k JOIN k.best best WHERE best.BNR = 1");*/
        result = con.Connect("FROM K_BA kba WHERE kba.best.STATUS = 'offen'and ROWNUM <= 40 ORDER BY kba.best.BESTELLDATUM ASC ,kba.best.BNR DESC, kba.POSITION DESC");
    }

    public void showTable(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        System.out.println(result.size());

        for (Object o : result) {

            K_BA k_ba = (K_BA) o;
            /* rowData[0] = best.getBNR();
            rowData[1] = best.getABSCHULUSSDATUM();
            rowData[2] = best.getBESTELLDATUM();
            rowData[3] = best.getSTATUS();
            rowData[4] = best.getkund().getOrt();
            rowData[5] = best.getkund().getVorname();
            rowData[6] = best.getkund().getNachname();
            rowData[7] = best.getkund().getKNr();
            model.addRow(rowData);*/
        }
    }
    
    public List buildPickinglist() {
        List picking = null;
        int artikelinBest = 0;
        int letzteBNR = 0;
        for (Object o : result) {
                K_BA k_ba = (K_BA) o;

                if (k_ba.getBest().getBNR() != letzteBNR) {
                    artikelinBest += anzahlAtikelproBest(k_ba.getBest().getBNR());
                    System.out.println(artikelinBest);
                    int nachImportBest = artikelinBest;
                    if ()
                }
                letzteBNR = k_ba.getBest().getBNR();
                //picking.add(o);
                //Hier muss noch eine Methode implementiert werden die den Status der Bestellungen auf inArbeit setzt
            
        }
        return picking;
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
