/**
 * 
 * Ejercicio5 muestra 50 numeros aleatorios entre 100 y 1990
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
  public class Ejercicio5{
   public static void main(String[] args){
     
     System.out.print("\n Muestra 50 numeros aleatorios entre el 100 y el 199 ");
     System.out.print("\n\n(");
     
     int numero;
     int contador=0;
     int media=0;
     int maximo=100;
     int minimo= 199;
     
     for(int i=0; i<50; i++){
       
       numero= (int)(Math.random()*100)+100;
       
       contador += numero;
       media = contador/50;
       
       System.out.print(" " + numero);
       
       if (numero < minimo){
		   
		   minimo = numero;
	   }
	   
	   if (numero > maximo){
		   
		   maximo = numero;
	   }
       
      }
     
      System.out.print(" )");
      System.out.print("\n\n Maximo = " + maximo);
      System.out.print("\n Minimo = " + minimo);
      System.out.print("\n\nLa media = " + media);
      
    }
  }
