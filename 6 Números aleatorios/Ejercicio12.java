/**
 * 
 * Ejercicio12 Programa  que rellene la pantalla de caracteres aleatorios (a lo matrix).
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio12{
   public static void main(String[] args) throws InterruptedException {

      int linea = 1;
      
      System.out.print("\033[32m"); // pinta en verde
    
      for(int i = 0; i < 1000000; i++) {
        System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
        
        if (linea++ == 200) {
          
          linea = 0;
          Thread.sleep(100); // Esto le da retardo a la escritura de caracteres
          System.out.println();
        }
      }
    }
  }
