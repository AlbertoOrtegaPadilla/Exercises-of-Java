/**
 * 
 * Ejercicio 4 Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 * aparezcan en la pantalla con un pequeno retardo, dando la impresion de que el ordenador
 * se queda pensando antes de mostrar los numeros.
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class Ejercicio4 {
  public static void main(String[] args) 
    throws InterruptedException { //  Esta linea para poder usar sleep para retardar


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

          Thread.sleep(100);

        }  
        
          System.out.printf("|%6d\n", sumFila);

          Thread.sleep(500);
      }
      
      for(columna = 0; columna < 5; columna++) {
        
        System.out.print("_______");
      }
        System.out.println("_______");
      
        for(columna = 0; columna < 5; columna++) {
          sumColumna = 0;
          
          for(fila = 0; fila < 4; fila++) {
            
            sumColumna += n[fila][columna];
          }

          sumTotal += sumColumna;
          
          System.out.printf("%6d ", sumColumna);

          Thread.sleep(500);
        
        }
        
        System.out.printf("|%6d", sumTotal);
  }
}