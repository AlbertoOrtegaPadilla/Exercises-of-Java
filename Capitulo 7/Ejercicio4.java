/**
 * 
 * 3 arrays de 20 numeros enteros, nombre: numero, cuadrado y cubo, numeros random.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio4{
   public static void main(String[] args){
     
     int[] numero = new int[20];
     int[] cuadrado = new int[20];
     int[] cubo = new int[20];
     int aleatorio;
     
     System.out.print(" Numero aleatorios = \n");
     
     for(int i= 0; i<20; i++){
       
       aleatorio = (int)(Math.random()*101);
       
       numero[i] = aleatorio;
       
       System.out.print(numero[i] + " ");
     }
      
     System.out.print("\n Numero aleatorios al cuadrado = \n");
      
     for(int i= 0; i<20; i++){
       
       aleatorio = (int)(Math.random()*101);
       
       cuadrado[i] = (int) Math.pow(aleatorio, 2);
       
       System.out.print(cuadrado[i] + " ");
     
     }
     
     System.out.print("\n Numero aleatorios al cubo = \n");
      
     for(int i= 0; i<20; i++){
       
       aleatorio = (int)(Math.random()*101);
       
       cubo[i] = (int) Math.pow(aleatorio, 2);
       
       System.out.print(cubo[i] + " ");
     
     }
   }
 }
