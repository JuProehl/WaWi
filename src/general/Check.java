/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

public class Check {
    
    
    
    public static boolean showErrorNegative(int value) {
        boolean r = false;
        r = !general.Check.checkNegative(value);
        if (r) {
            general.Message.showError("Eingabefehler", "Negative Werte sind unzulässig");
        }
        return r;
    }
    public static void showErrorNegative(ArrayList value) {
        if (!general.Check.checkNegative(value)) {
            general.Message.showError("Eingabefehler", "Negative Werte sind unzulässig");
        }
    }
    
    public static boolean checkNegative(int value) {
        boolean back = false;
        if (value < 0) {
            back = true;
        }
        return back;
    }

    public static boolean checkNegative(ArrayList<Integer> value) {
        boolean back = false;
        for (Integer i : value) {
            if (i < 0) {
                back = true;
            }
        }
        return back;
    }
}

