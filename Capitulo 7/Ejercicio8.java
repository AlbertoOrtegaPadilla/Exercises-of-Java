/**
 * 
 * Ejercicio 8 Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre a continuación un diagrama de barras horizontales con
 * esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
 * carácter.
 * 
 * @author Alberto Ortega Padilla
 */


public class Ejercicio8 {
	
	public static void main (String args[]) {
    
     int[] numero = new int[12];
     int i; 
     int j;
    
      String verde = "\033[32m";
      String naranja = "\033[33m";
      String azul = "\033[34m";
      String morado = "\033[35m";
      String blanco = "\033[37m";
     
     String[] mes = {
       
        "enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        
      };
      
     System.out.print(" \n                  Programa de medición de la temperatura \n\n");
     
     for(i= 0; i<12; i++){
       
       System.out.print(" Introduce la temperatura de  " + mes[i] + " = ");
       
       numero[i]= Integer.parseInt(System.console().readLine());
      }
      
      System.out.print("\n\n                                 (Diagrama)                 ");

      
     for (i = 0; i < 12; i++) {
       
      System.out.printf("                 " + azul + "%12s " + verde + "│", mes[i]);
      
        for (j = 0; j < numero[i]; j++) {
            System.out.print(morado + "▄");
          }
      System.out.println(naranja + " " + numero[i] + "ºC" + blanco);
    }
	}
}

