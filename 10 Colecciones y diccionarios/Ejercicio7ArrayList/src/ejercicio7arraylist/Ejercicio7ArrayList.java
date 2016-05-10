/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7arraylist;
import java.util.ArrayList;
/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ejercicio7ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Moneda> m = new ArrayList<>();
        
        //CREA UN ARRAYLIST AUX
        Moneda monedaAux = new Moneda();
        m.add(monedaAux);    
        // System.out.println(monedaAux);

        // INTRODUCE LA POSICION Y CANTIDAD DE M.ADD(MONEDAAUX) PARA DESPUES EN EL WHILE EL SIGUIENTE NUMERO NO SEA IGUAL EN AMBOS, SOLO EN UNO DE ELLOS.
        String ultimaPosicion = monedaAux.getPosicion();
        String ultimaCantidad = monedaAux.getCantidad();
        
        // System.out.println(ultimaPosicion);
        // System.out.println(ultimaCantidad);
        
        
        for (int i = 0; i < 5; i++) {
          do {
            monedaAux = new Moneda();
          } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));

          m.add(monedaAux);
          ultimaPosicion = monedaAux.getPosicion();
          ultimaCantidad = monedaAux.getCantidad();
        }

        for (Moneda mo : m) {
          System.out.println(mo);
        }
    }    
}
