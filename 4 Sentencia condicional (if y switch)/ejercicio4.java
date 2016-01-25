/**
 * 
 * EJercicio4 relacion ejercicio 8, pero la hora puede ser 12 euros o 16 euros.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class ejercicio4{
   public static void main(String[] args){
     
        System.out.print("\n Calculo de salario a dar al trabajador por semana");
        System.out.print("\n\n ¿Horas realizadas diariamente? = ");
      
        int €h = Integer.parseInt(System.console().readLine());
     
      if (€h >= 1 && €h <=40){
        
        int total= €h * 12;
        System.out.print("\n\n Salario acumulado en la semana = " + total + " €");
        
      }if (€h >= 40){
        
        int total= €h * 16;
        System.out.print("\n\n Salario acumulado en la semana = " + total + " €");
      }
   }
 }
