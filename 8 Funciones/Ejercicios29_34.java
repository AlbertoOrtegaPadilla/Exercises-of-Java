/**
 * Ejercicio 29-34 Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de
 * números enteros que contenga las siguientes funciones.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Arrays;

public class Ejercicios29_34 {
		
	public static void main (String args[]) {
    
    int filas;
    int columnas;
    int minimo;
    int maximo;
    
    System.out.println("Introduzca el número de filas del array: ");
    filas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el número de columnas del array: ");
    columnas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el número mínimo del array: ");
    minimo = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el número máximo del array: ");
    maximo = Integer.parseInt(System.console().readLine());
    
    int array[][] = new int[filas][columnas];
    
    matematicas.Arrays.generaArrayBiInt(array, filas, columnas, minimo, maximo);
    matematicas.Arrays.mostrarArrayBiInt(array);
    
    System.out.println();
    
    
    
    int fila;
    
    System.out.println("¿Qué fila desea mostrar?");
    fila = Integer.parseInt(System.console().readLine());
    
    matematicas.Arrays.filaDeArrayBiInt(array, fila);
    
    System.out.println();
    
    
    
    int columna;
    
    System.out.println("¿Qué columna desea mostrar?");
    columna = Integer.parseInt(System.console().readLine());
    
    matematicas.Arrays.columnaDeArrayBiInt(array, columna);
    
    System.out.println();
    
    
    
    int numero;
    
    System.out.println("¿Qué número desea buscar?");
    numero = Integer.parseInt(System.console().readLine());
    
    int[] coordenadas = matematicas.Arrays.coordenadasEnArrayBiInt(array, numero);
    
    System.out.println("El número " + numero + " se encuentra en las " + "coordenadas {" + coordenadas[0] + "," + coordenadas[1] + "}");
    
    System.out.println();
    
    System.out.print("El número " + numero);
    
    if(!(matematicas.Arrays.esPuntoDeSilla(numero, minimo, columna))){
      
      System.out.print(" no es punto de silla.");
      
    }else {
      
      System.out.println(" es punto de silla.");
    }

    
    System.out.println("¿Qué diagonal quiere mostrar? (NOSE - NESO)");
    String diagonal = System.console().readLine();
    
    matematicas.Arrays.mostrarArray(matematicas.Arrays.diagonal(array, diagonal));
  
  }
}

