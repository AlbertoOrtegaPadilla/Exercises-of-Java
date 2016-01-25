/**
 * 
 * Ejercicio4 programa muestra 20 numeros aleatorios entre el 0 y el 10
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio4{
   public static void main(String[] args){
     
     System.out.print("\n Muestra 20 numeros aleatorios entre el 0 y el 20 ");
     System.out.print("\n\n(");
     
     int numero;
     
     for(int i=0; i<20; i++){
       
       numero= ((int)(Math.random()*20)+0);
       
       System.out.print(" " + numero);
       
     }
     
     System.out.print(" )");
   }
 }
