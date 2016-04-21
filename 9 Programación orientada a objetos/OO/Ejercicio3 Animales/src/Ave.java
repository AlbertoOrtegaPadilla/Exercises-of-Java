/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Ave extends Animal{
    
    public Ave(Sexo s) {
        super(s);
      }

  public void ponHuevo() {
      
    if (this.getSexo() == Sexo.MACHO) {
        
      System.out.println("Soy macho, no puedo poner huevos");
    } else {
      System.out.println(".....uff!!! puse un huevo!. :D");
    }
  }
  
  public void limpiate() {
    System.out.println("Me estoy limpiando las plumas");
  }
  
  public void vuela() {
    System.out.println("Estoy volando");
  }

}
