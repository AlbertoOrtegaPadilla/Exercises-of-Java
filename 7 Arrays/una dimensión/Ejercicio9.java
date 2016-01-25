/**
 * 
 * Ejercicio 9 programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra “par” o “impar” según proceda.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    int numero [] = new int[8];
    int i;
    int contador =1;
    
    System.out.print("\n  Introduce 8 numeros por teclado = \n\n");
    
    for (i=0; i<8; i++){
      
      System.out.print("  Introduce el " + contador + " numero = ");
      
      contador ++;
      
      numero [i]= Integer.parseInt(System.console().readLine());
    }
    
    System.out.print(" \n\n ");
    
    for(i=0; i<8; i++){
      
      if ( numero [i] % 2 == 0 ){
        
        System.out.println( "  El numero " + numero [i] + " es \"PAR\"");
        
      }else {
        System.out.println( "  El numero " + numero [i] + " es \"IMPAR\" ");
      }
    }
	}
}

