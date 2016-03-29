package matematicas;

  public class Varias {

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa
     * y falso en caso contrario.
     * 
     */
      public static boolean esCapicua(long num){ // Metodo para devolver True / False y saber si es capicua o no 

          long falta,numeroInvertido,resto; // Variables 
          
          while(num<=0); // Mientras que el num sea menos o igual a 0: 

            falta=num; // Se guarda en falta el valor de num 

            numeroInvertido=0; // A numeroInvertido le asignamos 0 

            resto=0; // A resto le asignamos 0 

          while(falta!=0) { // Mientras que falta sea diferente de 0: 

             resto=falta%10; // En resto se guarda el resto que da la division de falta / 10 

             numeroInvertido=numeroInvertido*10+resto; // En numeroInvertido se guarda su valor multiplicado por 10 + el resto anterior 

             falta=falta/10; // A falta se le asigna su propio valor tras ser dividido por 10 
          } 

          if(numeroInvertido==num){ // Si el numero inicial y numeroInvertido son iguales: 

              return true; // Devolvera true porque SI es capicua 

          }else // Si no: 

              return false; // Devolvera false porque NO es capicua 
      }
      
      
     /**
      * Devuelve verdadero si el número que se pasa como parámetro es primo y
      * falso en caso contrario.
      * 
      */
      public static boolean esPrimo(long num) { // Metodo para devolver True / False y saber si es primo o no
      
        long aux; // Variable 
        
        for(int cont=2; cont<num; cont++) { // Se repite siempre que contador sea menor que el numero
          
          aux= num%cont; // Resto de una división entre enteros

          if(aux==0) { // Sin auxiliar es = a 0 return false, si no es asi, es true.
            
            return false; // Devolvera false porque NO es primo 
          }
        }
        
        return true; // Devolvera true porque SI es primo 
      } 
      
      
      /**
       * Devuelve el menor primo que es mayor al número que se pasa
       * como parámetro.
       * 
       */
      public static long siguientePrimo(long num) { // Metodo int para devolver un valor, en este caso el siguiente numero primo
        
        while (!esPrimo(++num)); // Comprueba con la funcion de esPrimo si es primo, si no lo es, se repite sumandole 1, hasta que el numero sea primo

          return num; // Devolvera el siguiente numero primo 
      }
      
      
      /**
       * Dada una base y un exponente devuelve la potencia.
       * 
       */
      public static long laPotencia(long num, int elevado, int resultado) { // Metodo int para devolver un valor, en este caso la potencia
        
        resultado = (int) Math.pow(num, elevado); // Calcula la potencia
        
        return resultado; // Devolvera la potencia
      }
     
     
      /**
       *  Cuenta el número de dígitos de un número entero.
       * 
       */
      public static long digitos(long num) { // Metodo int para devolver un valor, en este caso el numero de digitos
        
        long digitos = 0;
        
        while(num>0){ // Siempre que el numero sea mayor que 0 se repite 
          
          num = num/10; // Resta un digito
          
          digitos++; // Suma en en el contador por digito restado del numero original
        }
        
        return digitos; // Devolvera un valor al contador equivalente al numero de digitos que tiene num
      }
      
      
      
      /**
       *  Le da la vuelta a un número.
       * 
       */
      public static int volteaNumero(int num) { // Metodo int para devolver un valor, en este caso el num volteado
        
        int divEntera = num;
        int restoDiv = 0;
        int numInv = 0;
        
        while (divEntera != 0) { // Siempre que el numero divEntera no sera igual a 0 se repetira 
          
          restoDiv = divEntera % 10; // Aqui entra el numero quitado de la div entera para introducirlo en numInv
          
          divEntera = divEntera / 10; // Se le quita digito de derecha ha izquierda
          
          numInv = numInv * 10 + restoDiv; // Se introduce los digitos quitados de derecha a izquierda, pero ahora de izquierda a derecha se van introduciendo
        }
        
        return numInv; // Devolvera un valor al numInv que equivale al numero invertido de num
      }
      
      
      /**
       *  Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha
       * 
       */
      public static long digitoN(long num, int n){
    
        long digito; // aqui se almacenara el digido de n
        
        digito = (num / ((int)(Math.pow(10, (digitos(num) - (n + 1)))))) % 10; // calcula el digito que se encuentra en la posicion n
        
        return digito; // devuelve el digito de la posicion n
      }
      
      
      /**
       * Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
       * 
       */
      public static int posicionDeDigito(long num, int d){
    
        int n = 0; // almacena pa posicion del d introducido
        
        do{
          if(d == digitoN(num, n)){ // entra si el digito introducido esta dentro de num.
            
            return n; // devuelve la posicion n del digito d.
          }
          n++;
        }while(n < digitos(num)); // se repite la accion del do hasta que n sea mayor que digitos.
        
        return -1; // en el caso del que d no exista dentro de num, devuelve ese valor.
      }
      
      
      /**
       * Le quita a un número n dígitos por detrás (por la derecha).
       * 
       */
      public static long quitaPorDetras(long num, long n2){
        
        for (int i = 1; i <= n2; i++){ // repite hasta que i sea igual a n2.
          
          num = num/10; // le quita un digito por detras.
        }
    
        return num; // devuelve el numero restante, despues de quitarlo lo n2 introducidos.
      }
      
     
      /**
       * Le quita a un número n dígitos por detrás (por la derecha).
       * 
       */
      public static long quitaPorDelante(long num, long n3){
        
        long numeroSinDigitos; // almacena el numero restante, despues de quitarle digitos por delante.
    
        numeroSinDigitos = num % (int)(Math.pow(10, digitos(num) - n3)); // calculo para eliminar por delante los n3 digitos introducidos.
        
        return numeroSinDigitos;// devuelve el numero restante almacenado en numeroSinDigitos.
      } 
      
      
      /**
       * Añade un dígito por detrás a un número.
       * 
       */
      public static long pegaPorDetras(long num, int n4){
        
        return (num * 10) + n4;
      }
      
      /**
       * Añade un dígito por delante a un número.
       * 
       */
      public static long pegaPorDelante(long num, int n5){
        
        return (n5 * (int)(Math.pow(10, digitos(num)))) + num;
      }
      
      
      /**
       * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
       * 
       */
      public static long trozoDeNumero(long num, int posInicial, int posFinal){
        
        long longitud = digitos(num); //almacena la longitus del num, calculado en la funcion digitos.
        
        num = quitaPorDelante(num, posInicial); // resta numeros por delante
        num = quitaPorDetras(num, longitud - posFinal - 1); // aqui, resta de atras, despues de eliminar los de delante.
        
        return num; // aqui devuele el numero restante despues de quitarle digitos por delante y por detras.
            
      }
      
      
      /**
       * Pega dos números para formar uno.
       * 
       */
      public static int juntaNumeros(int num1, int num2){
    
        return (num1 * ((int)(Math.pow(10, digitos(num2))))) + num2; // Aqui devuelve el numero completo, de juntar num1 y num2.
      }
      
      
      
      
      
      /**
       * Pasa un número de decimal a binario.
       * 
       */
      public static int decimalABinario(int numeroDecimal){
        
        int numeroBinario = 0; // almacena el numero binario
        
        do{
          
          numeroBinario *= 10;
          numeroBinario += numeroDecimal % 2;
          numeroDecimal /= 2;
          
        }while(numeroDecimal != 1); // hasta que el numero decimal sea 1 se repetira.
        
        numeroBinario *= 10;
        numeroBinario += numeroDecimal;
        
        int volteado = volteaNumero(numeroBinario);
        
        return volteado; // devuelve el numero binario
      }
      
      
      /**
       * Pasa un número decimal a hexadecimal.
       * 
       */
      public static String decimalAHexadecimal(int numeroDecimal) {
            
         // For storing remainder
         int rem;
            
         // For storing result
         String str2 ="";
         // Digits in hexadecimal number system
         char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     
         while(numeroDecimal>0)
         {
           rem= numeroDecimal%16;
            
           str2=hex[rem]+str2; 
           
           numeroDecimal=numeroDecimal/16;
         }
         return str2;
      }
      
      
      /**
       * Pasa un número decimal a octal.
       * 
       */
      public static String decimalAOctal(int numeroDecimal) {
            
         int rem;
 
          // For storing result
          String str=""; 
       
          // Digits in Octal number system
          char dig[]={'0','1','2','3','4','5','6','7'};
       
          while(numeroDecimal>0)
          {
             rem=numeroDecimal%8; 
             str=dig[rem]+str; 
             numeroDecimal=numeroDecimal/8;
         }
         return str;
      }
      
      
      /**
       * Pasa un número binario (en base 2) a hexadecimal (base 16).
       * 
       */
       public static String binarioAHexadecimal(int numeroBinario) {
        String hexadecimal = "";
        String digitosHexa = "0123456789ABCDEF";
      
        while (numeroBinario > 0) {
          hexadecimal = digitosHexa.charAt((int)binarioADecimal(numeroBinario % 10000)) + hexadecimal;
          numeroBinario = numeroBinario / 10000;
        };
          
        return hexadecimal;
      }
      
      
      /**
       * Pasa un número binario (en base 2) a octal (base 8).
       * 
       */
        public static int binarioAOctal(int numeroBinario) {
     
          int numeroDecimal = binarioADecimal(numeroBinario);
          
         // String str = String.valueOf(numeroDecimal);
          
          int octal = Integer.parseInt(decimalAOctal(numeroDecimal));
          
          return octal;
        }
        
        
      /**
       * Escribe un programa que pase de binario a decimal.
       * 
       */
      public static int binarioADecimal(int numeroBinario){
    
        int numeroDecimal = 0; // almacena el numero decimal sacado del numero binario.
        int volteado = volteaNumero(numeroBinario); // voltea el numeroBinario.
        
        for(int i = 0; i < digitos(volteado); i++){ // se repite la cantidad de veces equivalente al numero de digitos del numeroBinario.
          
            numeroDecimal += (int)(Math.pow(2,i) * digitoN(volteado, i)); // pasa el numero binario a un numero decimal.
        }
        
        return numeroDecimal; // devuelve el numero decimal sacado del numeroBinario.
      }
      
         
      /**
       * Escribe un programa que pase de hexadecimal a decimal.
       * 
       */    
      public static int hexadecimalADecimal(String numeroHexadecimal){
        
            int suma=0;
            int newnumHex = 0;
            String digitos = numeroHexadecimal.toUpperCase();
            
            for(int i=0;i<digitos.length();i++){
              
                char c = digitos.charAt(digitos.length()-i-1);

                if(c=='A'){
                    newnumHex = 10;

                }else if(c=='B'){
                    newnumHex = 11;

                }else if(c=='C'){
                    newnumHex = 12;

                }else if(c=='D'){
                    newnumHex = 13;

                }else if(c=='E'){
                    newnumHex = 14;

                }else if(c=='F'){
                    newnumHex = 15;

                }else{
                  
                    newnumHex = Character.getNumericValue(c);
                }
                
                suma = (int) (suma + newnumHex * Math.pow(16,i));
            }
            
            return suma;
        }
        
        
        /**
         * Escribe un programa que pase de hexadecimal a binario.
         * 
         */  
        public static int hexadecimalABinario(String numeroHexadecimal){
          
          int decimal = hexadecimalADecimal(numeroHexadecimal);
          
          int binario = decimalABinario(decimal);
          
          return binario;
        }
        
        
        /**
         * Escribe un programa que pase de hexadecimal a octal.
         * 
         */  
        public static int hexadecimalAOctal(String numeroHexadecimal){
          
          int binario = hexadecimalABinario(numeroHexadecimal);
          
          int octal = binarioAOctal(binario);
          
          return octal;
        }
        
        
        /**
         * Escribe un programa que pase de octal a decimal.
         * 
         */  
        public static int octalADecimal(String numeroOctal){
          
         int decimal = Integer.parseInt(numeroOctal,8);
          
          return decimal;
        }
        
        /**
         * Escribe un programa que pase de octal a binario.
         * 
         */  
        public static int octalABinario(String numeroOctal){
          
         int decimal = octalADecimal(numeroOctal);
         
         int binario = decimalABinario(decimal);
          
          return binario;
        }
        
        
        /**
         * Escribe un programa que pase de octal a hexadecimal.
         * 
         */  
        public static String octalAHexadecimal(String numeroOctal){
          
         int decimal = octalADecimal(numeroOctal);
         
         String hexadecimal = decimalAHexadecimal(decimal);
          
         return hexadecimal;
        }

  }

