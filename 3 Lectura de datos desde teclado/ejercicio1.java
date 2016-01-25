/**
 * 
 * Ejercicio1 programa que pida dos numeros y luefo muestre el resultado de la multiplicacion.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class ejercicio1 {
  public static void main(String[] args){
    
    String linea;
     
    System.out.print("\nPara multiplicar necesitamos que pongas dos numeros:");
   
    
    System.out.print("\n\nIntroduce pirmer numero entero: ");
      linea = System.console().readLine();
      int prNumero;
      prNumero = Integer.parseInt (linea);
    
    System.out.print("\nIntroduce segundo numero entero: ");
      linea = System.console().readLine();
      int segunNumero;
      segunNumero = Integer.parseInt (linea);
    
      int Total = prNumero * segunNumero;
    
    System.out.println("\nTotal de la multiplicacion = " + Total);
  }
}
    
    
    
    
    
