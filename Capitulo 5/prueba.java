/**
 * 
 * Ejercicio de prueba
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class prueba{
   public static void main(String[] args){
     
     int numero;
     String repetir;//"do"las variables como String e int se deven dejar fuera del bucle.
                    //las variables en for va justo despues de la palabra y el parentesis "for( int "").
                    //"while" las variables justo encima no al lado ni dentro de ella.
    do{  
          System.out.print("Dime un número: ");
  
          numero = Integer.parseInt(System.console().readLine());
          repetir="";//"" es como representarlo sin hacerlo, pero lo defino despues.
  
      if (numero % 2 == 0) {// comprueba si el número introducido es par.
    
          System.out.println("Qué bonito es el " + numero);
      
      }else if (numero %2 != 0){//en el anterior if si es para, aqui si es inpar.
    
          System.out.println("No me gustan los números impares");
          System.out.print("¿Quieres volver a intentarlo? (s/n) = ");
      
          repetir=System.console().readLine();//aqui defino las "".
  
          System.out.print(" ¡Otra vez sera! ");
      }  
    
    } while ((numero % 2 == 0) || (repetir.equals("s")));// las respuestas "correctas" para que repita el ciclo
    
          System.out.print(" ¡Otra vez sera! ");
  }
}

