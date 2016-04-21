/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Canario extends Animal{
  
  public Canario(Sexo s) {
    super(s);
  }

  public void canta() {
    System.out.println("Tralaralariiiiiiii");
  }
  
  public void pia() {
    System.out.println("Pio pio pio");
  }

  public void salta() {
    System.out.println("Salto de esquina a esquina de la bara de la casita");
  }

}
