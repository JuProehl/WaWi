/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import entity.Arti;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matthias
 */
public class ArtiList {

    List result;

    public ArtiList() {

        TabelleHolen();

    }

    public void ArtikelInTabelleAusgeben(JTable Table1) {

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[6];
        model.setRowCount(0);

        for (Iterator iterator = result.iterator(); iterator.hasNext();) {
            Arti Artikel = (Arti) iterator.next();
            rowData[0] = Artikel.getANR();
            rowData[1] = Artikel.getBEZEICHNUNG();
            rowData[2] = Artikel.getBESTANDSMENGE();
            rowData[3] = Artikel.getKrit_Menge();
            rowData[4] = Artikel.getLage().getLNr();
            rowData[5] = Artikel.getVK_Preis();
            model.addRow(rowData);
        }
    }

    public void TabelleHolen() {
        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("FROM Arti ORDER BY ANR");
    }

    public Integer getANR(int row) {

        Arti Artikel = (Arti) result.get(row);
        int ANR = Artikel.getANR();

        return ANR;
    }

    public String getBezeichnung(int row) {

        Arti Artikel = (Arti) result.get(row);
        return Artikel.getBEZEICHNUNG();
    }

    public Integer getBESTANDSMENGE(int row) {

        Arti Artikel = (Arti) result.get(row);
        return Artikel.getBESTANDSMENGE();
    }

    public Integer getKrit_Menge(int row) {

        Arti Artikel = (Arti) result.get(row);
        return Artikel.getKrit_Menge();
    }

    public Integer getF_LNR(int row) {

        Arti Artikel = (Arti) result.get(row);
        return Artikel.getLage().getLNr();
    }

    public Double getVKPreis(int row) {

        Arti Artikel = (Arti) result.get(row);
        return Artikel.getVK_Preis();
    }
}
