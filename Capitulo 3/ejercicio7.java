/**
 * 
 * Ejercicio7 hacer un programa para una factura a partir de la base imponible.
 * 
 * @author ALberto Ortega Padilla
 * 
 */
 
 import java.util.Scanner;
 
 public class ejercicio7{
   public static void main(String[] args){
   Scanner s= new Scanner(System.in);
     
     System.out.print("\n  IEBRO, S.L.                         ________________________________________");
     System.out.print("\n\n                                    AL SERVICIO DE LA INDUSTRIA METALURGICA ");
     System.out.print("\n\n\n Factura         Fecha");
     System.out.print(" A/201106         31/05/2011");
     System.out.print("\n\n\n\n        CONCEPTOS               UDS/KGS        PRECIO        IMPORTE");
     System.out.print("\n\n        MOBILIARIO               1,00        5.150,110        5.150,11");
     System.out.print("\n\n\n\n");
     System.out.print("                                                         BASE ");
      
      float mobi= s.nextFloat();
      
      
      double iva = mobi * 0.21;
      
     System.out.printf("                                                          IVA %.2f", iva);
     
      double total = mobi + iva;
      
     System.out.printf("                                                                   TOTAL %.2f", total);
   }
 }
