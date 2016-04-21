/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Lagarto extends Animal{
    
  public Lagarto(Sexo s) {
    super(s);
  }

  public void tomaSol() {
    System.out.println("Estoy tomando el Sol");
  }

  public void chapuzon() {
    System.out.println("Que fresquito se esta en el aguaa ^^ ");
  }

  public void escondete() {
    System.out.println("Me he escondido, ya no me puedes ver");
  }

}
