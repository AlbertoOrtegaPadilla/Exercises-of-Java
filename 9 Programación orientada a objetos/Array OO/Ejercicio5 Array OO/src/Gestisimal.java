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
public class Gestisimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int N = 100;
        int opcion;
        
        String codigoIntroducido;
        String codigo;
        String descripcion;
        double precioCompra;
        String precioCompraIntroducido;
        double precioVenta;
        String precioVentaIntroducido;
        int stock;
        String stockIntroducido;
        
        int primeraLibre;
        int i ;
        int contador = 0;

        //Crea el array de discos
        Articulos[] almacen = new Articulos[N];

        // Crea todos los discos que van en cada una de
        // las celdas del array
        for(i = 0; i < N; i++) {
            
          almacen[i] = new Articulos();

        }

        do {
          System.out.println("\n\nGESTION SIMPLIFICADA DEL ALMACEN");
          System.out.println("===================");
          System.out.println("1. Listado");
          System.out.println("2. alta");
          System.out.println("3. baja");
          System.out.println("4. Modificación");
          System.out.println("5. Entrada mercancias");
          System.out.println("6. Salidas mercancias");
          System.out.println("7. Salir");
          
          System.out.print("Introduzca una opción: ");
          opcion = Integer.parseInt(s.nextLine());

          switch (opcion) {
            
              
            // LISTADO
              
              
            case 1:
                

                  System.out.println("\nLISTADO:");
                  System.out.println("=======");

                  for(i = 0; i < N; i++) {

                      if (!almacen[i].getCodigo().equals("LIBRE")) {

                          System.out.println("Código: " + almacen[i].getCodigo());  
                          System.out.println("Descripción: " + almacen[i].getDescripcion());    
                          System.out.println("Precio de compra: " + almacen[i].getPrecioCompra());
                          System.out.println("Precio de venta: " + almacen[i].getPrecioVenta());
                          System.out.println("Stock: " + almacen[i].getStock());
                      }     
                  }

                  break;

            
            // ALTA
                  
                  
            case 2:

              i = -1;

              do { 
                i++;

                if (almacen[i].getCodigo().equals("LIBRE")) {
                      contador++;
                 }  
              } while ((contador != 99));

              if (contador != 0) {

                  System.out.println("\nALTA");
                  System.out.println("===========");

                  // Busca la primera posición libre del array
                  primeraLibre = -1;

                  do {
                    primeraLibre++;
                  } while (!((almacen[primeraLibre].getCodigo()).equals("LIBRE")));

                    System.out.println("Por favor, introduzca los datos del articulo para su gestion en el almacen.");  

                    System.out.print(" Codigo: ");
                    codigoIntroducido = s.nextLine();
                    almacen[primeraLibre].setCodigo(codigoIntroducido);

                    System.out.print(" Descripción del articulo: ");
                    descripcion = s.nextLine();
                    almacen[primeraLibre].setDescripcion(descripcion);

                    System.out.print(" Precio de compra del articulo: ");
                    precioCompra = Integer.parseInt(s.nextLine());
                    almacen[primeraLibre].setPrecioCompra(precioCompra);

                    System.out.print("Precio de venta del articulo: ");
                    precioVenta = Integer.parseInt(s.nextLine());
                    almacen[primeraLibre].setPrecioVenta(precioVenta);

                    System.out.print("Stock del articulo: ");
                    stock = Integer.parseInt(s.nextLine());
                    almacen[primeraLibre].setStock(stock);

                    break;

                }else {
                    System.out.println("¡ERROR! El almacen esta \"COMPLETO\". " );       
                }


            // BAJA
            
            
            case 3:
              
                System.out.println("\nBAJA:");
                System.out.println("======");

                System.out.print("Por favor, introduzca el codigo del articulo que desea dar de baja: ");
                codigoIntroducido = s.nextLine();

                i = -1;
                codigo = "";

                do {

                  i++;
                    if (i < N) {
                        codigo = almacen[i].getCodigo();
                    }

                } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                  if (i == N) {
                      System.out.println("¡ERROR! el código introducido es erroneo.");
                  }else{

                        almacen[i].setCodigo("LIBRE");
                        System.out.println("Articulo dado de baja satisfactoriamente.");
                     }

              break;

              
              // MODIFICACIONES
              
              
            case 4:
                
              System.out.println("\nMODIFICACION");
              System.out.println("===========");

              System.out.print("Por favor, introduzca el código del articulo cuyos datos desea cambiar: ");
              codigoIntroducido = s.nextLine();

              i = -1;
              codigo = "";

              do {

                i++;
                  if (i < N) {
                      codigo = almacen[i].getCodigo();
                  }

              } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                if (i != N) {
                      System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                      System.out.println(" Código: " + almacen[i].getCodigo());
                      System.out.print(" Nuevo código: ");
                      codigoIntroducido = s.nextLine();

                      i = -1;
                      codigo = "";

                     do {

                       i++;
                         if (i < N) {
                             codigo = almacen[i].getCodigo();
                         }

                     } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                     if ((!codigoIntroducido.equals("")) && (i == N)) {

                       almacen[i].setCodigo(codigoIntroducido);

                       System.out.println(" Descripción actual: " + almacen[i].getDescripcion());
                       System.out.print(" Nueva descripción: ");
                       descripcion= s.nextLine();

                       if (!descripcion.equals("")) {
                         almacen[i].setDescripcion(descripcion);
                       }

                       System.out.println(" Precio de compra actual: " + almacen[i].getPrecioCompra());
                       System.out.print(" Nuevo precio de compra: ");
                       precioCompraIntroducido = s.nextLine();

                       if (!precioCompraIntroducido.equals("")) {
                         almacen[i].setPrecioCompra(Double.parseDouble(precioCompraIntroducido));
                       }

                       System.out.println(" Precio de venta actual: " + almacen[i].getPrecioVenta());
                       System.out.print(" Nuevo precio de venta: ");
                       precioVentaIntroducido = s.nextLine();

                       if (!precioVentaIntroducido.equals("")) {
                         almacen[i].setPrecioVenta(Double.parseDouble(precioVentaIntroducido));
                       }

                       System.out.println(" Stock actual: " + almacen[i].getStock());
                       System.out.print(" Nuevo numero de canciones: ");
                       stockIntroducido = s.nextLine();

                       if (stockIntroducido.equals("")) {
                         almacen[i].setStock(Integer.parseInt(stockIntroducido));
                       }
                     } 
                  }else{

                    System.out.println("Código del arituclo no existe");
                }
              break;
              
              
              // ENTRADA MERCANCIA
              
              
              case 5:
                  
                System.out.println("\nENTRADA DE MERCANCÍA");
                System.out.println("====================");

                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntroducido = s.nextLine();

                i = -1;
                codigo = "";
                do {
                  i++;
                  if (i < N) {
                    codigo = almacen[i].getCodigo();
                  }
                } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                if (i == N) {
                  System.out.println("Lo siento, el código introducido no existe.");
                } else {
                  System.out.println("Entrada de mercancía del siguiente artículo: ");
                  System.out.println(almacen[i]);
                  System.out.print("Introduzca el número de unidades que entran al almacén: ");
                  stockIntroducido = s.nextLine();
                  almacen[i].setStock(Integer.parseInt(stockIntroducido) + almacen[i].getStock());
                  System.out.println("La mercancía ha entrado en el almacén.");  
                }

                break;



                // SALIDA DE MERCANCÍA 


                case 6:
                  System.out.println("\nSALIDA DE MERCANCÍA");
                  System.out.println("===================");

                  System.out.print("Por favor, introduzca el código del artículo: ");
                  codigoIntroducido = s.nextLine();

                  i = -1;
                  codigo = "";
                  do {
                    i++;
                    if (i < N) {
                      codigo = almacen[i].getCodigo();
                    }
                  } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                  if (i == N) {
                    System.out.println("Lo siento, el código introducido no existe.");
                  } else {
                    System.out.println("Salida de mercancía del siguiente artículo: ");
                    System.out.println(almacen[i]);
                    System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                    stock = Integer.parseInt(s.nextLine());
                    if (almacen[i].getStock() - stock > 0) {
                      almacen[i].setStock(almacen[i].getStock() - stock);
                      System.out.println("La mercancía ha salido del almacén.");
                    } else {
                      System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                    }
                  }
                  break;
            default:

            } // switch

          } while (opcion != 7);
              }    
}
