/**
 * EJercicio 14 programa introduce base y exponente y calcule la potencia
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */
 
 public class ejercicio14{
   public static void main(String [] args){
     
     int base;
     int exponente=-1;
     int potencia;
        
        System.out.print("\n\n Calcular la potecia con una base y exponente = ");
  
        System.out.print( "\n\n Introduce una base = ");
       
        base=Integer.parseInt(System.console().readLine());
        
        System.out.print(" Introduce un exponente = ");
        
        while (exponente<0) {
        
         exponente=Integer.parseInt(System.console().readLine());
         
          if(exponente>0){
          
            potencia = (int)Math.pow(base, exponente);
            
                 System.out.print(" \n Solucion = " + potencia);
          }else{
          
             System.out.print("\n Introduce exponente entero positivo ");
          }
        }
      }
    }
       

     
