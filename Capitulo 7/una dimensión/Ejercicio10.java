/**
 * 
 * Ejercicio 10 programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 * almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
 * primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class Ejercicio10 {
	
	public static void main (String args[]) {
    
    int[] numero = new int[20];
    int aleatorio;
    int i;
    int[] par = new int[20];
    int[] impar = new int[20];
    int pares = 0;
    int impares = 0;
    
    System.out.print( "\n  20 Numeros aleatorios : \n\n");
    
    for(i=0; i<20; i++){
      
      aleatorio = (int)(Math.random()*101);
      
      numero [i] = aleatorio;
      
      // Divide y Almacena los pares e impares
      
      if (numero[i] % 2 == 0) {
        
        par[pares++] = numero[i];
        
      } else {
        
        impar[impares++] = numero [i];
        
      }
    }
    
    for (i = 0; i < 20; i++) {
      
      System.out.print(numero[i] + "  ");
    }
    
    // Pares en las primeras posiciones del array original.
    
    for (i = 0; i < pares; i++) {
      
      numero[i] = par[i];
    }
    
    System.out.println("  ");
    
    // Impares en los huecos que quedan.
    
    for (i = pares; i < 20; i++) {
      
      numero[i] = impar[i - pares];
    }

    // Resultado.
  
    for (i = 0; i < 20; i++) {
      
      System.out.print(numero[i] + "  ");
    }
		
    
	}
}

