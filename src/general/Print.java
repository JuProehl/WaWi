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
// Klasse Print
// Enthält Methoden zum Drucken von Tabellen
public class Print {

    // Klassenvariablen
    // header: Für die Kopfzeile des Ausdrucks
    // footer: Für die Fußzeile des Ausdrucks
    MessageFormat header;
    MessageFormat footer;

    // Konstruktor der Klasse Print
    // header: In der Kopfzeile wird der übergebene String angegeben
    // footer: In der Fußzeile werden die Seitenzahl angegeben
    public Print(String Header) {
        this.header = new MessageFormat(Header);
        this.footer = new MessageFormat("Seite {0,number,integer}");
    }

    // Methode CreatePages
    // Übergabeparameter: JTable 
    // Tabelle, welche gedruckt werden soll
    public void CreatePages(JTable table) {

        try {
            // Druckkontext aufrufen
            // Für den Druck wird der Header und Footer angefügt
            table.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Fehler beim Drucken", e.getMessage());
        }
    }
}
