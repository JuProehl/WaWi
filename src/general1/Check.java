/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general1;

import com.sun.javafx.geom.transform.TransformHelper;
import java.util.ArrayList;

/**
 *
 * @author matthias
 */
public class Check {
    
    public static Boolean istNegativ(int wert){
        if (wert < 0){
            general1.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
            return true;
        } else {
            return false;
        }
        
    }
    
    public static Boolean istNegativ(ArrayList<Integer> List){
        Boolean b = false;
            for (Integer i : List) {
            if (i < 0) {
                b = true;
                }   
            }
        if (b){
            general1.Message.showError("Eingabefehler", "Die Eingabe ist Negativ!");
        }
            return b;
} 
    
}
