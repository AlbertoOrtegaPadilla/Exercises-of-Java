/**
 * 
 * Ejercicio3 Conversor de pesetas a euros a pesetas.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 import java.util.Scanner;
 
 public class ejercicio3 {
   public static void main(String[] args){
     Scanner s= new Scanner(System.in);
     
     System.out.print("\nPon una cantidad que quieras pasar de € a pesetas: ");
     
     int euros= s.nextInt();
     int Total= euros * 166;
     
     System.out.print("\nLa cantidad aproximada en pesetas es: " + Total + " pesetas");
   }
 }
