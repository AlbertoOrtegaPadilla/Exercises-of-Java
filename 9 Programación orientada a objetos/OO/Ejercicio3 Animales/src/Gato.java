/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Gato extends Animal{

  public Gato (Sexo s) {
    super(s);
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  public void peleaCon(Gato contrincante) {
        
        if (this.getSexo() == Sexo.HEMBRA) {

            System.out.println("no me gusta pelear");

        } else {

                if (contrincante.getSexo() == Sexo.HEMBRA) {
                    System.out.println("no peleo contra gatas");
                } else {
                        System.out.println("Veras que zarpazo te doy......ffffzzzzz");
                    }
            }
   }

}
