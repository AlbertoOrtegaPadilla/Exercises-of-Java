/**
 * Caballo.java
 * 
 * Copyright 2016 K <k@k-VirtualBox>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Caballo {
  
  // atributos /////////////////////////////
  
  String color, raza, sexo;
  int edad;
  double peso;
  
  // métodos ///////////////////////////////
  
  // constructor
  
  Caballo (String s) {
  
    this.sexo = s;
  }
  // getter
  
  String getSexo() {
  
    return this.sexo;
  }
  
  /**
   * Hace que el Caballo saluda.
   */
  void saluda() {
    
    System.out.println("hihihihiiiihii");
  }
  
  /**
   * Hace que el Caballo resopla.
   */
  void resopla() {
  System.out.println("fuufiffuu");
  }
  
  /**
   * Hace que el caballo coma.
   * A los caballos les gusta las zanahorias, si le damos otra comida
   * la rechazará.
   *
   * @param comida: la comida que se le ofrece al caballo
   */
  void come(String comida) {
    if (comida.equals("zanahoria")) {
      System.out.println("Hmmmm, gracias");
    } else {
        System.out.println("Puagghh...." + comida);
        System.out.println("Lo siento, yo solo como zanahorias");
      }
  }
}

