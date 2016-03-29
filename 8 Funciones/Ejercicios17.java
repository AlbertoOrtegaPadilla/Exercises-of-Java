/**
 * Ejercicio 17 Escribe un programa que pase de binario a decimal.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios17 {
	
	public static void main (String args[]) {
    
    System.out.print("\n        -Programa que pase de binario a decimal.-");
    
    System.out.print("\n\n        -Introduce un numero binario: ");
    
    int numeroBinario = Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ El siguiente binario: " + numeroBinario + ", en decimal es: " + matematicas.Varias.binarioADecimal(numeroBinario));
  }
}

