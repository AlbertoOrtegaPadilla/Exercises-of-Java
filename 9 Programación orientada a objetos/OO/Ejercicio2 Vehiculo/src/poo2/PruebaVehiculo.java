package poo2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class PruebaVehiculo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        int opcion = 0;
        int km;
        Scanner s = new Scanner(System.in);
    
        Bicicleta monty = new Bicicleta(10);
        Coche ford = new Coche(2000);
        
        
        while (opcion != 8) {
            
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
      
            opcion = Integer.parseInt(s.nextLine());
      
            switch (opcion) {
              case 1:
                System.out.print("¿Cuantos Kilometros quiere recorrer? ");
                km = Integer.parseInt(s.nextLine());
                monty.recorre(km);
                break;
              case 2:
                monty.hazCaballito();
                break;
              case 3:
                System.out.print("¿Cuantos Kilometros quiere recorrer? ");
                km = Integer.parseInt(s.nextLine());
                ford.recorre(km);
                break;
              case 4:
                ford.quemaRueda();
                break;
              case 5:
                System.out.println("La bicicleta lleva recorridos ");
                System.out.println(monty.getKilometrosRecorridos() + " Km");
                break;
              case 6:
                System.out.println("El coche lleva recorridos ");
                System.out.println(ford.getKilometrosRecorridos() + " Km");
                break;
              case 7:
                System.out.println("Los vehÃ­culos llevan recorridos ");
                System.out.println(Vehiculo.getKilometrosTotales() + " Km");
              default:
            } // switch
          } // while

    }
}
