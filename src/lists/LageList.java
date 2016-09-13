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
        
        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("FROM Lage ORDER BY LNR");

    }
    
    public LageList(String Befehl) {
        
        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect(Befehl);

    }
    
   
    
     public void TabelleHolen() {
        
        database.DB_Connect con = new database.DB_Connect();
        result = con.Connect("FROM Lage ORDER BY LNR");

    }
    
     public void LagerInTabelleAusgeben(JTable Table1){
        
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        Object rowData[] = new Object[4];
        model.setRowCount(0);
        
        	for ( Iterator iterator = result.iterator(); iterator.hasNext();){
		Lage Lager = (Lage) iterator.next();
                rowData[0] = Lager.getLNr();
                rowData[1] = Lager.getRegal();
                rowData[2] = Lager.getFach();
                rowData[3] = Lager.getMaxmenge();
                model.addRow(rowData);             
                }
 } 
     
     public Integer getLNr(int row){
        
         
         Lage Lager = (Lage) result.get(row);
         int LNr = Lager.getLNr();
         
         return LNr ;
     }
     
      public Integer getRegal(int row){
        
         
         Lage Lager = (Lage) result.get(row);
         int Regal = Lager.getRegal();
         
         return Regal ;
     }
      
       public Integer getFach(int row){
        
         
         Lage Lager = (Lage) result.get(row);
         int Fach = Lager.getFach();
         
         return Fach ;
     }
       
        public Integer getMaxMenge(int row){
        
         
         Lage Lager = (Lage) result.get(row);
         int MaxMenge = Lager.getMaxmenge();
         
         return MaxMenge ;
     }
     
     
     
}
