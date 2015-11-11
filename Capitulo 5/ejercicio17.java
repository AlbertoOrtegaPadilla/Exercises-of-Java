/**
 * 
 * Ejercicio17 programa que sume los 100 numeros siguientes al numero introducido.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio17{
   public static void main(String[] args){
     
     System.out.print("\n Introduce un numero entero postivo = ");
     
     int numero= Integer.parseInt(System.console().readLine());
     int suma=0;
     
     for(int i=numero + 1; i<=numero + 100; i++){//i=numero+1 sirve para en la suma solo poner i, y el +1 para que cuente el siguiente numero
     
        suma+=i;
      }
      
     System.out.print(" la suma es = " + suma);
   }
 }
     
