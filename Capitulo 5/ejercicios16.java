/**
 * 
 * Ejercicio16 programa que muestra el numero por teclado si es primo o no
 * 
 * @author Alberto Ortega Padilla
 * 
 */
//se podria utilizar metodo logico "boolean" = true.
//no esta TERMINADO!!!
public class ejercicios16{
  public static void main(String[] args){
    
    System.out.print("Introduce un numero por teclado= ");
    
    int numero= Integer.parseInt(System.console().readLine());
    int i;
    int contador=0;
    
    for(i=0;i<=numero;i++){
      
      if(numero%i==0){
        
        contador++;
        
      }if (contador==2){
        
        System.out.print( "El numero es primo ");
      }else{
        
        System.out.print( "El numero no es primo ");
      }
    }
  }
}
    
