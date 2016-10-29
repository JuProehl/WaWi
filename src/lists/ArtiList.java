
// von Julian Pröhl, Matthias Escher
// von Markus Overberg, Marc Czolbe
package lists;

import entity.Arti;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            Arti artikel = (Arti) iterator.next();
            rowData[0] = artikel.getANR();
            rowData[1] = artikel.getBEZEICHNUNG();
            rowData[2] = artikel.getBESTANDSMENGE();
            rowData[3] = artikel.getKrit_Menge();
            rowData[4] = artikel.getLage().getLNr();
            rowData[5] = artikel.getVK_Preis();
            model.addRow(rowData);
        }
    }

    public ArtiList(String Befehl) {

        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect(Befehl);
    }

    public void TabelleHolen() {
        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("FROM Arti WHERE LOESCHKENNZEICHEN = ' ' ORDER BY ANR");
    }

    public Integer getANR(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getANR();
    }

    public String getBezeichnung(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getBEZEICHNUNG();
    }

    public Integer getBESTANDSMENGE(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getBESTANDSMENGE();
    }

    public Integer getKrit_Menge(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getKrit_Menge();
    }

    public Integer getF_LNR(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getLage().getLNr();
    }

    public double getVKPreis(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel.getVK_Preis();
    }

    public Arti getArti(int row) {

        Arti artikel = (Arti) result.get(row);
        return artikel;
    }
}
