/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import entity.Best;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Markus
 */
public class BestList {

    List result;
    database.DB_Connect con;

    public BestList() {
        TabelleHolen();
    }

    public BestList(String str) {
        TabelleHolen(str);

    }

    public void TabelleHolen() {

        this.con = new database.DB_Connect();
        result = con.Connect("FROM Best ORDER BY BNr");
    }

    public void TabelleHolen(String Befehl) {

        this.con = new database.DB_Connect();
        result = con.Connect(Befehl);
    }

    public void BestInTabelleAusgeben(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[5];
        model.setRowCount(0);

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Best Bestellung = (Best) iterator.next();
            rowData[0] = Bestellung.getBNR();
            rowData[1] = Bestellung.getkund().getKNr();
            rowData[2] = Bestellung.getBESTELLDATUM();
            rowData[3] = Bestellung.getSTATUS();
            rowData[4] = Bestellung.getABSCHLUSSDATUM();

            model.addRow(rowData);
        }
    }

    public Integer getBNR(int row) {

        Best Bestellung = (Best) result.get(row);
        return Bestellung.getBNR();
    }

    public Integer getKNr(int row) {

        Best Bestellung = (Best) result.get(row);
        return Bestellung.getkund().getKNr();
    }

    public Date getBESTELLDATUM(int row) {

        Best Bestellung = (Best) result.get(row);
        return Bestellung.getBESTELLDATUM();
    }

    public String getSTATUS(int row) {

        Best Bestellung = (Best) result.get(row);
        return Bestellung.getSTATUS();
    }

    public Date getABSCHLUSSDATUM(int row) {

        Best Bestellung = (Best) result.get(row);
        return Bestellung.getABSCHLUSSDATUM();
    }

    public Best getBest(int row){
        Best Bestellung = (Best) result.get(row);
        return Bestellung;
    }
    
}
