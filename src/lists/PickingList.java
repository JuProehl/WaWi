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
 * @author JProehl
 */
public class PickingList {
     List result;
    
    
    public PickingList() {
        
     TabelleHolen();

    }
    
   
    
    
     public void ArtikelInTabelleAusgeben(JTable Table1){
        
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
     
     public void holeTabelle(){
            database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("SELECT Best.BNR,K_BA.POSITION,Best.BESTELLDATUM,Arti.BEZEICHNUNG,K_BA.ANZAHL, Arti.BESTANDSMENGE FROM Arti JOIN K_BA ON Arti.ANR = K_BA.F_ANR JOIN Best ON K_BA.F_BNR = Best.BNR WHERE Best.STATUS = 'offen' and ROWNUM <= 40 ORDER BY Best.BESTELLDATUM ASC ,Best.BNR, K_BA.POSITION;");
     }
    
    
    
    
    
}
