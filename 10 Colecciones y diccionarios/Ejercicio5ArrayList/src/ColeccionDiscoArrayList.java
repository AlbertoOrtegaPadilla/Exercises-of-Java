
import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class ColeccionDiscoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner s = new Scanner(System.in);
         
         //Crea el arrayList de discos
         ArrayList<DiscoArrayList> album = new ArrayList<>();
        
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

        // MENÚ
        
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

                      for(DiscoArrayList d : album) {
                          System.out.println(d);
                        }              
                      break;

                  case 2: //Listado por autor

                      System.out.print("Introduzca el nombre del AUTOR: ");
                      autorIntroducido = s.nextLine();

                      System.out.println("\nLISTADO POR AUTOR");
                      System.out.println("=======");

                      for(DiscoArrayList d : album) {

                          if(d.getAutor().equals(autorIntroducido)) {
                            System.out.println(d);
                          }
                        }              
                      break;

                  case 3: // Listado por genero

                      System.out.print("Introduzca el nombre del GENERO: ");
                      generoIntroducido = s.nextLine();

                      System.out.println("\nLISTADO POR GENERO");
                      System.out.println("=======");

                      for(DiscoArrayList d : album) {
                          if(d.getGenero().equals(generoIntroducido)) {
                            System.out.println(d);
                          }
                        }              
                      break;

                  case 4: //Listado por duracion

                      System.out.println("Establezca el intervalo para la duración");
                      System.out.print("Introduzca el límite inferior de duración en minutos: ");
                      int limiteInferior = Integer.parseInt(s.nextLine());
                      System.out.print("Introduzca el límite superior de duración en minutos: ");
                      int limiteSuperior = Integer.parseInt(s.nextLine());

                      for(DiscoArrayList d : album) {

                          if((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
                            System.out.println(d);
                          }
                      }
                  break;  
                }
            break;
            
            // NUEVO DISCO 
            
            case 2:
                
                System.out.println("\nNUEVO DISCO");
                System.out.println("===========");
                
                System.out.println("Por favor, introduzca los datos del disco.");  
                System.out.print("Código: ");
                codigoIntroducido = s.nextLine();

                while (album.contains(new DiscoArrayList(codigoIntroducido,"", "", "", 0, 0))) {
                    
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigoIntroducido = s.nextLine();
                    }
                  
                System.out.print("Título: ");
                tituloIntroducido = s.nextLine();  
                System.out.print("Autor: ");
                autorIntroducido = s.nextLine();     
                System.out.print("Género: ");
                generoIntroducido = s.nextLine();     
                System.out.print("Numero de canciones: ");
                nCancionesIntroducido = Integer.parseInt(s.nextLine());
                System.out.print("Duración: ");
                duracionIntroducida = Integer.parseInt(s.nextLine());

                album.add(new DiscoArrayList(codigoIntroducido, tituloIntroducido, autorIntroducido, generoIntroducido,nCancionesIntroducido, duracionIntroducida));

            break;


            case 3:
              System.out.println("\nMODIFICAR");
              System.out.println("===========");

              System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
              codigoIntroducido = s.nextLine();
               
             
              while (!album.contains(new DiscoArrayList(codigoIntroducido,"", "", "", 0, 0))) {
                System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                codigoIntroducido = s.nextLine();
              }  
              
              i = album.indexOf(new DiscoArrayList(codigoIntroducido,"", "", "", 0, 0));

              System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

              System.out.println("Código: " + album.get(i).getCodigo());
              System.out.print("Nuevo código: ");
              codigoIntroducido = s.nextLine();
              
              if (!codigoIntroducido.equals("")) {
                album.get(i).setCodigo(codigoIntroducido);
              }

              System.out.println("Autor: " + album.get(i).getAutor());
              System.out.print("Nuevo autor: ");
              autorIntroducido = s.nextLine();
              
              if (!autorIntroducido.equals("")) {
                album.get(i).setAutor(autorIntroducido);
              }

              System.out.println("Título: " + album.get(i).getTitulo());
              System.out.print("Nuevo título: ");
              tituloIntroducido = s.nextLine();
              
              if (!tituloIntroducido.equals("")) {
                album.get(i).setTitulo(tituloIntroducido);
              }

              System.out.println("Género: " + album.get(i).getGenero());
              System.out.print("Nuevo género: ");
              generoIntroducido = s.nextLine();
              
              if (!generoIntroducido.equals("")) {
                album.get(i).setGenero(generoIntroducido);
              }

              System.out.println("Duración: " + album.get(i).getDuracion());
              System.out.print("Duración: ");
              duracionIntroducidaString = s.nextLine();
              
              if (!duracionIntroducidaString.equals("")) {
                album.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
              }

              break;

            case 4:

              System.out.println("\nBORRAR");
              System.out.println("======");

              System.out.print("Por favor, introduzca el codigo del disco que desea borrar: ");
              codigoIntroducido = s.nextLine();
                  
              while (!album.contains(new DiscoArrayList(codigoIntroducido,"", "", "", 0, 0))) {
                  
                System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                codigoIntroducido = s.nextLine();
              }
              
              album.remove(album.indexOf(new DiscoArrayList(codigoIntroducido,"", "", "", 0, 0)));
              System.out.println("Album borrado.");             

            break;
            
            default:

          } // switch

        } while (opcion != 5);
   }    
    
}
