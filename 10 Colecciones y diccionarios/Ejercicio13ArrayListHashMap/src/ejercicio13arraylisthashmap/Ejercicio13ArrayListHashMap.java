/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13arraylisthashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kvothe
 */
public class Ejercicio13ArrayListHashMap {

  static ArrayList<Articulo> a = new ArrayList<>(); //Array "articulo"

  public static void main(String[] args) {
    HashMap<String, Integer> lineaFactura = new HashMap<>();
    Articulo a2 = new Articulo("1", "Raton", 10, 20, 80, "informatica");
    Articulo a3 = new Articulo("2", "Teclado", 12, 26, 30, "informatica");
    Articulo a4 = new Articulo("3", "Inverter 22W CCFL", 20, 50, 60, "electronica");
    Articulo a5 = new Articulo("4", "Panel LCD Led", 30, 58, 10, "electronica");
    a.add(a2);
    a.add(a3);
    a.add(a4);
    a.add(a5);

    int i;
    int opcion;
    int opcion2 = 0;
    int opcion3 = 0;
    int posicion = 0;
    int stockIntroducido = 0;
    int cantidadVenta = 0;
    int unidades = 0;
    double subtotal = 0;
    String codigo = "";
    String codigoIntroducido = "";
    String descripcionIntroducia = "";
    String precioCompraIntroducido = "";
    String precioVentaIntroducido = "";
    String stockIntroducidoString = "";
    String categoriaIntroducida = "";
    double precioCompra = 0;
    double precioVenta = 0;
    boolean existeCodigo = false;
    boolean compruebaMercancia = false;

    do {//Bucle del menú principal
      System.out.println("   ====GESTISIMAL====\n");
      
      System.out.println("  1. Listado");
      System.out.println("  2. Alta");
      System.out.println("  3. Baja");
      System.out.println("  4. Modificación");
      System.out.println("  5. Entrada de mercancia");
      System.out.println("  6. Venta");
      System.out.println("  7. Salir");
      System.out.println("-----------------------------\n");
      
      System.out.print("Elige una de las opciones: ");

      Scanner s = new Scanner(System.in);
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1: //Listado de articulos

          do {//Bucle del listado
            System.out.println("   ====Listado====\n");

            System.out.println("  1. Listado completo");
            System.out.println("  2. Listado por categoria");
            System.out.println("  3. Salir");
            System.out.print("Elige una de las opciones: ");
            opcion3 = Integer.parseInt(s.nextLine());

            switch (opcion3) {
              case 1://Listado completo   

                for (Articulo articuloAux : a) {
                  System.out.println(articuloAux);
                }
                break;
              case 2://Listado por categorias
                System.out.print("Introduce la categoría: ");
                categoriaIntroducida = s.nextLine();

                for (Articulo articuloAux : a) {
                  if (articuloAux.getCategoria().equals(categoriaIntroducida)) {
                    System.out.println(articuloAux);
                  }
                }
            }

          } while (opcion3 != 3 || opcion3 == 0); //Bucle del listado

          break;

        case 2: //Alta

          //Comprueba si existe el código
          do {
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for (Articulo articuloAux : a) {
              if (articuloAux.getCodigo().equals(codigoIntroducido)) {
                System.out.println("El codigo existe en la base de datos");
                existeCodigo = true;
              }
            }
          } while (existeCodigo);

          //Pide los datos y guarda el artículo
          System.out.print("Introduce la descripción: ");
          descripcionIntroducia = s.nextLine();
          System.out.print("Introduce el precio de compra: ");
          precioCompra = Double.parseDouble(s.nextLine());
          System.out.print("Introduce el precio de venta: ");
          precioVenta = Double.parseDouble(s.nextLine());
          System.out.print("Introduce  el stock: ");
          stockIntroducido = Integer.parseInt(s.nextLine());
          System.out.print("Introduce la categoria: ");
          categoriaIntroducida = s.nextLine();
          a.add(new Articulo(codigoIntroducido, descripcionIntroducia, precioCompra,
            precioVenta, stockIntroducido, categoriaIntroducida));
          System.out.println("\nArtículo almacenado correctamente\n");
          break;

        case 3: //Baja
          //Comprueba que existe el codigo del articulo y borra el artículo.
          do {
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();

            for (Articulo articuloAux : a) {
              if (articuloAux.getCodigo().equals(codigoIntroducido)) {
                posicion = a.indexOf(articuloAux);
                existeCodigo = true;
              }
            }

            if (existeCodigo) {
              System.out.println("¿Está seguro de que quiere borrar el artículo? Codigo: "
                + codigoIntroducido + " (S/N)");
              String verificacion = "";
              verificacion = s.nextLine().toUpperCase();
              if (verificacion.equals("S")) {
                a.remove(posicion);
                System.out.println("Articulo borrado");
              } else {
                System.out.println("El artículo no ha sido borrado");
              }
            }

            if (!existeCodigo) {
              System.out.println("\nNo existe el código del articulo\n");
            }
          } while (!existeCodigo);
          break;

        case 4://Modificación
          //Comprueba que existe el código y modifica el artículo. 
          do {
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for (Articulo articuloAux : a) {
              if (articuloAux.getCodigo().equals(codigoIntroducido)) {
                posicion = a.indexOf(articuloAux);
                existeCodigo = true;
              }
            }

            if (existeCodigo) {
              //Pide los datos y modifica el artículo
              System.out.print("Introduce la descripción: ");
              descripcionIntroducia = s.nextLine();
              if (!descripcionIntroducia.equals("")) {
                a.get(posicion).setDescripcion(descripcionIntroducia);
              }
              System.out.print("Introduce el precio de compra: ");
              precioCompraIntroducido = (s.nextLine());
              if (!precioCompraIntroducido.equals("")) {
                a.get(posicion).setPrecioCompra(Integer.parseInt(precioCompraIntroducido));
              }
              System.out.print("Introduce el precio de venta: ");
              precioVentaIntroducido = s.nextLine();
              if (!precioVentaIntroducido.equals("")) {
                a.get(posicion).setPrecioVenta(Double.parseDouble(precioVentaIntroducido));
              }
              System.out.print("Introduce  el stock: ");
              stockIntroducidoString = s.nextLine();
              if (!stockIntroducidoString.equals("")) {
                a.get(posicion).setStock(Integer.parseInt(stockIntroducidoString));
              }

              System.out.print("Introduce  la categoria: ");
              categoriaIntroducida = s.nextLine();
              if (!categoriaIntroducida.equals("")) {
                a.get(posicion).setCategoria(categoriaIntroducida);
              }

              System.out.print("\nArtículo modificado correctamente\n");
            }

            if (!existeCodigo) {
              System.out.println("\nNo existe el código del articulo\n");
            }

          } while (!existeCodigo);

          break;

        case 5://Entrada de mercancia
          do {
            System.out.print("Introduce el codigo del artículo: ");
            existeCodigo = false;
            codigoIntroducido = s.nextLine();
            for (Articulo articuloAux : a) {
              if (articuloAux.getCodigo().equals(codigoIntroducido)) {
                posicion = a.indexOf(articuloAux);
                existeCodigo = true;
              }
            }

            if (existeCodigo) {
              System.out.print("Introduce el stock para el articulo Nº: "
                + a.get(posicion).getCodigo() + "\nStock:"
                + " ");
              stockIntroducido = Integer.parseInt(s.nextLine());
              a.get(posicion).setStock(a.get(posicion).getStock() + stockIntroducido);
              System.out.print("\nStock modificado correctamente\n");
            }

            if (!existeCodigo) {
              System.out.println("\nNo existe el código del articulo\n");
            }
          } while (!existeCodigo);
          break;

        case 6://Venta de Artículos
          do {
            System.out.println("   ====VENTA====");
            System.out.println("Elige una de las opciones: \n");
            System.out.println("  1. Añadir Artículos");
            System.out.println("  2. Generar Factura");
            System.out.println("  3. Salir");
            opcion2 = Integer.parseInt(s.nextLine());
            switch (opcion2) {//menú factura
              case 1:

                do {
                  System.out.print("Introduce el codigo del artículo: ");
                  existeCodigo = false;
                  codigoIntroducido = s.nextLine();
                  for (Articulo articuloAux : a) {
                    if (articuloAux.getCodigo().equals(codigoIntroducido)) {
                      existeCodigo = true;
                    }
                  }
                  if (!existeCodigo) {
                    System.out.println("\nNo existe el código del articulo\n");
                  }
                } while (!existeCodigo);

                do {
                  compruebaMercancia = false;
                  System.out.print("\nIntroduce la cantidad a vender: ");
                  cantidadVenta = Integer.parseInt(s.nextLine());
                  i = posicion(codigoIntroducido);
                  if (a.get(i).getStock() < cantidadVenta) {
                    compruebaMercancia = true;
                    System.out.println("Stock insuficiente");
                  }
                } while (compruebaMercancia);

                lineaFactura.put(codigoIntroducido, cantidadVenta);
                break;

              case 2:
                System.out.println("\n\n CÓDIGO |    DESCRIPCIÓN    | UNIDADES | PRECIO UNID. | SUBTOTAL");
                System.out.println("------------------------------------------------------------------");
                for (Map.Entry pareja : lineaFactura.entrySet()) {
                  codigo = pareja.getKey().toString();

                  i = posicion(codigo);

                  unidades = Integer.parseInt(pareja.getValue().toString());
                  subtotal = (unidades * a.get(i).getPrecioVenta());
                  System.out.printf(" %6s | %17s | %8d | %12.2f | %8s\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioVenta(), subtotal);
                }
                break;
            }//Switch(menu factura)
          } while (opcion2 < 3 || opcion2 == 0);

      }//Switch menú principal 

    } while (opcion < 7 || opcion == 0);//Bucle del menú principal

  }

  static public int posicion(String codigo) {
    int i = -1;
    for (Articulo aux : a) {
      i++;
      if (aux.getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
}
