/**
*
*Ejercicio5 Muestro horario con colores
* 
*@author Alberto Ortega Padilla
* 
*/

public class Ejercicio5 {
 public static void main(String[] args) {
   
   String rojo = "\033[31m";
   String verde = "\033[32m";
   String naranja = "\033[33m";
   String azul = "\033[34m";
   String morado = "\033[35m";
    
   System.out.println(morado + "Lunes\tMartes\tMierc.\tJueves\tViernes");
   System.out.println(azul + "_____\t______\t______\t______\t_______");
   System.out.println(rojo + "FOL\tPROG\tSIN\tPROG\tBBDD");
   System.out.println(verde + "FOL\tPROG\tSIN\tPROG\tBBDD");
   System.out.println(naranja + "FOL\tPROG\tSIN\tPROG\tBBDD");
   System.out.println(morado + "-_-_-_-_-_-_-_-DESCANSO_-_-_-_-_-_-_-_-");
   System.out.println(azul + "PROG\tBBDD\tSIN\tED\tPROG");
   System.out.println(verde + "ED\tBBDD\tLM\tLM\tSIN");
   System.out.println(rojo + "ED\tBBDD\tLM\tLM\tSIN");
   
   System.out.println("\033[37m"); // volvemos al blanco
 }
}
