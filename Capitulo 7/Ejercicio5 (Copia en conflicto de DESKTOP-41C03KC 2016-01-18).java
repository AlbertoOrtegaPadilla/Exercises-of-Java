/**
 * 
 * Ejercicio5 10 números por teclado y que luego muestre los números
 * introducidos junto con las palabras máximo y mínimo al lado del máximo y del mínimo
 * respectivamente.
 * 
 * @author ALberto Ortega Padilla
 * 
 */
 
 public class Ejercicio5{
   public static void main(String[] args){
     
     int[] numero = new int[15];
     int maximo = Integer.MIN_VALUE; // calculca el maximo automaticamente de los numeros introducidos
     int minimo = Integer.MAX_VALUE; // calculca el minimo automaticamente de los numeros introducidos
     int i;
     
     System.out.println(" Introduce 15 numeros enteros (uno a  uno) = ");
      System.out.print("\n");
     
     for(i= 0; i<15; i++){
       
       System.out.print(" ");
       
       numero[i]= Integer.parseInt(System.console().readLine());
       
       if(numero[i] > maximo){
         
         maximo = numero[i];
        }
       
       if(numero[i] < minimo){
         
         minimo = numero[i];
        }
      }
     System.out.print("  _______________________________________________________________________\n\n");
     
     //muestra a partir de aqui tanto los 15 numeros introducidos, como el maximo y el minimo
     
     for(i= 0; i<15; i++){
        
        System.out.print("         " + numero[i]);
        
        if(numero[i] == maximo){
          
          System.out.print(" maximo");
        }
        
        if(numero[i] == minimo){
          
          System.out.print(" minimo");
        }
         System.out.println();
      }
   }
 }
