/**
 * 
 * Ejercicio 9 programa que indica cuantos digitos tiene el numero introducido pro teclado
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
  public class ejercicio9{
    public static void main(String [] args){
     
         System.out.print(" Introduce una cifra = ");
     
         int cifra=Math.abs(Integer.parseInt(System.console().readLine()));
         int contador = 0;//contador.
      
      while(cifra!=0){   //mientras no se quede en 0 sigue.
       
         cifra=cifra/10;
         contador ++;
      }
         System.out.print("la cifra tiene " + contador + " digitos");
    }
  }
