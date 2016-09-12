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
        result = con.Connect("FROM Kund k JOIN k.best best WHERE best.BNR = 1");
    }

    public void showTable(JTable Table1) {

        //DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        //Object rowData[] = new Object[5];
        //model.setRowCount(0);
        //System.out.print(result.size());
        //System.out.print(result);
        for (Iterator iterator = result.iterator(); iterator.hasNext();) {

            System.out.println(iterator.next());

        }

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Kund kund = (Kund) iterator.next();
            /*rowData[0] = kund.getKNr();
            rowData[1] = kund.getNachname();
            rowData[2] = kund.getVorname();
            rowData[3] = kund.getStrasse();
            rowData[4] = kund.getHausnummer();
            rowData[5] = kund.getOrt();
            rowData[6] = kund.getPLZ();
            rowData[7] = kund.getBest();
            model.addRow(rowData);*/
        }
    }
}
