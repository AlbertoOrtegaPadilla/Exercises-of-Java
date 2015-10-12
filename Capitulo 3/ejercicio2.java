/**
 * 
 * Ejercicio2 Conversor de euros a peseta la cantidad se da por teclad
 * 
 * @author Alberto Ortega Padilla
 * 
 */

import java.util.Scanner;

public class ejercicio2{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    
    System.out.print("\nIntroduce una cantidad en pesetas para pasarlo a €: ");
    
      double pesetas= s.nextDouble();
      
      double conversor= pesetas/166.386;
      
    System.out.printf("\nEl cambio aproximado sera: %.2f €", conversor);
  }
}
      
