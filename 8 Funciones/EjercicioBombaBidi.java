/**
 * Ejercicio 29-34 Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de
 * números enteros que contenga las siguientes funciones.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Arrays;

  public class EjercicioBombaBidi {
    public static void main (String args[]) {
      
      
      int filas;
      int columnas;
      int minimo;
      int maximo;
      
      System.out.print("\nIntroduzca las coordenadas para el array. ");
      
      System.out.print("\nFila: ");
      
      filas = Integer.parseInt(System.console().readLine());
      
      System.out.print("Columna: ");
      
      columnas = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduzca el número mínimo del array: ");
      
      minimo = Integer.parseInt(System.console().readLine());
    
      System.out.println("Introduzca el número máximo del array: ");
      
      maximo = Integer.parseInt(System.console().readLine());
      
      int array[][] = new int[filas][columnas];
    
      matematicas.Arrays.generaArrayBiInt(array, filas, columnas, minimo, maximo);
      matematicas.Arrays.mostrarArrayBiInt(array);
      
      System.out.println();
      
    
      System.out.print("\nIntroduzca las coordenadas donde quiere hacer explotar la bomba numerica. ");
      
      System.out.print("\nFila: ");
      
      int uFila = Integer.parseInt(System.console().readLine());
      
      System.out.print("Columna: ");
      
      int uColumna = Integer.parseInt(System.console().readLine());
      
      matematicas.Arrays.ArrayBiIntBomba(array, uFila, uColumna, filas, columnas);
      System.out.println();
      System.out.println();
      matematicas.Arrays.mostrarArrayBiInt(array);
    }
		
  }

