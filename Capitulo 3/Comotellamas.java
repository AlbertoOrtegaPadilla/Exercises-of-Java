/**
 * 
 * Ejempo de lectura de texto
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Comotellamas {
   public static void main(String[] args){
     
     String nombre;
     
     System.out.print("Hola, ¿Cómo te llamas?");
     nombre = System.console().readLine();
     //System.console().readLine() funciona en consolas y terminales, pero para 
     //IDEs como Eclipse, Netbeans, JavaEdit, puede provocar problemas.
     System.out.println("Hola, "+ nombre +", encantado");
   }
 }
