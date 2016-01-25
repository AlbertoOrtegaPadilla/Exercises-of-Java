/**
 * 
 * Ejercicio2 20 numeros enteros. Estos numeros se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrara las sumas parciales de filas y
 * columnas igual que si de una hoja de calculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class Ejercicio2{
  public static void main(String[] args){
    
      int[][] n = new int[4][5];
      int columna;
      int fila;
      int sumFila;
      int sumColumna;
      int sumTotal =0;
      
      
      for(fila = 0; fila <4; fila++){
      
        for(columna = 0; columna < 5; columna++){
          
          n[fila][columna] = Integer.parseInt(System.console().readLine());  
          
        }
      }
      
      for(fila = 0; fila < 4; fila++){
        
         System.out.println();
         
         sumFila = 0;
      
        for(columna = 0; columna < 5; columna++){
          
          System.out.printf("%6d ", n[fila][columna]);
          
          sumFila += n[fila][columna];

        }  
        
          System.out.printf("|%6d\n", sumFila);
      }
      
      for(columna = 0; columna < 5; columna++) {
        
        System.out.print("__________");
      }
        System.out.println("__________");
      
        for(columna = 0; columna < 5; columna++) {
          sumColumna = 0;
          
          for(fila = 0; fila < 4; fila++) {
            
            sumColumna += n[fila][columna];
          }

          sumTotal += sumColumna;
          
          System.out.printf("%6d ", sumColumna);
        
        }
        
        System.out.printf("|%6d", sumTotal);
    }
  }
