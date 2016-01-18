/*
*
* Ejercicios de Java
*Tema 7 Ejercicio 11
*
*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
*A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
*para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
*desplazando el resto de números (los que no son primos) de tal forma que no se pierda
*ninguno. Al final se debe mostrar el array resultante.
*
*@author Moisés Jiménez
*
*/

public class T7Ej11 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];

    int controlPrimos = 0;
    int controlNoPrimos = 0;

    boolean esPrimo = true;

    for (int i = 0; i < numero.length ; i++ ) { //pide los numeros
      System.out.print("Inserta el numero "+(i+1)+": ");
      numero[i] = Integer.parseInt(System.console().readLine());
      esPrimo = true;
      for (int j = 2; j <= numero[i]/2 ; j++ ) { // comprueba si el numero introducido es primo
        if (numero[i]%j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) { //si es primo lo guarda en el array de primos
        primo[controlPrimos] = numero[i];
        controlPrimos++;
      }
      else { // si no es primo lo guarda en el array de no primos
        noPrimo[controlNoPrimos] = numero[i];
        controlNoPrimos++;
      }
    }
    System.out.println("Los numeros introducidos son: ");
    for (int i = 0 ; i < numero.length; i++ ) {
      System.out.println("Numero "+i+": "+numero[i]);
    }
    System.out.println();
    for (int i = 0; i < controlPrimos ; i++ ) { //reescribe el array general con los primos introducidos.
      numero[i] = primo[i];
    }
    for (int i = 0; i < controlNoPrimos ; i++ ) { //coloca los no primos por donde se quedó en el bucle anterior
      numero[controlPrimos] = noPrimo[i];
      controlPrimos++;
    }
    System.out.print("El nuevo orden es: ");
    for (int n : numero ) {
      System.out.print(n+" ");
    }
  }
}