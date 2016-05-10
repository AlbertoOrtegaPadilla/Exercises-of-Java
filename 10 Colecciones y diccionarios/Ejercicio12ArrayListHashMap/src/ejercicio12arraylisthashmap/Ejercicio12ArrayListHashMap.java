/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12arraylisthashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kvothe
 */
public class Ejercicio12ArrayListHashMap {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    
    ArrayList<Carta> partida = new ArrayList<>();
        
        //Crea la primer carta y la guarda en el array
        Carta c = Carta.sirve();
        partida.add(c);
        //Genera las siguientes cartas y se fija que no exista repetición
        for(int x = 0; x < 4; x++) {
            do {
                c = Carta.sirve();
            } while(partida.contains(c));
            partida.add(c);
        }
        
        //Genera el diccionario con los valores de las cartas
        HashMap<String, Integer> brisca = new HashMap<>();
        brisca.put("As", 11);
        brisca.put("3", 10);
        brisca.put("Sota", 2);
        brisca.put("Caballo", 3);
        brisca.put("Rey", 4);
        
        //Muestra las cartas y suma la puntuación
        int puntuacion = 0;
        System.out.println("Cartas repartidas: ");
        for(int i=0; i < partida.size(); i++) {
            System.out.println(partida.get(i));
            if(brisca.containsKey((partida.get(i)).getValor())){
                puntuacion += brisca.get(partida.get(i).getValor());
            }
        }
         System.out.println("Su puntuación es: " + puntuacion);
    
  }
}
