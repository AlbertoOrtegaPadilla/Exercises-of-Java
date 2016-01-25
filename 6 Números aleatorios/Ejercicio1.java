/**
 * 
 * Ejercicio1 programa ue muestre la tirada de tres dados.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio1{
   public static void main(String[] args){
     
     System.out.println("\n Muestra 3 numeros aleatorios y hace la suma total = ");

     int dado;
     int suma=0;
     
     for(int i=0; i<3; i++){
       
       dado= ((int)(Math.random()*6)+1);
       
       System.out.println(dado + " ");
       
       suma += dado;
        
     }
     
     System.out.print("\n" + suma);
   }
 }
       
       
