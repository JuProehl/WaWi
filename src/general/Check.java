/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import com.sun.javafx.geom.transform.TransformHelper;
import java.util.ArrayList;

/**
 *
 * @author matthias
 */
public class Check {
    
    public static Boolean istNegativ(int wert){
        if (wert < 0){
            general.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
            return true;
        } else {
            return false;
        }
        
    }
    
    public static Boolean istNegativ(ArrayList<Integer> list){
        Boolean b = false;
            for (Integer i : list) {
            if (i < 0) {
                b = true;
                }   
            }
        if (b){
            general.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
        }
            return b;
} 
    
}
