/**
 * 
 * Ejercicio3 programa muestra carta baraja española
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 
 public class Ejercicio3{
  public static void main(String[] args){
    
      System.out.println("\n\n Carta aleatoria de la baraja española ");
      
      String figura="";
      String numero="";
      
      switch (((int)(Math.random()*4)+1)) {
      
        case 1:
        figura= "ORO";
         break;
      
        case 2:
        figura="BASTO";
         break;
      
        case 3:
        figura="ESPADA";
         break;
        
        case 4:
        figura= "COPAS";
         break;
         
      }
      
    
      switch (numero = String.valueOf((int)(Math.random()*12)+1)){
        
        case "10":
        numero="SOTA";
         break;
        
        case "11":
        numero="CABALLO";
         break;
         
        case "12":
        numero="REY";
         break;
         
      }
      
      System.out.print("\n la carta es el " + numero + " de " + figura);
    }
  }
