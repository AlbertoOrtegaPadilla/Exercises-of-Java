/**
 * 
 * Ejercicio8 programa para calcular el salario semanal de un trabajador.
 * 
 * @author ALberto Ortega Padilla
 * 
 */
 
 public class ejercicio8{
   public static void main(String[] args){
     
     String linea;
     
     System.out.print("\n Calculo de salario a dar al trabajador por semana");
     System.out.print("\n\n ¿€ por hora de trabajo? = ");
      
      linea = System.console().readLine();
      int €h;
      €h = Integer.parseInt(linea);
     
     System.out.print("\n\n ¿Horas realizadas diariamente? = ");
      
      linea = System.console().readLine();
      int hd;
      hd = Integer.parseInt(linea);
     
     System.out.print("\n\n ¿Dias trabajado en la semana? = ");
     
      linea =System.console().readLine();
      int ds;
      ds = Integer.parseInt(linea);
      
      int total =(€h * hd) * ds;
      
     System.out.print("\n\n Salario acumulado en la semana = " + total + " €");
   }
 }
