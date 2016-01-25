/**
 * 
 * Ejercicio7 programa que muestre tres apuestas,(por estetica hice mas) de la quiniela en tres columnas para los 14 partidos y pleno al quince (15 filas)
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio7{
   public static void main (String[] args){
      
      int columnas= 9;
      int resultados;
     
     System.out.print("\n 1ª Liga BBVA/Calcio      Jornada 2.º     Fecha: 31-8-15 ");
     System.out.print("\n\n");
     
     for (int fila = 1; fila <= 15; fila++) {
        
        System.out.printf("  %10d. |", fila);
      
        if (fila == 15) {
         
         columnas = 1;
        }
      
        for (int apuesta = 1; apuesta <= columnas; apuesta++) {
          
          resultados = (int)(Math.random() * 3) + 1;
          
          switch(resultados) {
            
            case 1:
              System.out.print("1**|");
              break;
            
            case 2:
              System.out.print("**2|");
              break;
            
            case 3:
              System.out.print("*X*|");
              break;
          }
        }
        System.out.println();
      }
    }
  }

      
      
        
