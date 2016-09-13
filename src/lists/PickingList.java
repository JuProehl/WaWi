/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import entity.Arti;
import entity.Best;
import entity.Kund;
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
        result = con.Connect("FROM Best b JOIN fetch b.kund");
    }

    public void showTable(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[8];
        model.setRowCount(0);
        System.out.print(result.size());
        System.out.print(result);
        for (Iterator iterator = result.iterator(); iterator.hasNext();) {

            System.out.println(iterator.next());

        }
        

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            
            Best best = (Best) iterator.next();
            rowData[0] = best.getBNR();
            rowData[1] = best.getABSCHULUSSDATUM();
            rowData[2] = best.getBESTELLDATUM();
            rowData[3] = best.getSTATUS();
            rowData[4] = best.getkund().getOrt();
            rowData[5] = best.getkund().getVorname();
            rowData[6] = best.getkund().getNachname();
            rowData[7] = best.getkund().getKNr();
            model.addRow(rowData);
        }
    }
}