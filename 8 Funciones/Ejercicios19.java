/**
 * Ejercicio 19 Conversor de un número a cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios19 {
	
	public static void main (String args[]) {
    
    System.out.print("\n        -Conversor de un número a cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal-");
    
     System.out.print("\n\n        -El numero a introducir es: ");
     System.out.print("\n\n        -1- Decimal ");
     System.out.print("\n        -2- Binario ");
     System.out.print("\n        -3- Hexadecimal ");
     System.out.print("\n        -4- Octal ");
     System.out.print("\n\n        -Opcion: ");
     
     int opcion1= Integer.parseInt(System.console().readLine()); 
     
    System.out.print("\n\n        -Introduce el numero que necesite convertir: ");
    
    String numero = System.console().readLine();
    
    String numeroHexadecimal=numero;
    String numeroOctal = numero;
    int numero2;
    int numeroDecimal = 0;
    int numeroBinario = 0;
    
    if (opcion1 == 1 || opcion1 == 2) {
      
      // numero2 = Long.parseLong(numero);
      numero2 = Integer.parseInt(numero);
      numeroDecimal=numero2;
      numeroBinario=numero2;
    }
    
     System.out.print("\n\n        -Escoge uno de las siguientes opciones a convertir: ");
     System.out.print("\n\n        -1- Decimal ");
     System.out.print("\n        -2- Binario ");
     System.out.print("\n        -3- Hexadecimal ");
     System.out.print("\n        -4- Octal ");
     System.out.print("\n\n        -Opcion: ");
     
     int opcion2= Integer.parseInt(System.console().readLine()); 
     
     
    
    if (opcion1 == 1 && opcion2 == 2){
      
      System.out.println("\n          ■ El siguiente numero decimal: " + numeroDecimal + ", en binario es: " + matematicas.Varias.decimalABinario(numeroDecimal));
    
    }else if (opcion1 == 1 && opcion2 == 3){
      
      System.out.println("\n          ■ El siguiente numero decimal: " + numeroDecimal + ", en hexadecimal es: " + matematicas.Varias.decimalAHexadecimal(numeroDecimal));
    
    }else if (opcion1 == 1 && opcion2 == 4){
      
      System.out.println("\n          ■ El siguiente numero decimal: " + numeroDecimal + ", en octa es: " + matematicas.Varias.decimalAOctal(numeroDecimal));
      
    }else if ( opcion1 == 2 && opcion2 == 1){
      
      System.out.println("\n          ■ El siguiente binario: " + numeroBinario + ", en decimal es: " + matematicas.Varias.binarioADecimal(numeroBinario));
    
    }else if (opcion1 == 2 && opcion2 == 3){
     
      System.out.println("\n          ■ El siguiente binario: " + numeroBinario + ", en hexadecimal es: " + matematicas.Varias.binarioAHexadecimal(numeroBinario));
      
    }else if (opcion1 == 2 && opcion2 == 4){
      
      System.out.println("\n          ■ El siguiente binario: " + numeroBinario + ", en Octal es: " + matematicas.Varias.binarioAOctal(numeroBinario));
      
    }else if (opcion1 == 3 && opcion2 == 1){
      
      System.out.println("\n          ■ El siguiente hexadecimal: " + numeroHexadecimal + ", en decimal es: " + matematicas.Varias.hexadecimalADecimal(numeroHexadecimal));
      
    }else if (opcion1 == 3 && opcion2 == 2){
      
      System.out.println("\n          ■ El siguiente hexadecimal: " + numeroHexadecimal + ", en binario es: " + matematicas.Varias.hexadecimalABinario(numeroHexadecimal));
      
    }else if (opcion1 == 3 && opcion2 == 4){
     
     System.out.println("\n          ■ El siguiente hexadecimal: " + numeroHexadecimal + ", en octal es: " + matematicas.Varias.hexadecimalAOctal(numeroHexadecimal));
      
    }else if (opcion1 == 4 && opcion2 == 1){
      
      System.out.println("\n          ■ El siguiente Octal: " + numeroOctal + ", en decimal es: " + matematicas.Varias.octalADecimal(numeroOctal));
      
    }else if (opcion1 == 4 && opcion2 == 2){
      
      System.out.println("\n          ■ El siguiente Octal: " + numeroOctal + ", en binario es: " + matematicas.Varias.octalADecimal(numeroOctal));
      
    }else if (opcion1 == 4 && opcion2 == 3){
      
      System.out.println("\n          ■ El siguiente Octal: " + numeroOctal + ", en hexadecimal es: " + matematicas.Varias.octalAHexadecimal(numeroOctal));
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
  }
}

