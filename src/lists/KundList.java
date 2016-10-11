/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import entity.Kund;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Markus
 */
public class KundList {

    List result;
    database.DB_Connect con;

    public KundList() {
        this.con = new database.DB_Connect();
        this.result = con.Connect("FROM Kund ORDER BY KNR");
    }

    public KundList(String Befehl) {

        this.con = new database.DB_Connect();
        result = con.Connect(Befehl);

    }

    public void TabelleHolen() {

        this.con = new database.DB_Connect();
        result = con.Connect("FROM Kund ORDER BY KNR");
    }

    public void KundenInTabelleAusgeben(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[7];
        model.setRowCount(0);

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Kund kunde = (Kund) iterator.next();
            rowData[0] = kunde.getKNr();
            rowData[1] = kunde.getNachname();
            rowData[2] = kunde.getVorname();
            rowData[3] = kunde.getStrasse();
            rowData[4] = kunde.getHausnummer();
            rowData[5] = kunde.getPLZ();
            rowData[6] = kunde.getOrt();

            model.addRow(rowData);
        }
    }

    public Integer getKNr(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getKNr();
    }

    public String getNachname(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getNachname();
    }

    public String getVorname(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getVorname();
    }

    public String getStrasse(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getStrasse();
    }

    public Integer getHausnummer(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getHausnummer();
    }

    public Integer getPLZ(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getPLZ();
    }

    public String getOrt(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde.getOrt();
    }

    public Kund getKund(int row) {

        Kund kunde = (Kund) result.get(row);
        return kunde;
    }
}