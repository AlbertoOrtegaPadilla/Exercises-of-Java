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
public class Bicicleta extends Vehiculo {
    
  private int pinones; // nÃºmero de piÃ±ones
  
  public Bicicleta(int p) {
    super();
    this.pinones = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
  
}
