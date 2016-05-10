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
public class Carta {
  
    // ATRIBUTOS DE CLASE
    private static ArrayList<String> palosPosibles = new ArrayList<>();
    private static ArrayList<String> valoresPosibles = new ArrayList<>();
    
    //ATRIBUTO DE INSTANCIA
    private String palo;
    private String valor;    
    
    //CONSTRUCTOR
    public Carta(String p, String v) {
      this.palo = p;
      this.valor = v;
    }
    
    //GETTER
    public String getPalo() {
      return palo;
    }
    public String getValor() {
      return valor;
    }
    
    // SE AÑADEN PALOS Y VALORES A LOS ARRAYS  Y SE GENERA UNA CARTA ALEATORIA.
    public static Carta sirve() {
        //Se añaden palos y valores a los arrays
        palosPosibles.add("Espada");
        palosPosibles.add("Basto");
        palosPosibles.add("Oro");
        palosPosibles.add("Copa");
        valoresPosibles.add("As");
        valoresPosibles.add("2");
        valoresPosibles.add("3");
        valoresPosibles.add("4");
        valoresPosibles.add("5");
        valoresPosibles.add("6");
        valoresPosibles.add("7");
        valoresPosibles.add("Sota");
        valoresPosibles.add("Caballo");
        valoresPosibles.add("Rey");
        //Se elige aleatoriamente el palo y el valor
        String p = palosPosibles.get((int)(Math.random()*4));
        String v = valoresPosibles.get((int)(Math.random()*10));
        //Se crea la carta y se devuelve
        Carta c = new Carta(p, v);
        return c;
    }

    // MUESTRA LA CARTA
    @Override
    public String toString() {
      return this.valor + " de " + this.palo + ".";
    }
    
    // COMPROBAMOS QUE LA CARTA NO SE REPITE, PRIMERO COMPRUEBA EL NUMERO Y DESPUES EL PALO 
    @Override
    public boolean equals(Object d) {
      return ((this.valor).equals(((Carta)d).getValor())&&(this.palo).equals(((Carta)d).getPalo()));
    }
    
    // ORDENA POR PALO Y DESPUES POR NUMERO DE MENOR A MAYOR LAS CARTAS.
    public int compareTo(Carta c) {
        
        if((this.palo.equals(c.palo))){
            //Genera un diccionario para darle valor a los Strings de las cartas
            HashMap<String, Integer> valorNumerico = new HashMap<>();
            valorNumerico.put("As", 1);
            valorNumerico.put("2", 2);
            valorNumerico.put("3", 3);
            valorNumerico.put("4", 4);
            valorNumerico.put("5", 5);
            valorNumerico.put("6", 6);
            valorNumerico.put("7", 7);
            valorNumerico.put("Sota", 10);
            valorNumerico.put("Caballo", 11);
            valorNumerico.put("Rey", 12);
            return (valorNumerico.get((this.valor)).compareTo(valorNumerico.get(c.getValor())));
        } else {
            return (this.palo).compareTo(c.getPalo());
        }
    }
}
