/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author Markus
 */
public class Print {
    
       MessageFormat header;
       MessageFormat footer;
       public Print(){
           this.header  = new MessageFormat("Report");
           this.footer  = new MessageFormat("Seite {0,number,integer}");
       }
       
       public void CreatePages(JTable table){
           
        try{
           table.print(JTable.PrintMode.NORMAL, header, footer);
           
       }catch(java.awt.print.PrinterException e){
           System.err.format("Fehler beim Drucken", e.getMessage());       }
       }
    
    
}
