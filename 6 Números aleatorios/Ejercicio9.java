/**
 * 
 * Ejercicio9 programa genera numero aleatorio pares entre 0 y 100 y que no termine de genera hasta que saque 24. ademas debera decir al final cuanto numeros genero
 * 
 * @author ALberto Ortega Padilla
 * 
 */
 
 public class Ejercicio9{
   public static void main(String[] args){
     
     
     int numero = 0;
     int contador = 0;
     
     while (numero != 24){
     
       numero= (int)(Math.random()*50) *2;
       System.out.print(" " + numero);
       
       contador++;
      }  
       System.out.print(" se han generado " + contador + " numeros antes de salir el 24. ");

    }
  }
