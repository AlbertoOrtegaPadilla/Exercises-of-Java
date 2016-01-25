/**
 * 
 * Ejercicio1 números enteros de 3 filas por 6 columnas con nombre num y asigna
 * los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio1{
   public static void main(String[] args){
     
     int[][] n = new int[3][6]; // array de 3 filas por 6 columnas
     
     n[0][0]=0;
     n[0][1]=30;
     n[0][2]=2;
     n[0][5]=5;
     n[1][0]=75;
     n[1][4]=0;
     n[2][2]=-2;
     n[2][3]=9;
     n[2][5]=11;
     
     int columna;
     int fila;
     
     System.out.print("         ");
     
     for(columna = 0; columna < 6; columna++){
       
       System.out.print("  Columna" + columna);
      } 
       
      for(fila = 0; fila < 3; fila++){
         
        System.out.print(" \nfila" + fila);
         
        for(columna = 0; columna < 6; columna++) {
        
            System.out.printf("%9d ", n[fila][columna]);
          }
      }
    }
  }
       
       
