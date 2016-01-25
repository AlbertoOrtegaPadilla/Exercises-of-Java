/**
 * 
 * array 10 numeros por teclado y luego los muestre en orden inverso.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio3{
   public static void main(String[] args){
     
     int[] num = new int[10];
     
     for(int i=0; i<9; i++){
       
       System.out.print(" Introduce un numero entero: ");
       
       num[i] = Integer.parseInt(System.console().readLine());
     }
     
     System.out.print("\n Muestra de numeros introducido a la inversa = ");
     
     for(int i=8; i>=0; i--){
       
       System.out.print(num[i]);
     }
   }
 }
