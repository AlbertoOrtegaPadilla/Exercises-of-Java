/**
 * 
 * Ejercicio6 calcula una acura a partir de la base imponible(precio sin IVA)
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio6 {
   public static void main(String[] args) {
     
     double consumo = 167.45;
     double potencia = 20.09;
     double impElect = 9.59;
     double alqEquip = 1.08;
     double iva = (consumo + potencia + impElect + alqEquip) * 0.21;
     
     double total = consumo + potencia + impElect + alqEquip + iva;
     
     System.out.printf("\nTotal Factura = %.2f € con el 21%% IVA", total);
     //Si da problema signos en la variable, se hace doble, ejemplo %%.
   }
 }
   
   
   
