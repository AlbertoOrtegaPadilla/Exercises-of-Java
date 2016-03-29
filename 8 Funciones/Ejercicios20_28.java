/**
 * Ejercicios 20-28 Crea una biblioteca de funciones para arrays (de una dimensión) de números enteros que 
 * contenga las siguientes funciones:
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Arrays;

public class Ejercicios20_28 {
	
	public static void main (String args[]) {
    
    int n;
    int maximo;
    int minimo;
    int numero;
    int veces;
    int veces2;
    
    
    System.out.print("\n\n           - Introduce un numero para el tamaño del Array: ");
    n=Integer.parseInt(System.console().readLine());
    
    
    int array[] = new int[n];
    
    
    System.out.print("\n\n           - Introduce un numero maximo para el Array: ");
    maximo=Integer.parseInt(System.console().readLine());
    
    
    System.out.print("\n\n           - Introduce un numero minimo para el Array: ");
    minimo=Integer.parseInt(System.console().readLine());
    
    
    System.out.print("\n\n              ------ARRAY DE UNA DIMENSION------ \n\n");
    matematicas.Arrays.generaArrayInt (n, array, maximo, minimo);
    
    
    System.out.print("            ");
		matematicas.Arrays.mostrarArray(array);
    System.out.println();
    
    
    System.out.print("\n                ------NUMERO MAXIMO DEL ARRAY------ \n\n");
    System.out.print("                                " + matematicas.Arrays.maximoArrayInt(array));
    System.out.println();
    
    
    System.out.print("\n                ------NUMERO MINIMO DEL ARRAY------ \n\n");
    System.out.print("                                " + matematicas.Arrays.minimoArrayInt(array));
    System.out.println();
    
    
    System.out.print("\n                ------MEDIA DEL ARRAY------ \n\n");
    System.out.print("                               " + matematicas.Arrays.mediaArrayInt(array));
    System.out.println();
    
    
    System.out.print("\n                ------Nº DENTRO DEL ARRAY------ \n");
    System.out.print("\n           - Introduce un numero: ");
    numero=Integer.parseInt(System.console().readLine());
    
    
    System.out.println();
    
    if (matematicas.Arrays.estaEnArrayInt(array, numero) == true){
        
        System.out.print("                         El numero " + numero + " se encuentra en el Array. \n\n");
        
    }else{
        
        System.out.print("                         El numero " + numero + " no se encuentra en el Array. \n\n");
        
    }
    
    System.out.println();
    
    System.out.print("\n                ------POSICION DEL NUMERO EN EL ARRAY------ \n\n");
    
    if (matematicas.Arrays.posicionEnArray(array, numero) != -1){
        
        System.out.print("                         El numero " + numero + " se encuentra en la posicion:" + matematicas.Arrays.posicionEnArray(array, numero) + " \n\n");
        
    }else {
        
        System.out.print("                         El numero " + numero + " no se encuentra en ninguna posicion del Array. \n\n");
        
    }
    
    
    System.out.print("\n                ------DAR LA VUELTA AL ARRAY------ \n\n\n");
    System.out.print("\n\n                  ------ARRAY ORIGINAL------ \n\n");
    System.out.print("            ");
		matematicas.Arrays.mostrarArray(array);
    System.out.println();
    
    
    System.out.print("\n\n                  ------ORIGINAL ARRAY------ \n\n");
    System.out.print("            ");
    matematicas.Arrays.volteaArrayInt(array);
    matematicas.Arrays.mostrarArray(array);
    System.out.println();
    
    
    System.out.print("\n\n                  ------ROTACION DE POSICIONES A LA DERECHA------ \n\n");
    System.out.print("\n           - Introduce un numero de veces: ");
    veces=Integer.parseInt(System.console().readLine());
    
    matematicas.Arrays.rotaDerechaArrayInt(array, veces);
    System.out.print("            ");
    matematicas.Arrays.mostrarArray(array);
    System.out.println();
    
    
    System.out.print("\n\n                  ------ROTACION DE POSICIONES A LA IZQUIERDA------ \n\n");
    System.out.print("\n           - Introduce un numero de veces: ");
    veces2=Integer.parseInt(System.console().readLine());
    
    matematicas.Arrays.rotaIzquierdaArrayInt(array, veces);
    System.out.print("            ");
    matematicas.Arrays.mostrarArray(array);
    System.out.println();
    
    
    
    
    
    
  }
}

