/**
 * 
 * Ejercicio 5 Realiza un programa que rellene un array de 6 filas por 10 columnas con numeros enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuacion, el programa
 * debera dar la posicion tanto del maximo como del minimo.
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class Ejercicio5{
  public static void main(String[] args){


  	int[][] numero= new int[6][10];
  	int fila;
  	int columna;
  	int maximo = Integer.MIN_VALUE; // calcula el maximo automaticamente de los numeros introducidos
    int filaMaximo = 0;
    int columnaMaximo = 0;
    int minimo = Integer.MAX_VALUE; // calcula el minimo automaticamente de los numeros introducidos 
    int filaMinimo = 0;
    int columnaMinimo = 0;

    System.out.print("  ");

    for (columna=0;columna<10;columna++) {
    	
    	System.out.printf("%7d", columna);

    }
  	
  	System.out.println();

    for (columna=0;columna<10;columna++) {
    	
  		System.out.print("________");
    }

  	System.out.println();

  	for(fila=0;fila<6;fila++){

  		System.out.print(fila + "|");

  		for (columna=0;columna<10;columna++) {

  			numero[fila][columna]=(int)(Math.random() * 1001);

        // Calcula el minimo y guarda sus coordenadas
        if (numero[fila][columna] < minimo) {
          minimo = numero[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // Calcula el maximo y guarda sus coordenadas
        if (numero[fila][columna] > maximo) {
          maximo = numero[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }

  			System.out.printf("%7d", numero[fila][columna]);
  		}

  		System.out.println();
  	}


    System.out.println("\n\nEl maximo es " + maximo + " y esta en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El minimo es " + minimo + " y esta en la fila " + filaMinimo + ", columna " + columnaMinimo);

  }
}
