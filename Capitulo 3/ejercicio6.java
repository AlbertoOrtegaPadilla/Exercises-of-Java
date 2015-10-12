/**
 * 
 * Ejercicio6 programa quecalcula el area de un triangulo.
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class ejercicio6{
  public static void main(String[] args){
    
    String linea;
    
    System.out.print("\n Calcular el area de un triangulo");
    System.out.print("\n\n la formaula es (b * h)/2");
    System.out.print("\n\n b = ");
      
      linea = System.console().readLine();
      int b;
      b = Integer.parseInt(linea);
    
    System.out.print(" h = ");
    
      linea = System.console().readLine();
      int h;
      h = Integer.parseInt(linea);
      
      int total;
      total = (b*h)/2;
      
    System.out.print("\n\n Resultado del area = " + total);
  }
}
