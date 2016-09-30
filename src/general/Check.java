/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.ArrayList;

/**
 *
 * @author matthias
 */
// Klasse Check
// Entfält Methoden zur Überprüfung von Falscheingaben durch den Nutzer
public class Check {

    // Methode istNegativ
    // Überprüft den übergebenen Integer, ob dieser negativ ist
    // Bei 
    // Übergabeparameter: int wert
    // wert: der zu überprüfende Wert
    // Rückgabewert: boolean
    // true: Übergebener Wert ist negativ
    // false: Übergebener Wert ist positiv inkl. 0
    public static Boolean istNegativ(int wert) {
        if (wert < 0) {
            general.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
            return true;
        } else {
            return false;
        }
    }

    // Methode istNegativ
    // Überprüft die übergebenen Integer der ArrayList, ob diese negativ sind
    // Übergabeparameter: ArrayList<Integer> list
    // list: ArrayList mit Integer, welche überprüft werden sollen
    // Rückgabewert: boolean
    // true: ein übergebener Integer in der ArrayList is negativ
    // false: die übergebenen Integer in der ArrayList sind postiv
    public static Boolean istNegativ(ArrayList<Integer> list) {
        Boolean b = false;
        for (Integer i : list) {
            if (i < 0) {
                b = true;
            }
        }
        if (b) {
            general.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
        }
        return b;
    }

}
