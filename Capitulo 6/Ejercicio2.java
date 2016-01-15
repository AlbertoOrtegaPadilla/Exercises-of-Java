/**
 * 
 * Ejercicio2 prorama que muestra baraja francesa alatoria
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio2{
   public static void main(String[] args){
     
     
      System.out.println("\n\n Carta aleatoria de la baraja francesa ");
      
      String figura="";
      String numero="";
      
      switch (((int)(Math.random()*4)+1)) {
      
        case 1:
        figura= "DIAMANTES";
         break;
      
        case 2:
        figura="PICAS";
         break;
      
        case 3:
        figura="CORAZONES";
         break;
        
        case 4:
        figura= "TREBOLES";
         break;
         
      }
      
    
      switch (numero = String.valueOf((int)(Math.random()*13)+1)){
        
        case "1":
        numero="AS";
         break;
        
        case "11":
        numero="J";
         break;
         
        case "12":
        numero="Q";
         break;
         
        case "13":
        numero= "K";
         break;
         
      }
      
      System.out.print("\n la carta es el " + numero + " de " + figura);
    }
  }
        
        
