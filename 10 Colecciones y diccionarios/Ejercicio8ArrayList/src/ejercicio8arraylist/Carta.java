/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8arraylist;
import java.util.Objects;
/**
 *
 * @author Kvothe
 */
public class Carta {
    
    private static String[] numerosTotales = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palosTotales = {"bastos", "copas", "espadas", "oros"};
    
    private String numero;
    private String palo;

    public Carta() {
      this.numero = numerosTotales[(int)(Math.random()*10)];
      this.palo = palosTotales[(int)(Math.random()*4)];
    }

    public String getNumero() {
      return numero;
    }

    public String getPalo() {
      return palo;
    }

    @Override
    public String toString() {
      return this.numero + " de " + this.palo + ".";
    }
    
    
    @Override
    public boolean equals(Object obj) {
      /* if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }*/
      final Carta other = (Carta) obj;
      if (!Objects.equals(this.numero, other.numero)) {
        return false;
      }
      if (!Objects.equals(this.palo, other.palo)) {
        return false;
      }
      return true;
    }


    
}
