/**
 * 
 * Ejercicio14 programa ejercicio 6 pero al rebes.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio14{
	 public static void main(String[] args){
		  
      String enter;
      int intentos = 5;
      int adivinanza;
      int minimo = 0;
      int maximo = 100;
      boolean acertado = false;
      int mayorMenorOIgual;
			 
			 // System.out.println(" *" + numero + "*");
			      
            System.out.print("Piensa un numero y despues pulse enter: ");
            
            enter = System.console().readLine();
            
				  do{
            adivinanza = (int)(Math.random() * (maximo - minimo) + minimo);
            
            System.out.println("¿Es el " + adivinanza + "?");
            System.out.print("\n__________________________________________");
            
            System.out.print("\n\n 1) mayor \n 2) menor \n 3) el mismo: \n");
            System.out.print("\n__________________________________________");
            System.out.print("\n Introduce una de las opciones = ");
            
            mayorMenorOIgual = Integer.parseInt(System.console().readLine());
            
            intentos--;

            if ( (mayorMenorOIgual == 1) && (intentos > 0) )
              
              minimo = adivinanza + 1;
            
            if ( (mayorMenorOIgual == 2) && (intentos > 0) )
              
              maximo = adivinanza - 1;
            
            if (mayorMenorOIgual == 3) {
              
              acertado = true;
              
              System.out.print("\n__________________________________________");
              System.out.println("\n ¡Bien! ¡he acertado!");
            }
          } while(!acertado && (intentos > 0));
          
          if (intentos == 0) {
                        
            System.out.print("\n__________________________________________");
            System.out.println("\n Vaya, no he conseguido acertar el número.");
          }
		}
	}

