/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import entity.Arti;
import entity.Lage;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matthias
 */
public class LageList {

    List result;

    public LageList() {

        TabelleHolen();

    }

    public LageList(String Befehl) {

        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect(Befehl);

    }

    public void TabelleHolen() {

        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("FROM Lage ORDER BY LNR");

    }

    public void LagerInTabelleAusgeben(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[4];
        model.setRowCount(0);

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Lage lager = (Lage) iterator.next();
            rowData[0] = lager.getLNr();
            rowData[1] = lager.getRegal();
            rowData[2] = lager.getFach();
            rowData[3] = lager.getMaxmenge();
            model.addRow(rowData);
        }
    }

    public Integer getLNr(int row) {

        Lage lager = (Lage) result.get(row);
        return lager.getLNr();
    }

    public Integer getRegal(int row) {

        Lage lager = (Lage) result.get(row);
        return lager.getRegal();
    }

    public Integer getFach(int row) {

        Lage lager = (Lage) result.get(row);
        return lager.getFach();
    }

    public Integer getMaxMenge(int row) {

        Lage lager = (Lage) result.get(row);
        return lager.getMaxmenge();
    }

    public Lage getLage(int row) {

        Lage lager = (Lage) result.get(row);
        return lager;
    }

    public int getsize() {
        return result.size();
    }

}
