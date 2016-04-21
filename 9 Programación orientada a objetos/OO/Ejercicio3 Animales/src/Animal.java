/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public abstract class Animal {

    private Sexo sexo;
    
    public Animal (){
        this.sexo = Sexo.MACHO ;
    }
    
    public Animal (Sexo s){
        this.sexo = s;
    }
    public Sexo getSexo() {
        return this.sexo;
      }
    
    public void duerme() {
            
     System.out.println("Zzzzzzz........ZZzzzzzZzzzzzz....");

    }

    public void come(String comida) {
        
      System.out.println("MMMMmmmmmm " + comida);
    }

    
}
