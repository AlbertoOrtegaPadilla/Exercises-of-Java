/**
 * 
 * Ejercicio13 progrmaa que determine una lista de diez numero y determine cuantos son positivos, y cuantos negativos
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio13{
   public static void main(String[] args){
     
      System.out.println(" \n\n Introduce 10 numeros : ");
     
      int neg=0;
      int pos=0;
      int num;
      
     for (int i=0; i<10; i++){
       
       System.out.print("\n ");
       
          num=Integer.parseInt(System.console().readLine());

       if (num<0){;
          
          neg++;
        
        } else {
          
            pos++;
          
          }
      }
        
     System.out.print( "\n Hay " + neg + " numeros negativos y " + pos + " numeros positivos. ");
    }
  }
      
