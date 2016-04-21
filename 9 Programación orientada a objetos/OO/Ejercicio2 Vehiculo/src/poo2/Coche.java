package poo2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Coche extends Vehiculo {   
   
  private int cilindrada; 
  
  public Coche(int c) {
    super();
    this.cilindrada = c;
  }

  public void quemaRueda() {
        System.out.println("Estoy quemando rueda y...... ufff... que mal huele");
  }

}
