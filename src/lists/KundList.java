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
            Kund Kunde = (Kund) iterator.next();
            rowData[0] = Kunde.getKNr();
            rowData[1] = Kunde.getNachname();
            rowData[2] = Kunde.getVorname();
            rowData[3] = Kunde.getStrasse();
            rowData[4] = Kunde.getHausnummer();
            rowData[5] = Kunde.getPLZ();
            rowData[6] = Kunde.getOrt();

            model.addRow(rowData);
        }
    }

    public Integer getKNr(int row) {

        Kund Kunde = (Kund) result.get(row);
        int KNr = Kunde.getKNr();

        return KNr;
    }

    public String getNachname(int row) {

        Kund Kunde = (Kund) result.get(row);
        String Nachname = Kunde.getNachname();

        return Nachname;
    }

    public String getVorname(int row) {

        Kund Kunde = (Kund) result.get(row);
        String Vorname = Kunde.getVorname();

        return Vorname;
    }

    public String getStrasse(int row) {

        Kund Kunde = (Kund) result.get(row);
        String Strasse = Kunde.getStrasse();

        return Strasse;
    }

    public Integer getHausnummer(int row) {

        Kund Kunde = (Kund) result.get(row);
        int Hausnummer = Kunde.getHausnummer();

        return Hausnummer;
    }

    public Integer getPLZ(int row) {

        Kund Kunde = (Kund) result.get(row);
        int PLZ = Kunde.getPLZ();

        return PLZ;
    }

    public String getOrt(int row) {

        Kund Kunde = (Kund) result.get(row);
        String Ort = Kunde.getOrt();

        return Ort;
    }
}
