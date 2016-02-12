package matematicas;

  public class Varias {

    /**
     * 
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa
     * y falso en caso contrario.
     * 
     */

      public static boolean esCapicua(int num){ // Metodo para devolver True / False y saber si es capicua o no 

          int falta,numeroInvertido,resto; // Variables 
        
          
          while(num<=0); // Mientras que el num sea menos o igual a 0: 
          

            falta=num; // Se guarda en falta el valor de num 

            numeroInvertido=0; // A numeroInvertido le asignamos 0 

            resto=0; // A resto le asignamos 0 
            

          while(falta!=0) { // Mientras que falta sea diferente de 0: 


             resto=falta%10; // En resto se guarda el resto que da la division de falta / 10 

             numeroInvertido=numeroInvertido*10+resto; // En numeroInvertido se guarda su valor multiplicado por 10 + el resto anterior 

             falta=falta/10; // A falta se le asigna su propio valor tras ser dividido por 10 


             // Esto se repite hasta que falta sea 0 

          } 

          if(numeroInvertido==num){ // Si el numero inicial y numeroInvertido son iguales: 

              return true; // Devolvera true porque SI es capicua 

          }else // Si no: 

              return false; // Devolvera false porque NO es capicua 

      }
      
      
     /**
      * 
      * Devuelve verdadero si el número que se pasa como parámetro es primo y
      * falso en caso contrario.
      * 
      */
      
      public static boolean esPrimo(int num) { // Metodo para devolver True / False y saber si es primo o no
      
        int aux; // Variable 
        
        for(int cont=2; cont<num; cont++) { // Se repite siempre que contador sea menor que el numero
          
          aux= num%cont; // Resto de una división entre enteros

          if(aux==0) { // Sin auxiliar es = a 0 return false, si no es asi, es true.
            
            return false; // Devolvera false porque NO es primo 
          }
        }
        
        return true; // Devolvera true porque SI es primo 

      } 
      
      
      /**
       * 
       * Devuelve el menor primo que es mayor al número que se pasa
       * como parámetro.
       * 
       */
      
      public static int siguientePrimo(int num) { // Metodo int para devolver un valor, en este caso el siguiente numero primo
        
        while (!esPrimo(++num)); // Comprueba con la funcion de esPrimo si es primo, si no lo es, se repite sumandole 1, hasta que el numero sea primo

          return num; // Devolvera el siguiente numero primo 
        
        
      }
      
      
      /**
       * 
       * Dada una base y un exponente devuelve la potencia.
       * 
       */
      
      public static int laPotencia(int num, int elevado, int resultado) { // Metodo int para devolver un valor, en este caso la potencia
        
        
        resultado = (int) Math.pow(num, elevado); // Calcula la potencia
        
        
        return resultado; // Devolvera la potencia
        
      }
     
     
      /**
       * 
       *  Cuenta el número de dígitos de un número entero.
       * 
       */
      
      public static int cuentaDigitos(int num, int contador) { // Metodo int para devolver un valor, en este caso el numero de digitos
        
        
        while(num>0){ // Siempre que el numero sea mayor que 0 se repite 
          
          num = num/10; // Resta un digito
          
          contador++; // Suma en en el contador por digito restado del numero original
        }
        
      return contador; // Devolvera un valor al contador equivalente al numero de digitos que tiene num
      
      }
      
      
       /**
       * 
       *  Le da la vuelta a un número.
       * 
       */
      
      public static int volteaNumero(int num, int numInv) { // Metodo int para devolver un valor, en este caso el num volteado
        
        int divEntera = num;
        int restoDiv = 0;
        
        while (divEntera != 0) { // Siempre que el numero divEntera no sera igual a 0 se repetira 
          
          restoDiv = divEntera % 10; // Aqui entra el numero quitado de la div entera para introducirlo en numInv
          
          divEntera = divEntera / 10; // Se le quita digito de derecha ha izquierda
          
          numInv = numInv * 10 + restoDiv; // Se introduce los digitos quitados de derecha a izquierda, pero ahora de izquierda a derecha se van introduciendo
        }
        
        return numInv; // Devolvera un valor al numInv que equivale al numero invertido de num
      
      }
      
  }

