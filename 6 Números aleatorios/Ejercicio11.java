/**
 * 
 * Ejercicio11 programa muestra 20 notas generadas al azar.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio11{
   public static void main(String[] args){
     
     int calificacion;
     int suspenso = 0;
     int suficiente = 0;
     int bien = 0;
     int notable = 0;
     int sobresaliente = 0;
     
      System.out.println();
     
     for (int i = 0; i < 20; i++){
       
       calificacion = (int)(Math.random()*6) + 1;
       
       switch (calificacion){
       
         case 1:
           System.out.println(" Suspenso");
           suspenso ++;
           break;
           
         case 2:
           System.out.println(" Suficiente");
           suficiente ++;
           break;
           
         case 3:
           System.out.println(" Bien");
           bien ++;
           break;
           
         case 4:
           System.out.println(" Notable");
           notable ++;
           break;
           
         case 5:
           System.out.println(" Sobresaliente");
           sobresaliente ++;
           break;
           default:
        }
      }
      
      System.out.println("\n Aqui esta la media de las notas: ");
      System.out.println("\n Suspenso: " + suspenso);
      System.out.println(" Suficiente: " + suficiente);
      System.out.println(" Bien: " + bien);
      System.out.println(" Notable: " + notable);
      System.out.println(" Sobresaliente: " + sobresaliente);
    }
  }
         
         
         
