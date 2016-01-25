/**
 * 
 * Ejercicio9 programa que calcula el volumen de un cono
 * 
 * @author Albero Ortega Padilla
 * 
 */

public class ejercicio9{
  public static void main(String[] args){
    
    
    System.out.print("\n Calcula el volumen de un cono saien que el diametro del cono es 8 y la altura es 10");
    System.out.print("\n\n Formula V = 1/3 * π * r² *h"); 
    System.out.print("\n\n r = ");
    
      double r= Double.parseDouble(System.console().readLine());
      
    System.out.print("\n\n h = ");
    
      double h = Double.parseDouble(System.console().readLine());
      
      double total= ((1 * 3.14)/3) * (r * r) * h;
      
    System.out.printf("\n\n El volumen del cono es = %.2f", total);
  }
}
      
