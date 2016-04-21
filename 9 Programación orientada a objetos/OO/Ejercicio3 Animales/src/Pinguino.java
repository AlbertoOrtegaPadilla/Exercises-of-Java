/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Pinguino extends Animal{
    
    public Pinguino(Sexo s) {
        super(s);
     }

    
    public void vuela() {
            
            System.out.println("Los pingüino no pueden volar.");
    }

    public void caza() {
        
      if (this.getSexo() == Sexo.HEMBRA) {
            
            System.out.println("Soy una pingüina, no cazo.");
        }else{
            
            System.out.println("MARCHANDO UNAS DE ARENQUES!!!.");
        }
    }
    
    public void corteja() {
        
      if (this.getSexo() == Sexo.HEMBRA) {
            
            System.out.println("Yo soy la dama, eso es cosa de ellos.");
        }else{
            
            System.out.println("Ok, ya veras que estilo tengo!!.");
        }
    }

}
