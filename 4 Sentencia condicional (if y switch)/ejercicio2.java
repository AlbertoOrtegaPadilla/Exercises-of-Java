/**
 * 
 * Ejercicio2 programa que pida la hora y se le responda correspondiendo de la hora.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 //buenos días, buenas tardes o buenas noches, 6 a 12, de 13 a 20 y de 21 a 5.
 public class ejercicio2{
   public static void main(String[] args){
     
     System.out.print("\n\n introduce la hora, sin los minutos, ni los segundos");
     System.out.print("\n\n\n ¿ Què hora tiene ?  ");
     
     int hora= Integer.parseInt(System.console().readLine());
     
     if ((hora >= 6 && hora <= 12)) {
       System.out.print("\n ¡buenos dias! ");
     }else if ((hora >=13 && hora <=20)){
       System.out.print("\n ¡buenas tardes! ");
     }else if ((hora >= 21 && hora <=23)){
       System.out.print("\n ¡buenas noches! ");
     }else if ((hora >=1 && hora <=5)) {
       System.out.print("\n ¡buenas noches! ");
     }else if (hora == 00) {
       System.out.print("\n ¡buenas noches! ");
     }else {
       System.out.print("\n\n Lo siento, no introdujo bien la hora");
     }
   }
 }
