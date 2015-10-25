/**
 * 
 * Ejercicio 10 haga la media de los numeros positivos metidos, parandolo con uno negativo.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio10{
   public static void main(String[] args){
     
      int numeroint=0;
      int numerosum=0;
      int i=0;  
    do {
      
      System.out.print("Dime un número positvo: ");
      numeroint = Integer.parseInt(System.console().readLine());
      
      if (numeroint>=0){
          
         numerosum+=numeroint;
         i++;
       }
    } while (numeroint >= 0);
    
      if(i==0){
        
        System.out.print("no ha sido introducido un numero");
        
      }else
      
      System.out.print("tu media es = " + (numerosum/i));
    }
  }

