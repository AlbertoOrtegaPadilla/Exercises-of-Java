/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public abstract class Tiempo {
        
    private int hora = 0;
    private int minuto = 0;
    private int segundos = 0;
        
   public Tiempo (int h, int m, int s){
       
        this.hora = h;
        this.minuto = m;
        this.segundos = s;
    }
   
   @Override
    public String toString() {
        
        return "Hora: " + this.hora + " h " + this.minuto + " m " + this.segundos + " s.";
     }
    
    
   public void suma() {
    
    int x1 = this.hora;
    int y1 = this.minuto;
    int z1 = this.segundos;
    
    int conjunto = (x1 * 10000) + (y1 * 100) + (z1);
    
    int x2 = h;
    int y2 = m;
    int z2 = s;
    
    int conjunto2 = (x2 * 10000) + (y2 * 100) + (z2);
    
    int suma = conjunto + conjunto2;
    
    int contador = 0;
    
       while (x2 != suma) {           
           
           suma /= 10000;
    
           x2 = suma;
       }
       
       suma = conjunto + conjunto2;
       
       while (y2 != suma) {           
           
           for (int i = 1; i <= 6; i++) {
               
               if (y2 != 0) { 
                   contador ++;
               }
           }
           
           if (contador == 6) {
               
               suma %= 100;
               
           } else if (contador == 5){
               
               suma %= 10;
           }
           
           suma /= 100;
    
           y2 = suma;
       }
       
       suma = conjunto + conjunto2;
       
       while (z2 != suma) {
           
           if (contador == 6) {
               
               suma %= 10000;
               
           } else if (contador == 5){
               
               suma %= 1000;
           }
           
           z2 = suma;
       }
       
       System.out.println("Hora: " + x2 + " h " + y2 + " m " + z2 + " s.");
    
    
    }
}
