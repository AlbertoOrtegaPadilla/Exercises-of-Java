/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8arralist2forma;

import java.util.ArrayList;

/**
 *
 * @author Kvothe
 */
public class Ejercicio8ArraList2forma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Carta> misCartas = new ArrayList<Carta>();
    
        Palo palo = null;
        int valor = 0;

        for(int i = 0; i < 10; i++){

          do{
            valor = (int)((Math.random() * 12) + 1);
          }while((valor == 8) || (valor == 9));

          switch((int)(Math.random() * 4) + 1){
            case 1:
              palo = Palo.OROS;
              break;
            case 2:
              palo = Palo.BASTOS;
              break;
            case 3:
              palo = Palo.COPAS;
              break;
            case 4:
              palo = Palo.ESPADAS;
              break;
            default:
          }

          boolean repetida = false;

          for(Carta c : misCartas){
            if(c.equals(new Carta(palo, valor))){
              repetida = true;
            }
          }

          if(!repetida){
            misCartas.add(new Carta(palo, valor));
          }
        }

        for(Carta c : misCartas){
          System.out.println(c);
        }
    }
    
}
