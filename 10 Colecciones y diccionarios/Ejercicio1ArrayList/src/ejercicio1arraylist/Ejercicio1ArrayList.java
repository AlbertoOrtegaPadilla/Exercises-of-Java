/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1arraylist;
import java.util.ArrayList;
/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio1ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> a = new ArrayList<>();
        
        a.add("Ernesto");
        a.add("Moises");
        a.add("Carlos");
        a.add("Alberto");
        a.add("Cristobal");
        a.add("Christian");
        
        
        System.out.println("Listado de compañeros de clase: ");
        
        for (String nombre : a) {
            
            System.out.println(nombre);
        }
    }
    
}
