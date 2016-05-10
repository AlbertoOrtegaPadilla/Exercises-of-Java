/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio3ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int numero;
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Introduce el " + (i + 1) + " numero: ");
            
            numero = Integer.parseInt(s.nextLine());
            
            a.add(numero);
        }
        
        System.out.println("Lista generada: " + a);
        
        Collections.sort(a);
        
        System.out.println("Lista ordenada de menor a mayor: " + a);
        
        ArrayList<Integer> b = new ArrayList<>();
        
        for (int x : a){
            b.add(0, x);
        }
        
        System.out.println("Lista ordenada de menor a mayor: " + b);
    }
    
}
