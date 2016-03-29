/**
 * Ejercicio 15 Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios15 {
	
	public static void main (String args[]) {
		
    System.out.print("Muestra los números primos que hay entre 1 y 1000.");
    
    int num=2;
    
    System.out.println("\n\n          ■ El primer primo es: " + num); 
    
    for (int i = 0; i <999 ; i++){
      
      if (matematicas.Varias.esPrimo(num)){
        
        System.out.println("\n          ■ El siguiente primo mayor de " + num + " es " + matematicas.Varias.siguientePrimo(num));
      
      }
        
        num++;
    }
	}
}

