/**
 * 
 * Ejercicios 1-14 Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones.
 * Recuerda que puedes usar unas dentro de otras si es necesario.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios1_14 {
	
	public static void main (String args[]) {
    
    
    System.out.print("\n\n Introduce un numero: ");
    
    
    
    int num= Integer.parseInt(System.console().readLine());
    
    System.out.print("\n ------¿CAPICUA?------ \n");
    
    if (matematicas.Varias.esCapicua(num)) {
      
      System.out.println("\n          ■ El numero es capicúa");
    
    }else{
        System.out.println("\n          ■ El numero no es capicúa");
      
      }
    System.out.println();
      
      
      
    System.out.print("\n ------¿PRIMO?------ \n");
    
    if (matematicas.Varias.esPrimo(num)) {
      
      System.out.println("\n          ■ El numero es primo");
    
    }else{
        System.out.println("\n          ■ El numero no es primo");
      
      }
    
    System.out.println();
    
    
    
    System.out.print("\n ------¿SIGUIENTE PRIMO?------ \n");
    
		System.out.println("\n          ■ El siguiente primo mayor de " + num + " es " + matematicas.Varias.siguientePrimo(num));
    System.out.println();
    
    
    
    System.out.print("\n ------¿POTENCIA?------ \n");
    
    int elevado= Integer.parseInt(System.console().readLine());
    
		System.out.println("\n          ■ La potencia de " + num + " elevado a " + elevado + " es " + matematicas.Varias.laPotencia(num));
    System.out.println();
	}
}

