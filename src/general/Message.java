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
public class Message {
    
    public static void showError(String errortitle, String errortext){
        JOptionPane.showMessageDialog(null, errortext, errortitle, JOptionPane.ERROR_MESSAGE);
    }
}
