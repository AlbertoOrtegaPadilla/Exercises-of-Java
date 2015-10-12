/**
 * 
 * Lectura de texto con nombre y edad, aplicandolo al IDEs
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 import java.util.Scanner;
 
 public class NombreyEdad {
   public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    
     String rojo = "\033[31m";
     String azul = "\033[34m";
     String blanco = "\033[37m";
     
    System.out.print(rojo + "\nIntroduce tu nombre y tu edad separados por un espacio: ");
    
    String nombre = s.next();
    int edad = s.nextInt();
    
    System.out.println(azul + "\ntu nombre es " + rojo + nombre + azul + " y tu edad es " + rojo + +edad);
    System.out.println(blanco);
  }
}
