/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.awt.TextField;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.print.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaTray;
import javax.print.attribute.standard.Sides;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
}
