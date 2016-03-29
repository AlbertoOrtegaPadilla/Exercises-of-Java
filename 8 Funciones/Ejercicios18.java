/**
 * Ejercicio 18 Escribe un programa que pase de decimal a binario.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios18 {
	
	public static void main (String args[]) {
    
    System.out.print("\n        -Programa que pase de decimal a binario.-");
    
    System.out.print("\n\n        -Introduce un numero decimal: ");
    
    long numeroDecimal = Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ El siguiente numero decimal: " + numeroDecimal + ", en binario es: " + matematicas.Varias.decimalABinario(numeroDecimal));
  }
}

