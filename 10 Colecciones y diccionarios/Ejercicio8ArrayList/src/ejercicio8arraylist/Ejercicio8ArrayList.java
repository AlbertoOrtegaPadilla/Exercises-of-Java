/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8arraylist;
import java.util.ArrayList;

/**
 *
 * @author Kvothe
 */
public class Ejercicio8ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Carta> c = new ArrayList<>();
    
        Carta cartaAux = new Carta();
        c.add(cartaAux);

        for (int i = 0; i < 39; i++) {
          do {
            cartaAux = new Carta();      
          } while (c.contains(cartaAux));

          c.add(cartaAux);
        }

        for (Carta miCarta: c) {
          System.out.println(miCarta);
        }

    }
    
}
