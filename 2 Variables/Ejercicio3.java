/**
 * 
 * Ejercicio3 Igual que el Ejercicio2 pero mostrando tambien telefono.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio3 {
   public static void main(String[] args) {
     
     String rojo = "\033[31m";
     String blanco = "\033[37m";
     
     String nombre ="Alberto";
     String apellido ="Ortega Padilla";
     int telefono = 661776819;
     
     System.out.println("\n\nMi nombre es " + rojo + nombre);
     System.out.println(blanco + "Mi apellido es " +rojo + apellido);
     System.out.println(blanco + "Mi telefono es " +rojo + telefono);
     System.out.println(blanco);
   }
 }
