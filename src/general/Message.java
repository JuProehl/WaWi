/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import javax.swing.JOptionPane;

/**
 *
 * @author Marc Czolbe
 */
// Klasse Message
// Enthält Methoden zur Ausgabe von Info/Error-Messageboxen
public class Message {

    // Methode showError
    // Gibt bei Aufruf eine Fehler-Messagebox aus mit Informationen für
    // den Anwender
    // Übergabeparameter: String errortitle, String errortext
    // errortitle: Titel der Messagebox 
    // errortext: Informationtext zum Fehler für den Anwender
    public static void showError(String errortitle, String errortext) {
        JOptionPane.showMessageDialog(null, errortext, errortitle, JOptionPane.ERROR_MESSAGE);
    }
    
    // Methode showSuccess
    // Gibt bei Aufruf eine Info-Messagebox aus mit Informationen für
    // den Anwender
    // Übergabeparameter: String successtitle, String successtext
    // successtitle: Titel der Messagebox 
    // successtext: Informationstext für den Anwender
    public static void showSuccess(String successtitle, String successtext) {
        JOptionPane.showMessageDialog(null, successtext, successtitle , JOptionPane.INFORMATION_MESSAGE);
    }
}
