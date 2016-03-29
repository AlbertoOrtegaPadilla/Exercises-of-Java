/**
 * Ejercicio 16 Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios16 {
	
	public static void main (String args[]) {
    
    System.out.print("\n        -Muestra los números capicúa que hay entre 1 y 99999-");
    
    int num=1;
    
    System.out.println("\n\n          ■ El primer numero capicua es: " + num); 
    
    for (int i = 1; i <= 99999 ; i++){
      
      if (matematicas.Varias.esCapicua(num) && num!=1){
        
        System.out.println("\n          ■ El siguiente numero capicua es " + num);
      
      }
        
        num++;
    }
  }
}
