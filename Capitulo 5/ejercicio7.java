/**
 * 
 * Ejercicio7 programa para realizar el acceso a una caja fuerte
 * 
 * 
 * 
 */
 
 public class ejercicio7{
   public static void main(String[] args){
     
     int codigo=0;
      
      for(int i=1; i<=4; i++){// intentos menor o igual que 4 con la suma de i
       
            System.out.print("Introduce el codigo de acceso: ");
            codigo= Integer.parseInt(System.console().readLine());
         
         if(codigo == 4444){
           
            System.out.print("Codigo correcto, puede acceder a la caja fuerte");
            i=50;//esta es la condicion para que salga, el valor numerico da igual.
          }else{
         
         System.out.print("Lo siento, esa no es la combinación");
       }
     }
   }
 }

       
       
