/**
 * 
 * Ejercicio 10 conversor de Mb a Kb
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 import java.util.Scanner;
 
 public class ejercicio10{
   public static void main(String[] args){
     
     Scanner s= new Scanner(System.in);
     
     System.out.print("\n conversor de Mb a Kb :");
     System.out.print("\n\n Mb = ");
     
      double Mb= s.nextDouble();
      double Kb= Mb * 1000;
      
     System.out.print("\n\n Kb = " + Kb + " Kbyte");
   }
 }
     
      
     
