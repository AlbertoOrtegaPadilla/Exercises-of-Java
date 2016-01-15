/**
 * 
 * Ejercicio10 programa que pinte diez lineas formadas por caracteres.
 * 
 * @author ALberto Ortega Padilla
 * 
 */
 
 public class Ejercicio10{
   public static void main(String[] args){
     
     int caracter;
     int longitud;
     String linea = "";
     
     for (int i = 0; i<10; i++){
       
       longitud = (int)(Math.random()*40) + 1;
       caracter = (int)(Math.random()*6) +1;
       
       switch(caracter) {
            
            case 1:
              linea = "*";
              break;
            
            case 2:
              linea = "-";
              break;
            
            case 3:
              linea = "=";
              break;
              
            case 4:
              linea = ".";
              break;
              
            case 5:
              linea = "|";
              break;
              
            case 6:
              linea = "@";
              break;
              default:// aunque no se utilize, pero google siempre lo deja puesto.
              
        }
        
        for (int e = 1; e < longitud; e++){
          
          System.out.print(linea);
        }
        
        System.out.println();
      }
    }
  }
