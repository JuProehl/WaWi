/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listen;

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

    public ArtiList() {
    }
    
   
    
    
     public void ArtikelInTabelleAusgeben(JTable Table1){
     Datenbank.DB_Connect con = new Datenbank.DB_Connect();
        List result = con.Connect("FROM Arti");
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[5];
        model.setRowCount(0);
        
        	for ( Iterator iterator = result.iterator(); iterator.hasNext();){
		Arti Artikel = (Arti) iterator.next();
                rowData[0] = Artikel.getANR();
                rowData[1] = Artikel.getBEZEICHNUNG();
                rowData[2] = Artikel.getBESTANDSMENGE();
                rowData[3] = Artikel.getKrit_Menge();
                rowData[4] = Artikel.getF_LNR();
                model.addRow(rowData);             
                }
 } 
    
}
