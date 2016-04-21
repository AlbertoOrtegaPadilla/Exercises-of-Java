/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Perro extends Animal{
 
  public Perro (Sexo s) {
    super(s);
  }

  public void ladra() {
    System.out.println("Guau guau");
  }

  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }
  
  public void bebe(){
          
         System.out.println("Que sed tenia, gracias por el agua !!"); 

  }
}
