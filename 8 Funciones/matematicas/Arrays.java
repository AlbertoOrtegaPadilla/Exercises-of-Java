package matematicas;

  public class Arrays {
    
    
    /**
     * Muestra un array de una dimensión por pantalla.
     * 
     */
    public static void mostrarArray(int [] array){
      
      for(int i = 0; i < array.length; i++){
        
        System.out.printf("%4d", array[i]);
      }
    }
    
    /**
     * Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     * 
     */
    public static void generaArrayInt (int n, int [] array, int maximo, int minimo) {
      
      for (int i = 0; i < n; i++){
        
        array[i] = (int)((Math.random() * ((maximo - minimo) + 1)) + minimo);
        
      }
      
    }
    
    /**
     * Calcula el valor MINIMO de una array.
     * 
     */
    public static int minimoArrayInt(int[] array){
      
      int minimo = Integer.MAX_VALUE;
      
      for(int i = 0; i < array.length; i++){
        
        if(array[i] < minimo){
          
          minimo = array[i];
        }
      }
      
      return minimo;
    }
    
    
    /**
     * Calcula el valor MAXIMO de una array.
     * 
     */
    public static int maximoArrayInt(int[] array){
      
      int maximo = Integer.MIN_VALUE;
      
      for(int i = 0; i < array.length; i++){
        
        if(array[i] > maximo){
          
          maximo = array[i];
        }
      }
      
      return maximo;
    }
    
    
    /**
     * Calcula la media de los números de un array de enteros.
     * 
     */
    public static double mediaArrayInt(int[] array){
      
      double media = 0;
      
      for(int i = 0; i < array.length; i++){
        
        media += array[i];
      }
      
      media /= array.length;
      
      return media;		
    }
    
    /**
     * Busca y dice si un número está o no en el array.
     * 
     */
    public static boolean estaEnArrayInt(int[] array, int numero){
      
      for(int i = 0; i < array.length; i++){
        
        if(array[i] == numero){
          
          return true;
          
        }
      }
      
      return false;
    }
    
    
    /**
     * Devuelve la posición de un número en un array. Si no lo encuentra devuelve -1
     *
     */
    public static int posicionEnArray(int[] array, int numero){
      
      for(int i = 0; i < array.length; i++){
        if(array[i] == numero){
          return i;
        }
      }
      
      return -1;
    }
    
    
    /**
     * Da la vuelta a un array de enteros.
     * 
     */
    public static void volteaArrayInt(int[] array){
      
      int i = 0;
      int j = array.length - 1;
      int aux;
      
      while(i < j){
        
        aux = array[j];
        array[j] = array[i];
        array[i] = aux;
        
        i++;
        j--;
      }
    }
    
    /**
     * Rota tantas posiciones como se indique los número de un array hacia la
     * derecha.
     * 
     */
    public static void rotaDerechaArrayInt(int[] array, int veces){
      
      int ultimoNumero = array[array.length-1];
      
      for(int i = array.length - 1; i > 0; i--){
        array[i] = array[i - 1];
      }
      
      array[0] = ultimoNumero;
      
      if(--veces != 0){
        rotaDerechaArrayInt(array, veces);
      }
    }
      
      /**
       * Rota tantas posiciones como se indique los número de un array hacia la
       * izquierda.
       * @param array es el array que se va a rotar.
       * @param veces es el número de veces que se va a rotar el array.
       */
      public static void rotaIzquierdaArrayInt(int[] array, int veces2){
        
        int primerNumero = array[0];
        
        for(int i = 0; i < array.length - 1; i++){
          array[i] = array[i + 1];
        }
        
        primerNumero = array[array.length-1];
        
        if(--veces2 != 0){
          rotaIzquierdaArrayInt(array, veces2);
        }
      }
      
      /**
       * Muestra un array bidimensional de números enteros.
       * @param array es el array que se va a mostrar.
       */
      public static void mostrarArrayBiInt(int[][] array){
        
        for(int[] i : array){
          for(int j : i){
            System.out.printf("%4d", j);
          }
          System.out.println();
        }
      }
      
      /**
       * Genera un array bidimensional de números aleatorios entre dos números 
       * dados y con una altura y anchura dadas.
       * @param array es el array que se va a rellenar.
       * @param n es la altura del array.
       * @param m es la anchura del array.
       * @param minimo es el mínimo número del aleatorio.
       * @param maximo es el máximo número del aleatorio.
       */
      public static void generaArrayBiInt(int[][] array, int n, int m, int minimo, 
                                            int maximo){
        for(int i = 0; i < n; i++){
          for(int j = 0; j < m; j++){
            array[i][j] = (int)((Math.random() * ((maximo - minimo) + 1)) + minimo);
          }
        }
      }
      
      /**
       * Muestra una fila de un array bidimensional.
       * @param array es el array del que se va a mostrar la fila.
       * @param fila es el número de la fila que se va a mostrar.
       */
      public static void filaDeArrayBiInt(int[][] array, int fila){
        for(int i = 0; i < array[fila].length; i++){
          System.out.printf("%4d", array[fila][i]);
        }
      }

      /**
       * Muestra una columna de un array bidimensional.
       * @param array es el array del que se va a mostrar la fila.
       * @param columna es la columna que se va a mostrar.
       */
      public static void columnaDeArrayBiInt(int[][] array, int columna){
        
        int espacios = 4 * (columna + 1);
        
        for(int i = 0; i < array.length; i++){
          System.out.printf("%" + espacios + "d \n", array[i][columna]);
        }
      }
      
      /**
       * Devuelve las coordenadas de un número de un array bidimensional. Si no lo
       * encuentra devuelve -1,-1.
       * @param array es el array en el que se va a buscar el número.
       * @param numero es el número que se va a buscar.
       * @return coordenadas son las coordenadas de número buscado.
       */
      public static int[] coordenadasEnArrayBiInt(int[][] array, int numero){
      
        int[] coordenadas = {-1,-1};
        for(int i = 0; i < array.length; i++){
          for(int j = 0; j < array[0].length; j++){
            if(array[i][j] == numero){
              coordenadas[0] = i;
              coordenadas[1] = j;
              return coordenadas;
            }
          }
        }
        return coordenadas;
      }
      
      /**
       * Es el número mínimo de una fila elegida de un array bidimensional.
       * @param array es el array en el que se va a buscar el número.
       * @param fila es el número de la fila en la que se va a buscar.
       * @return minimo es el número mínimo de la fila.
       */
      public static int minimoFila(int array[][], int fila){
        
        int minimo = Integer.MAX_VALUE;
        for(int i = 0; i < array[fila].length; i++){
          if(array[fila][i] < minimo){
            minimo = array[fila][i];
          }
        }
        return minimo;
      }
      
      /**
       * Es el número máximo de una columna elegida de un array bidimensional.
       * @param array es el array en el que se va a buscar el número.
       * @param columna es el número de la columna en la que se va a buscar.
       * @return maximo es el número máximo de la columna.
       */
      public static int maximoColumna(int array[][], int columna){
        
        int maximo = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
          if(array[i][columna] > maximo){
            maximo = array[i][columna];
          }
        }
        return maximo;
      }
      
      /**
       * Dice si un número de un array bidimensional es punto de silla o no.
       * @param numero es el número 
       * @param minimoFila es el número mínimo de su fila.
       * @param maximoColumna es el número máximo de su columna.
       * @return true si es punto de silla y false si no lo es.
       */
      public static boolean esPuntoDeSilla(int numero, int minimoFila, int maximoColumna){
        if((minimoFila == numero) && (maximoColumna == numero)){
          return true;
        }else{
          return false;
        }
      }
      
      /**
       * Devuelve un array con una de las diagonales de un array bidimensional.
       * @param array es el array del que se va a devolver la diagonal.
       * @param direccion es la dirección de la diagonal.
       * @return diagonal es un array con la diagonal elegida.
       */
      public static int[] diagonal(int array[][], String direccion){

        int diagonal[] = new int[array.length];
        if(direccion.equals("nose")){
          for(int i = 0; i < array.length; i++){
            diagonal[i] = array[i][i];
          }
        }else{
          for(int i = array[0].length; i >= 0; i--){
            diagonal[array.length - i] = array[i][i];
          }
        }
        return diagonal;
      }
      
      public static void ArrayBiIntBomba(int[][] array, int uFila, int uColumna, int filas, int columnas){
      
        //Declaro variables
       
        int[] multiplicador = {2,3,4};

        array[uFila][uColumna] *= multiplicador[0];

        //Las dos capas adyacentes
        for(int capa=1; capa<3; capa++){
          //Parte superior
          if((uFila-capa)>=filas){
            for(int i=uColumna-capa+1;i<=uColumna+capa;i++){
              if(i>=0 && i<columnas){
                array[uFila-capa][i] *= multiplicador[capa];
              }
            }
          }
          //Parte derecha
          if((uColumna+capa)<columnas){
            for(int i=uFila-capa+1;i<=uFila+capa;i++){
              if(i>=0 && i<filas){
                array[i][uColumna+capa] *= multiplicador[capa];
              }
            }
          }
          //Parte inferior
          if((uFila+capa)<filas){
            for(int i=uColumna-capa;i<uColumna+capa;i++){
              if(i>=0 && i<8){
                array[uFila+capa][i] *= multiplicador[capa];
              }
            }
          }
          //Parte izquierda
          if((uColumna-capa)>=columnas){
            for(int i=uFila-capa;i<uFila+capa;i++){
              if(i>=0 && i<filas){
                array[i][uColumna-capa] *= multiplicador[capa];
              }
            }
          }
        }
        
        //Muestra el resultado
        for(int fila=0;fila<5;fila++){
          for(int columna=0; columna<8;columna++){
            System.out.print(array[fila][columna]+" ");
          }
          System.out.print("\n");
        }
      }
  }
  

