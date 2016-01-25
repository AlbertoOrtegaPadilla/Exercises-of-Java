/**
 * 
 * Ejercicio 5 programa que calcule el area de un rectangulo.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 import java.util.Scanner;
 
 public class ejercicio5 {
   public static void main(String[] args){
    Scanner s= new Scanner(System.in);
   
   System.out.println("\n Para calcular el area de un rectangulo, necesitamos dos datos: h y b");
   System.out.print("\n El valor de h = ");
   
     double h= s.nextDouble();
    
   System.out.print("\n El valor de b = ");
    
     double b= s.nextDouble();
    
     double area= h * b;
    
   System.out.print("\n la formula es a = b*h");
   System.out.print("\n\n Resultado area = " + area);
 }
}
