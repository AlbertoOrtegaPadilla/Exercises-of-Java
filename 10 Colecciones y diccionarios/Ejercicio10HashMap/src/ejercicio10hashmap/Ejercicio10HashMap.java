/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kvothe
 */
public class Ejercicio10HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        
        String palabra;
        boolean registro = false;
        
        diccionario.put("casa","home");
        diccionario.put("rojo","red");
        diccionario.put("ojo","eye");
        diccionario.put("leche","milk");
        diccionario.put("gato","cat");
        diccionario.put("perro","dog");
        diccionario.put("agua","water");
        diccionario.put("raton","mouse");
        diccionario.put("lenteja","lentil");
        diccionario.put("pastel","pie");
        diccionario.put("arriba","up");
        diccionario.put("abajo","down");
        diccionario.put("sol","sun");
        diccionario.put("verano","summer");
        diccionario.put("cuerpo","body");
        diccionario.put("guerra","war");
        
        
        while(registro != true){
            
            System.out.print("Introduzca la palabra en español: ");
            palabra = s.nextLine();
            
             if (diccionario.containsKey(palabra)) {
                
                System.out.println(palabra + " en inglés es " + diccionario.get(palabra));
                registro = true;
            }else{
                System.out.println("La palabra no esta en el diccionario");
            }
        }
 
    }
    
}
