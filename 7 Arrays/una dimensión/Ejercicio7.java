/**
 * 
 * Ejercicio 7 Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 * 
 * @author Alberto Ortega Padilla
 * 
 */


public class Ejercicio7{
	
	public static void main (String args[]) {
    
     int[] numero = new int[100];
     int aleatorio;
     int i;
     
     System.out.print(" Numero aleatorios = \n\n");
     
     for(i= 0; i<100; i++){
         
         aleatorio = (int)(Math.random()*21);
         
         numero[i] = aleatorio;
         
         System.out.print(numero[i] + " ");
      }
      
      System.out.print("\n\n Introduzca un número de los que se han mostrado: ");
      int valor1 = Integer.parseInt(System.console().readLine());
      System.out.print("\n\n Introduzca el valor por el que quiere sustituirlo: ");
      int valor2 = Integer.parseInt(System.console().readLine());
      
       System.out.print("\n\n");
      
      for (i = 0; i < 100; i++) {
        
          if (numero[i] == valor1) {
            
            numero[i] = valor2;
            
            System.out.print("\"" + numero[i] + "\"  ");
            
          } else {
            
              System.out.print(numero[i] + "  ");
            }
        }
	}
}

