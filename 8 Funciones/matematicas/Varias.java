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

              return true; // Devolvera true porque SI que es capicua 

          }else // Si no: 

              return false; // Devolvera false porque NO que es capicua 

      }
      
      
     /**
      * 
      * Devuelve verdadero si el número que se pasa como parámetro es primo y
      * falso en caso contrario.
      * 
      */
      
      public static boolean esPrimo(int num) { // Metodo para devolver True / False y saber si es capicua o no
      
        int aux; // Variable 
        
        for(int cont=2; cont<num; cont++) { // Se repite siempre que contador sea menor que el numero
          
          aux= num%cont; // Resto de una división entre enteros

          if(aux==0) { // Sin auxiliar es = a 0 return false, si no es asi, es true.
            
            return false;
          }
        }
        
        return true;

      } 
      
      
      /**
       * 
       * Devuelve el menor primo que es mayor al número que se pasa
       * como parámetro.
       * 
       */
      
      public static int siguientePrimo(int num) {
        
        while (!esPrimo(++num));

          return num;
        
        
      }
      
      
      /**
       * 
       * Dada una base y un exponente devuelve la potencia.
       * 
       */
      
      public static int laPotencia(int num, int elevado) {
        
        

          return num;
        
      }
      
  }

