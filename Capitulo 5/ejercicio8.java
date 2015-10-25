/**
 * 
 * Ejercicio tabla de multiplicar
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio8{
   public static void main(String[] args){
     
        System.out.print("Introduce un muero = ");
        int num= Integer.parseInt(System.console().readLine());
      
      for(int i=1; i<=10; i++){
        
        System.out.println("\n" + num + " * " + i + " = " + (num*i));
      }
    }
  }
