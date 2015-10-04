/**
 * 
 * Ejercicio9 crear algun tipo de escena
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio9 {
   public static void main(String[] args) {
     
     String rojo = "\033[31m";
     String naranja = "\033[33m";
     
     System.out.println(rojo + "");
     System.out.println(rojo + "        *");
     System.out.println(rojo + "       *^*");
     System.out.println(rojo + "      *^^^*");
     System.out.println(rojo + "     *^^^^^*");
     System.out.println(rojo + "    *^^^^^^^*");
     System.out.println(naranja + "   *¨¨¨¨¨¨¨¨¨*");
     System.out.println(naranja + "   *  o __ o *");
     System.out.println(naranja + "   *   ! .!  *");
     System.out.println(naranja + "   *___!__!__*");
     
     System.out.println("\033[37m"); //blanco
   }
}
