/**
 * 
 * Ejercicio 9 programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    int matriz[][] = new int [12][12];
    int fila;
    int columna;
    int aux1;
    int aux2;
    int capa;
    
    
    System.out.println("\n\n            Array original (matriz cuadrada 12x12) ");
    System.out.println("  -------------------------------------------------------------");
    
    for (fila = 0; fila < 12; fila++){
     
     System.out.print("|");
     
       for (columna = 0; columna < 12; columna++){
         
         matriz[fila][columna] = (int)(Math.random()*101);
         
         System.out.printf("%5d", matriz[fila][columna]);
         
       }
        System.out.println("   |");
    }
    
    for(capa = 0; capa < 6; capa++) {
      
      // rota por arriba
      aux1 = matriz[capa][11 - capa];
      for (fila = 11 - capa; fila > capa; fila--) {
        matriz[capa][fila] = matriz[capa][fila - 1];
      }
        
      // rota por la derecha      
      aux2 = matriz[11 - capa][11 - capa];
      for (fila = 11 - capa; fila > capa + 1; fila--) {
        matriz[fila][11 - capa] = matriz[fila - 1][11 - capa];
      }
      matriz[capa + 1][11 - capa] = aux1;
      
      // rota por abajo
      aux1 = matriz[11 - capa][capa];
      for (fila = capa; fila < 11 - capa - 1; fila++) {
        matriz[11 - capa][fila] = matriz[11 - capa][fila + 1];
      }
      matriz[11 - capa][11 - capa - 1] = aux2;
        
      // rota por la izquierda
      for (fila = capa; fila < 11 - capa - 1; fila++) {
        matriz[fila][capa] = matriz[fila + 1][capa];
      }
      matriz[11 - capa - 1][capa] = aux1;
    }
    
    System.out.println("\n\n       Array rotado en el sentido de las agujas del reloj");
    System.out.println("  -------------------------------------------------------------");

    for(fila = 0; fila < 12; fila++) {
      
      System.out.print("|");
      
      for(columna = 0; columna < 12; columna++) {
        
        System.out.printf("%5d", matriz[fila][columna]);
      }
      System.out.println("   |");
    }
    
	}
}

