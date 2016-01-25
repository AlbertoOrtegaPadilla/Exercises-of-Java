/**
 * 
 * Ejercicio 1 programa que pida un dia de la semana y diga la asignatura que toca
 * 
 * @author Alberto Ortega Padilla
 * 
 */

public class ejercicio1{
  public static void main(String[] args){
    
    System.out.print("\n\n Por favor introduce un dia de entre semana = ");
    String dia= System.console().readLine();
    
    String asignatura1;
    
    switch(dia){
      
      case "lunes":
      asignatura1= "lengua";
      break;
      
      case "martes":
      asignatura1= "Matematicas";
      break;
      
      case "miercoles":
      asignatura1= "Fisica";
      break;
      
      case "jueves":
      asignatura1= "Ingles";
      break;
      
      case "viernes":
      asignatura1= "Filosofia";
      break;
      
      default:
      asignatura1= " ¡no hay clase ese dia! ";
    }
    
    System.out.print("\n\n Los " + dia + " se tiene " + asignatura1 + " a primera hora.");
  }
}   
    
