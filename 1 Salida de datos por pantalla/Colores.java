/**
* Coloreado de texto
* 
* Muestra varias palabras en el color que corresponde.
* 
* @autor Alberto O. Padilla
*/

public class Colores {
  public static void main(String[] arg) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(naranja + "mandarina" + verde + "hierba");
    System.out.println(naranja + "saltamontes" + rojo + "tomate");
    System.out.println(blanco + "sabanas" + azul + "cielo");
    System.out.println(morado + "nazareno" + azul + "mar");
  }
}
