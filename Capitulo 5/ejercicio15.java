/**
 * 
 * Ejercicio15 programa que muestra potencias consecutivas dependiendo del numero que expongas.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
  public class ejercicio15{
   public static void main(String [] args){
     
     int base;
     int exponente=-1;
     int potencia;
        
        System.out.print("\n\n Calcular la potecia con una base y exponente = ");
  
        System.out.print( "\n\n Introduce una base = ");
       
        base=Integer.parseInt(System.console().readLine());
        
        System.out.print(" Introduce un exponente = ");
        
        while (exponente<0) {//repite hasta entero positivo
        
         exponente=Integer.parseInt(System.console().readLine());
         
          if(exponente>0){
            for(int i=1 ; i<exponente + 1; i++){// son las veces que saldra las potencia en aumento +1
          
              potencia = (int)Math.pow(base, i);
              
              System.out.print(" \n " + base + "^" + i + " = " + potencia);
            }
            
          }else{
          
             System.out.print("\n Introduce exponente entero positivo ");
          }
        }
      }
    }
       
