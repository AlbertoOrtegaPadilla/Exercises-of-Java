/**
 * 
 * Ejercicio 11 programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
 * para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
 * desplazando el resto de números (los que no son primos) de tal forma que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


  public class Ejercicio11 {
    
    public static void main (String args[]) {
      
      int[] numero = new int [10];
      int[] primo = new int[10];
      int[] noPrimo = new int[10];
      int i;
      int j;
      int contador = 1;
      int indice = 0;
      int indice2 = 0;
      int primos = 0;
      int noPrimos = 0;
      boolean esPrimo = true;
      
      System.out.print("\n");
            
      for(i=0; i<10; i++){
        
              
        System.out.print("  Introduce el " + contador + " numero = ");
        
        numero [i]= Integer.parseInt(System.console().readLine());
        
        contador ++;
        
        esPrimo = true;
        
          for ( j = 2; j <= numero[i]/2 ; j++ ) { // comprueba si el numero introducido es primo
              
              if (numero[i]%j == 0) {
                
                  esPrimo = false;
                
              }
              
              if (esPrimo) { //si es primo lo guarda en el array de primos
                
                primo[primos] = numero[i];
                
                primos++;
                
              }else { // si no es primo lo guarda en el array de no primos
                
                noPrimo[noPrimos] = numero[i];
                
                noPrimos++;
              }
            }
            
          System.out.println("\n\n  Los numeros introducidos son: \n\n");
          
          for (i = 0 ; i < numero.length; i++ ) {
            
            System.out.println("  Numero "+i+": "+numero[i]);
          }
          
          System.out.println();
          
          for (i = 0; i < primos ; i++ ) { //reescribe el array general con los primos introducidos.
            
            numero[i] = primo[i];
            
          }
          
          for (i = 0; i < noPrimos ; i++ ) { //coloca los no primos por donde se quedó en el bucle anterior
            
            numero[primos] = noPrimo[i];
            
            primos++;
            
          }
          System.out.print("\n\n  El nuevo orden es: ");
          
          for (int n : numero ) {
            
            System.out.print(n+" ");
            
          }
      }
    }
  }

    
    
