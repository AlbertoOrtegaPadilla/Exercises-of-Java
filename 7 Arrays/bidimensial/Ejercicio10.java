/**
 * 
 * Ejercicio 10 Realiza el juego de las tres en raya.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class Ejercicio10 {
  
    static final String X = "X";
    static final String O = "O";
    static final String HUECO = " ";
	
	public static void main (String args[]) {
		
    String[][] tablero = new String [3][3];
    int fila;
    int columna;
    String nombreFila = "CBA";
    String coordenadas;
    int movimiento = 0;
    boolean jugador1Gana = false;
    boolean jugador2Gana = false;
    
    for (fila = 0; fila <3; fila++){
      
        for (columna = 0; columna < 3; columna++){
          
          tablero[fila][columna] = HUECO;
        }
    }
    
    System.out.println("\n\n");     
    System.out.println("   \"JUEGO DE 3 EN RAYAS\" \n\n");
         
    for (fila = 0; fila <3; fila++){
          
      System.out.println("      ───   ───   ───");
          
      System.out.print("   " + nombreFila.charAt(fila));
          
      for (columna = 0; columna < 3; columna++){
              
        System.out.print(" | " + tablero[fila][columna] + " |");
              
      }
      System.out.println(""); 
      System.out.println("      ───   ───   ───");
    }
        
         System.out.println("       1     2     3 ");
     
     do{
        
        System.out.println("\n\n   JUGADOR X : "); 
                
        System.out.print("\n   Cordenadas : ");
        coordenadas = System.console().readLine();
        int filaY = nombreFila.indexOf(coordenadas.charAt(0));
        int columnaX = coordenadas.charAt(1) - 1 - 48;
        tablero[filaY][columnaX] = X;
        movimiento++;
        
        System.out.println("\n\n");     
         System.out.println("   \"JUEGO DE 3 EN RAYAS\" \n\n");
         
        for (fila = 0; fila <3; fila++){
          
         System.out.println("      ───   ───   ───");
          
          System.out.print("   " + nombreFila.charAt(fila));
          
            for (columna = 0; columna < 3; columna++){
              
              System.out.print(" | " + tablero[fila][columna] + " |");
              
            }
         System.out.println(""); 
         System.out.println("      ───   ───   ───");
        }
        
         System.out.println("       1     2     3 ");
        
        // comprueba si gana el jugador 1 
        jugador1Gana = (
        
          (tablero[0][0] == X) && (tablero[0][1] == X) && (tablero[0][2] == X) ||
          (tablero[1][0] == X) && (tablero[1][1] == X) && (tablero[1][2] == X) ||
          (tablero[2][0] == X) && (tablero[2][1] == X) && (tablero[2][2] == X) ||
          (tablero[0][0] == X) && (tablero[1][0] == X) && (tablero[2][0] == X) ||
          (tablero[0][1] == X) && (tablero[1][1] == X) && (tablero[2][1] == X) ||
          (tablero[0][2] == X) && (tablero[1][2] == X) && (tablero[2][2] == X) ||
          (tablero[0][0] == X) && (tablero[1][1] == X) && (tablero[2][2] == X) ||
          (tablero[0][2] == X) && (tablero[1][1] == X) && (tablero[2][0] == X)
          
        );
        
        if (!jugador1Gana && (movimiento < 9)) {
          
          System.out.println("\n\n   JUGADOR O : "); 
          
          System.out.print("\n   Cordenadas : ");
          coordenadas = System.console().readLine();
          filaY = nombreFila.indexOf(coordenadas.charAt(0));
          columnaX = coordenadas.charAt(1) - 1 - 48;
          tablero[filaY][columnaX] = O;
          movimiento++;
          
          System.out.println("\n\n");     
          System.out.println("   \"JUEGO DE 3 EN RAYAS\" \n\n");
         
          for (fila = 0; fila <3; fila++){
            
           System.out.println("      ───   ───   ───");
            
            System.out.print("   " + nombreFila.charAt(fila));
            
              for (columna = 0; columna < 3; columna++){
                
                System.out.print(" | " + tablero[fila][columna] + " |");
                
              }
             System.out.println(""); 
             System.out.println("      ───   ───   ───");
          }
          
           System.out.println("       1     2     3 ");
           
            // comprueba si gana el jugador 2
            jugador2Gana = (
            
              (tablero[0][0] == O) && (tablero[0][1] == O) && (tablero[0][2] == O) ||
              (tablero[1][0] == O) && (tablero[1][1] == O) && (tablero[1][2] == O) ||
              (tablero[2][0] == O) && (tablero[2][1] == O) && (tablero[2][2] == O) ||
              (tablero[0][0] == O) && (tablero[1][0] == O) && (tablero[2][0] == O) ||
              (tablero[0][1] == O) && (tablero[1][1] == O) && (tablero[2][1] == O) ||
              (tablero[0][2] == O) && (tablero[1][2] == O) && (tablero[2][2] == O) ||
              (tablero[0][0] == O) && (tablero[1][1] == O) && (tablero[2][2] == O) ||
              (tablero[0][2] == O) && (tablero[1][1] == O) && (tablero[2][0] == O)
              
            );
      
        }

      }while( !jugador1Gana && !jugador2Gana && (movimiento < 9));
      
      if (jugador1Gana){
        
        System.out.print("\n\n  ¡¡¡ Ha ganado el Jugador \"X\" !!!");
        
      }else if (jugador2Gana){
        
          System.out.print("\n\n  ¡¡¡ Ha ganado el Jugador \"O\" !!!");
        
        }else{
          
          System.out.print("\n\n  ¡¡¡ La partida quedo en \"EMPATE\" !!!");
          
        }
	}
}

