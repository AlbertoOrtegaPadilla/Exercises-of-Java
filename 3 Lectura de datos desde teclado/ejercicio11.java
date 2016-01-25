/**
 * 
 * Ejercicio11 conversor de Kb a Mb
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio11{
   public static void main(String[] args){
     
     System.out.print("\n Conversor de Kb a Mb: ");
     System.out.print("\n\n Kb = ");
      double Kb= Double.parseDouble(System.console().readLine());
      double Mb= Kb/1000;
     System.out.print("\n\n Mbyte = " + Mb);
   }
 }
