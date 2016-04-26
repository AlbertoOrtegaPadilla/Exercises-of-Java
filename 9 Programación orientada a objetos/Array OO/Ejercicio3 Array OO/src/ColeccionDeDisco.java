/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Alberto Ortega Padilla
 */
public class ColeccionDeDisco {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int N = 100;
        int opcion;
        String codigoIntroducido;
        String tituloIntroducido;
        String autorIntroducido;
        
        int nCancionesIntroducido;
        String nCancionesIntroducidaString;
        String generoIntroducido;
        String duracionIntroducidaString;
        int duracionIntroducida;
        int primeraLibre;
        int i;

        //Crea el array de discos
        Disco[] album = new Disco[N];

        // Crea todos los discos que van en cada una de
        // las celdas del array
        for(i = 0; i < N; i++) {
            
          album[i] = new Disco();

        }

        do {
          System.out.println("\n\nCOLECCIÓN DE DISCOS");
          System.out.println("===================");
          System.out.println("1. Listado");
          System.out.println("2. Nuevo disco");
          System.out.println("3. Modificar");
          System.out.println("4. Borrar");
          System.out.println("5. Salir");
          System.out.print("Introduzca una opción: ");
          opcion = Integer.parseInt(s.nextLine());

          switch (opcion) {
          case 1:
            System.out.println("\nLISTADO");
            System.out.println("=======");
            for(i = 0; i < N; i++) {
                
              if (!album[i].getCodigo().equals("LIBRE")) {
                
                  System.out.println("Código: " + album[i].getCodigo());  
                  System.out.println("Autor: " + album[i].getAutor());    
                  System.out.println("Título: " + album[i].getTitulo());
                  System.out.println("Género: " + album[i].getGenero());
                  System.out.println("Duración: " + album[i].getDuracion());
              }
            }
            break;

          case 2:
            System.out.println("\nNUEVO DISCO");
            System.out.println("===========");

            // Busca la primera posiciÃ³n libre del array
            primeraLibre = -1;
            do {
              primeraLibre++;
            } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));

            System.out.println("Por favor, introduzca los datos del disco.");  

            System.out.print(" Codigo: ");
            codigoIntroducido = s.nextLine();
            album[primeraLibre].setCodigo(codigoIntroducido);

            System.out.print(" Autor: ");
            autorIntroducido = s.nextLine();
            album[primeraLibre].setAutor(autorIntroducido);

            System.out.print(" Titulo: ");
            tituloIntroducido = s.nextLine();
            album[primeraLibre].setTitulo(tituloIntroducido);

            System.out.print("Genero: ");
            generoIntroducido = s.nextLine();
            album[primeraLibre].setGenero(generoIntroducido);
            
            System.out.print("Numero de canciones: ");
            nCancionesIntroducido = Integer.parseInt(s.nextLine());
            album[primeraLibre].setNCanciones(nCancionesIntroducido);

            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            album[primeraLibre].setDuracion(duracionIntroducida);

            break;

          case 3:
            System.out.println("\nMODIFICAR");
            System.out.println("===========");

            System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
            codigoIntroducido = s.nextLine();

            i = -1;
            do {
              i++;
            } while (!((album[i].getCodigo()).equals(codigoIntroducido)));

            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

            System.out.println(" Código: " + album[i].getCodigo());
            System.out.print(" Nuevo código: ");
            codigoIntroducido = s.nextLine();
            
            if (!codigoIntroducido.equals("")) {
              album[i].setCodigo(codigoIntroducido);
            }

            System.out.println(" Autor: " + album[i].getAutor());
            System.out.print(" Nuevo autor: ");
            autorIntroducido = s.nextLine();
            
            if (!autorIntroducido.equals("")) {
              album[i].setAutor(autorIntroducido);
            }

            System.out.println(" Titulo: " + album[i].getTitulo());
            System.out.print(" Nuevo titulo: ");
            tituloIntroducido = s.nextLine();
            
            if (!tituloIntroducido.equals("")) {
              album[i].setTitulo(tituloIntroducido);
            }

            System.out.println(" Genero: " + album[i].getGenero());
            System.out.print(" Nuevo genero: ");
            generoIntroducido = s.nextLine();
            
            if (!generoIntroducido.equals("")) {
              album[i].setGenero(generoIntroducido);
            }
            
            System.out.println(" Numero de cancines: " + album[i].getDuracion());
            System.out.print(" Nuevo numero de canciones: ");
            nCancionesIntroducidaString = s.nextLine();
            
            if (!nCancionesIntroducidaString.equals("")) {
              album[i].setNCanciones(Integer.parseInt(nCancionesIntroducidaString));
            }

            System.out.println("    Duración: " + album[i].getDuracion());
            System.out.print("  Duración: ");
            duracionIntroducidaString = s.nextLine();
            
            if (!duracionIntroducidaString.equals("")) {
              album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
            }

            break;

          case 4:
            System.out.println("\nBORRAR");
            System.out.println("======");

            System.out.print("Por favor, introduzca el codigo del disco que desea borrar: ");
            codigoIntroducido = s.nextLine();

            i = -1;
            do {
              i++;
              
            } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
            
            album[i].setCodigo("LIBRE");
            System.out.println("Album borrado.");

            break;

          default:

          } // switch
          
        } while (opcion != 5);
            }
}
