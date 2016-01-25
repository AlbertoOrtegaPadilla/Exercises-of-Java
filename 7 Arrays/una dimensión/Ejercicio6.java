/**
 * 
 * Ejercicio 6 Escribe y lea 15 numeros por teclado y que los almacene en un array. Rota
 * los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
 * 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio6{
   public static void main(String[] args){
     
     int[] numero = new int[15];
     int i;
     int contador=1;
     
     System.out.println(" Introduce 15 numeros enteros (uno a  uno) = ");
      System.out.print("\n");
     
     for(i= 0; i<15; i++){
       
       System.out.print("Introduce el " + contador + " numero = ");
       
       contador ++;
       
       numero[i]= Integer.parseInt(System.console().readLine());
     }
     
     // rota una posición a la derecha //
     
      int aux = numero[14];
      
      for (i = 14; i > 0; i--) {
        
        numero[i] = numero[i-1];
      }
      
      numero[0] = aux;

      // Muestra el array rotado //
      
      System.out.println("\nArray rotado a la derecha una posición:\n");

      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      
      System.out.println("|");
   }
 }
