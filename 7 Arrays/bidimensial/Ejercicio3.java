/**
 * 
 * Ejercicio 3 Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class Ejercicio3{
  public static void main(String[] args){

      int[][] n = new int[4][5];
      int columna;
      int fila;
      int sumFila;
      int sumColumna;
      int sumTotal =0;
      
      
      for(fila = 0; fila < n.length; fila++){
      
        for(columna = 0; columna < n[fila].length; columna++){
          
          n[fila][columna] = (int)(Math.random() * 900) + 100;
        }
      }
      
      for(fila = 0; fila < n.length; fila++){
        
         System.out.println();
         
         sumFila = 0;
      
        for(columna = 0; columna < n[fila].length; columna++){
          
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
