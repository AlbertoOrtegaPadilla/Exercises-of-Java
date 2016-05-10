/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio11HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        HashMap<String, String> m = new HashMap<>();

        m.put("ordenador", "computer");
        m.put("gato", "cat");      
        m.put("rojo", "red");
        m.put("árbol", "tree");
        m.put("pingüino", "penguin");
        m.put("sol", "sun");
        m.put("agua", "water");
        m.put("viento", "wind");
        m.put("siesta", "siesta");
        m.put("arriba", "up");
        m.put("ratón", "mouse");
        m.put("estadio", "arena");
        m.put("calumnia", "aspersion");
        m.put("aguacate", "avocado");
        m.put("cuerpo", "body");
        m.put("concurso", "contest");
        m.put("cena", "dinner");
        m.put("salida", "exit");
        m.put("lenteja", "lentil");
        m.put("cacerola", "pan");
        m.put("pastel", "pie");
        m.put("membrillo", "quince");

        int i;
        int numero;

        // guarda las claves en un Array de String
        String[] a = m.keySet().toArray(new String[0]);
        
        System.out.println(Arrays.toString(a));
        // genera 5 números aleatorios que no se repiten
        ArrayList<Integer> n = new ArrayList<>();
        n.add((int)(Math.random()*22));
        
        System.out.println(n);
        
        for (i = 0; i < 4; i++) {
          do {
            numero = (int)(Math.random()*22);
          } while (n.contains(numero));
          n.add(numero);
        }
        
        System.out.println(n);
        System.out.println();
        
        
        // muestra las palabras en español y pregunta por su traducción
        int puntos = 0;
        System.out.println("Mostraré la palabra en español y usted tendrá que traducirla al inglés.");
        for (i = 0; i < 5; i++) {
          System.out.print(a[n.get(i)] + ": ");
          String palabraIntro = s.nextLine();
          if (palabraIntro.equals(m.get(a[n.get(i)]))) {
            System.out.println("¡Correcto!");
            puntos++;
          } else {
            System.out.println("Respuesta incorrecta :(");
            System.out.println("La respuesta correcta es " + m.get(a[n.get(i)]));
          }
        }

        System.out.println("Ha obtenido " + puntos + " puntos.");

    }
    
}
