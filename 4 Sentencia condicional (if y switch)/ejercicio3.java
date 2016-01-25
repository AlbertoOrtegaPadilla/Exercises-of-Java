/**
 * 
 * Ejercicio3 1 al 7 corresponediendo al dia de semana.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio3 {
   public static void main(String[] args){
     
       System.out.print("\n Elije un numero ");
     
       int n= Integer.parseInt(System.console().readLine());
    
     if (n<1 || n>7) {
       System.out.print("\n\n Lo siento, repita numero, pero esta vez del 1 al 7, gracias = ");
       n = Integer.parseInt(System.console().readLine());
     }if (n==1){
       System.out.print("\n\n Lunes ");
     }else if (n==2){
       System.out.print("\n\n Martes ");
     }else if (n==3){
       System.out.print("\n\n Miercoles ");
     }else if (n==4){
       System.out.print("\n\n Jueves ");
     }else if (n==5){
       System.out.print("\n\n Viernes ");
     }else if (n==6){
       System.out.print("\n\n Sabado ");
     }else if (n==7){
       System.out.print("\n\n Domingo ");
     }
   }
 }
