/**
 * 
 * Ejercicio6 programa que piense numero al azar entre 0 y 100 y tienes que adivinarlo en x intentos avisando si estas por encima o debajo del numero
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio6{
	 public static void main(String[] args){
		 
		  System.out.println("\n\n Adivina el numero seleccionado al azar :");

		  int numero = (int)(Math.random()*100)+0;
		  int intentos=5;
		  int numIntroducido=0;
		  int i;
			 
			 // System.out.println(" *" + numero + "*");
			 
				  for ( i = 1; i<=5; i++ ){
						
            System.out.print("\n__________________________________________");
						System.out.println("\n\n Teclee un numero :");
            System.out.print(" ");
            
						numIntroducido = Integer.parseInt(System.console().readLine());
					 
						if (numero > numIntroducido){
						 
						   System.out.print("\n El numero introducido es menor");
						   
						   intentos --;
						   System.out.print("\n Te quedan " + intentos + " intentos");
						
            }else if (numero < numIntroducido){
							
							 System.out.print("\n El numero introducido es mayor");
							
							 intentos--;
							 
						     System.out.print("\n Te quedan " + intentos + " intentos");
						}
						
						if (numIntroducido == numero){
							
						    i=5;
							System.out.print("\n ¡ Lo adivinaste !" );
						}
						
						if ((i == 5) && (numIntroducido != numero)){
							
							i=5;
							System.out.print("\n Se te acabaron los intentos");
						}
						
						if ((intentos == 1) && (numIntroducido == numero)){
							
							i=5;
							System.out.print("¡\n\n ¡ Y en el ultimo intento !");
						
            }else if ((intentos == 5) && (numIntroducido == numero)){
							
							i=5;
							System.out.print("¡\n\n ¡ Y en el primer intento !");
						}
					}	
		}
	}
