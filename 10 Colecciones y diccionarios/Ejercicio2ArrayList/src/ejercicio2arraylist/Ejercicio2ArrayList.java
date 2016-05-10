/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2arraylist;
import java.util.ArrayList;
/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio2ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma = 0;
        int maximo = 0;
        int minimo = 100;
        int media;
        int tamano = (int)(Math.random()*11 + 10);
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < tamano; i++) {
            
            a.add((int)(Math.random()*101));
        }
        
        System.out.println("Lista generada: " + a);
        
        for(int x : a){
            suma += x;
            
            if (x < minimo) {
                minimo = x;
            }
            
            if (x >maximo) {
                maximo = x;
            }
        }
        
        media = suma / tamano;
        
        System.out.println("La suma de la lista es = " + suma);
        System.out.println("El maximo de la lista es = " + maximo);
        System.out.println("El minimo de la lista es = " + minimo);
        System.out.println("La media de la lista es igual = " + media);
    }
    
}
