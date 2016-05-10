/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8arralist2forma;

/**
 *
 * @author Kvothe
 */
public class Carta {
    
    private Palo palo;
    private int valor;

    public Carta(Palo palo, int valor){
      this.palo = palo;
      this.valor = valor;
    }

    public Palo getPalo(){
      return palo;
    }

    public int getValor(){
      return valor;
    }

    public boolean equals(Carta c) {
      return (this.palo).equals(c.getPalo()) && (this.valor == c.getValor());
    }

    @Override
    public String toString(){

      String v = "";

      switch (this.valor){
        case 1:
          v = "As";
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          v = String.valueOf(this.valor);
          break;
        case 10:
          v = "Sota";
          break;
        case 11:
          v = "Caballo";
          break;
        case 12:
          v = "Rey";
          break;
        default:
          break;  
      }

      return v + " de " + String.valueOf(this.palo);
    }
}
