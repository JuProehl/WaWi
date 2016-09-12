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
        result = con.Connect("FROM Kund k JOIN k.best best");
    }

    public void showTable(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[5];
        model.setRowCount(0);

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Kund kund = (Kund) iterator.next();
            //rowData[0] = Artikel.getANR();
            //rowData[1] = Artikel.getBEZEICHNUNG();
            //rowData[2] = Artikel.getBESTANDSMENGE();
            //rowData[3] = Artikel.getKrit_Menge();
            //rowData[4] = Artikel.getF_LNR();
            //model.addRow(rowData);
        }
    }

}
