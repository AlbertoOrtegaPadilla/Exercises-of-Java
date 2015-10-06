/**
 * 
 * Ejercicio5 converor de pesetas a euros.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio5 {
   public static void main(String[] args) {
     
     double pesetas = 2500;
     double euro = pesetas /166.386;
     
     System.out.printf("2500 pesetas son %.2f €", euro);
     // printf y %.2f sirve para limitar los decimales, en este caso 2
   }
 }
