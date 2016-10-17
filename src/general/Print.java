/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.awt.print.Printable;
import java.text.MessageFormat;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaTray;
import javax.print.attribute.standard.Sides;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Markus
 */
// Klasse Print
// Enthält Methoden zum Drucken von Tabellen
public class Print {

    // Klassenvariablen
    // header: Für die Kopfzeile des Ausdrucks
    // footer: Für die Fußzeile des Ausdrucks
    MessageFormat header;
    MessageFormat footer;
    PrintService service;
    PrintRequestAttributeSet pset;

    // Konstruktor der Klasse Print
    // header: In der Kopfzeile wird der übergebene String angegeben
    // footer: In der Fußzeile werden die Seitenzahl angegeben
    public Print(String Header) {
        this.header = new MessageFormat(Header);
        this.footer = new MessageFormat("Seite {0,number,integer}");
        this.service = PrintServiceLookup.lookupDefaultPrintService();
        this.pset = new HashPrintRequestAttributeSet();
        pset.add(MediaTray.TOP);
        pset.add(Sides.ONE_SIDED);
    }

    public Print() {
        this.header = new MessageFormat("");
        this.footer = new MessageFormat("");
        this.service = PrintServiceLookup.lookupDefaultPrintService();
        this.pset = new HashPrintRequestAttributeSet();
        pset.add(MediaTray.TOP);
        pset.add(Sides.ONE_SIDED);
    }

    // Methode CreatePages
    // Übergabeparameter: JTable 
    // Tabelle, welche gedruckt werden soll
    public void CreatePages(JTable table) {

        try {
            // Druckkontext aufrufen
            // Für den Druck wird der Header und Footer angefügt
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer, false, pset, true, service);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Fehler beim Drucken", e.getMessage());
        }
    }

    // Methode für die Anschriften
    public void CreatePages(String anschrift) {
        try {

            JTextArea tf = new JTextArea(4, 10);
            tf.setText(anschrift);
            tf.print(this.header, this.footer, false, this.service, this.pset, true);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Fehler beim Drucken", e.getMessage());
        }
    }
    
    
    public void CreatePages (String anschrift, JTable table){
        try {

            JTextArea tf = new JTextArea(4, 10);
            tf.setText(anschrift);
            tf.print(this.header, this.footer, false, this.service, this.pset, true);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Fehler beim Drucken", e.getMessage());
        }
        
        try {
            // Druckkontext aufrufen
            // Für den Druck wird der Header und Footer angefügt
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer, false, pset, true, service);
            
            
            JTextArea tf = new JTextArea(4, 10);
            tf.setText(anschrift);
            Printable page = table.getPrintable(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Fehler beim Drucken", e.getMessage());
        }
    }
    
}
