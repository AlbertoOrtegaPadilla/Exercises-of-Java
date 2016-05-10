/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Kvothe
 */
public class Carta implements Comparable<Carta>{
    
    private static ArrayList<String> palosPosibles = new ArrayList<>();
    private static ArrayList<String> valoresPosibles = new ArrayList<>();
    
    private String numero;
    private String palo;

    public Carta(String p, String v) {
      this.numero = v;
      this.palo = p;
    }

    public String getNumero() {
      return numero;
    }

    public String getPalo() {
      return palo;
    }
    
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

    @Override
    public String toString() {
      return this.numero + " de " + this.palo + ".";
    }
    
    // COMPROBAMOS QUE LA CARTA NO SE REPITE PRIMERO EL NUMERO Y DESPUES EL PALO
    
    @Override
    public boolean equals(Object d) {
      return ((this.numero).equals(((Carta)d).getNumero())&&(this.palo).equals(((Carta)d).getPalo()));
    }
    
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
            return (valorNumerico.get((this.numero)).compareTo(valorNumerico.get(c.getNumero())));
        } else {
            return (this.palo).compareTo(c.getPalo());
        }
    }


}
