/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9arraylist;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kvothe
 */
public class Ejercicio9ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Carta> partida = new ArrayList<>();
        
        //CREA LA PRIMERA CARTA Y LA GUARDA EN EL ARRAY
        Carta c = Carta.sirve();
        partida.add(c);
        //GENERA LAS SIGUIENTES CATAS Y SE FIJA QUE NO EXISTA REPETICIONES
        for(int x = 0; x < 39; x++) {
            do {
                c = Carta.sirve();
            } while(partida.contains(c));
            partida.add(c);
        }
        
        //MUESTRA LAS CARTAS ORDENADAS
        Collections.sort(partida);
    
        System.out.println("Cartas repartidas: ");
        for(int i=0; i < partida.size(); i++) {
            System.out.println(partida.get(i));
        }
    }
}
