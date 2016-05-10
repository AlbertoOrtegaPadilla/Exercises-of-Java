/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio4ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner s = new Scanner(System.in);
        
        String palabra;
        
        ArrayList<String> a = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Introduce la palabra nº " + (i + 1) + " numero: ");
            
            palabra = s.nextLine();
            
            a.add(palabra);
        }
        
        System.out.println("Lista de palabras generadas: " + a);
        
        Collections.sort(a);
        
        System.out.println("Lista de palabras ordenadas de menor a mayor: " + a);
        
        ArrayList<String> b = new ArrayList<>();
        
        for (String x : a){
            b.add(0, x);
        }
        
        System.out.println("Lista de palabras ordenadas de menor a mayor: " + b);
    }
}
