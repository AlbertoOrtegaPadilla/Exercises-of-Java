
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        int opcionLista;
        String codigoIntroducido;
        String codigo;
        String tituloIntroducido;
        String autorIntroducido;
        
        int nCancionesIntroducido;
        String nCancionesIntroducidaString;
        String generoIntroducido;
        String duracionIntroducidaString;
        int duracionIntroducida;
        int primeraLibre;
        int i ;
        int contador = 0;

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
              
            System.out.println("\n\n¿QUÉ TIPO DE LISTADO QUIERES?");
            System.out.println("===================");
            System.out.println("1. COMPLETO");
            System.out.println("2. POR AUTOR");
            System.out.println("3. POR GENERO");
            System.out.println("4. POR DURACION");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcionLista = Integer.parseInt(s.nextLine());
            
            switch (opcionLista){
                
                case 1: //listado completo
                    
                    System.out.println("\nLISTADO COMPLETO");
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
                   
                case 2: //Listado por autor
                    
                    System.out.print("Introduzca el nombre del AUTOR: ");
                    autorIntroducido = s.nextLine();

                    System.out.println("\nLISTADO POR AUTOR");
                    System.out.println("=======");
                    
                    for (i = 0; i < N; i++) {
                        
                        if ((!album[i].getCodigo().equals("LIBRE")) && (album[i].getAutor().equals(autorIntroducido))) {
                        
                            System.out.println("Código: " + album[i].getCodigo());  
                            System.out.println("Autor: " + album[i].getAutor());    
                            System.out.println("Título: " + album[i].getTitulo());
                            System.out.println("Género: " + album[i].getGenero());
                            System.out.println("Duración: " + album[i].getDuracion());
                        }
                    }                   
                    break;
                    
                    
                case 3: // Listado por genero
                    
                    System.out.print("Introduzca el nombre del GENERO: ");
                    generoIntroducido = s.nextLine();
                    
                    System.out.println("\nLISTADO POR GENERO");
                    System.out.println("=======");
                
                    for(i = 0; i < N; i++) {
                    
                        if (!album[i].getCodigo().equals("LIBRE") && (album[i].getGenero().equals(generoIntroducido))) {
                            
                            System.out.println("Código: " + album[i].getCodigo());  
                            System.out.println("Autor: " + album[i].getAutor());    
                            System.out.println("Título: " + album[i].getTitulo());
                            System.out.println("Género: " + album[i].getGenero());
                            System.out.println("Duración: " + album[i].getDuracion());
                         }   
                    }
                    break;
                    
                case 4: //Listado por duracion
                    
                    System.out.println("Establezca el intervalo para la duración");
                    System.out.print("Introduzca el límite inferior de duración en minutos: ");
                    int limiteInferior = Integer.parseInt(s.nextLine());
                    System.out.print("Introduzca el límite superior de duración en minutos: ");
                    int limiteSuperior = Integer.parseInt(s.nextLine());
              
                    for(i = 0; i < N; i++) {
                      if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
                        System.out.println("------------------------------------------");
                        System.out.println("Código: " + album[i].getCodigo());  
                        System.out.println("Autor: " + album[i].getAutor());    
                        System.out.println("Título: " + album[i].getTitulo());
                        System.out.println("Género: " + album[i].getGenero());
                        System.out.println("Duración: " + album[i].getDuracion());
                        System.out.println("------------------------------------------");
                      }
                    }
                    
                    break;  
            }
            
            break;

          case 2:
            
            i = -1;
              
            do { 
              i++;
                 
              if (album[i].getCodigo().equals("LIBRE")) {
                    contador++;
               }  
            } while ((contador != 99));
            
            if (contador != 0) {
                  
                System.out.println("\nNUEVO DISCO");
                System.out.println("===========");

                // Busca la primera posición libre del array
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
                    
              }else {
                  System.out.println("¡ERROR! = No se permitirá introducir los datos de ningún disco"
                          + " hasta que no se borre alguno de la lista.");       
              }
              
            

          case 3:
            System.out.println("\nMODIFICAR");
            System.out.println("===========");

            System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
            codigoIntroducido = s.nextLine();

            i = -1;
            codigo = "";
            
            do {
                
              i++;
                if (i < N) {
                    codigo = album[i].getCodigo();
                }
              
            } while (!(codigo.equals(codigoIntroducido)) && (i < N));
            
              if (i != N) {
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println(" Código: " + album[i].getCodigo());
                    System.out.print(" Nuevo código: ");
                    codigoIntroducido = s.nextLine();

                    i = -1;
                    codigo = "";

                   do {

                     i++;
                       if (i < N) {
                           codigo = album[i].getCodigo();
                       }

                   } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                   if ((!codigoIntroducido.equals("")) && (i == N)) {

                     album[i].setCodigo(codigoIntroducido);

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
                   } 
                }else{
                  
                  System.out.println("Código de disco no existe");
              }

            
            break;

          case 4:
              
            System.out.println("\nBORRAR");
            System.out.println("======");

            System.out.print("Por favor, introduzca el codigo del disco que desea borrar: ");
            codigoIntroducido = s.nextLine();

            i = -1;
            codigo = "";
            
            do {
                
              i++;
                if (i < N) {
                    codigo = album[i].getCodigo();
                }
              
            } while (!(codigo.equals(codigoIntroducido)) && (i < N));
                       
              if (i == N) {
                  System.out.println("¡ERROR! el código introducido es erroneo.");
              }else{
                    
                    album[i].setCodigo("LIBRE");
                    System.out.println("Album borrado.");
                 }

            break;

          default:

          } // switch
          
        } while (opcion != 5);
            }    
}
