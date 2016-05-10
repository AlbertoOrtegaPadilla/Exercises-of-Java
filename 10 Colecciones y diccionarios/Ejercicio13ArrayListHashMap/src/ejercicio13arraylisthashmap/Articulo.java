/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13arraylisthashmap;

/**
 *
 * @author Kvothe
 */
public class Articulo {

    private String codigo;
    private String descripcion;
    private String categoria;
    private double precioCompra;
    private double precioVenta;
    private int stock;


    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precioCompra = precioCompra;
      this.precioVenta = precioVenta;
      this.stock = stock;
    }

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock, String categoria) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.categoria = categoria;
      this.precioCompra = precioCompra;
      this.precioVenta = precioVenta;
      this.stock = stock;
    }



    public String getCodigo() {
      return codigo;
    }

    public String getDescripcion() {
      return descripcion;
    }

    public double getPrecioCompra() {
      return precioCompra;
    }

    public double getPrecioVenta() {
      return precioVenta;
    }

    public int getStock() {
      return stock;
    }

    public String getCategoria() {
      return categoria;
    }



    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
      this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
      this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
      this.stock = stock;
    }

    public void setCategoria(String categoria) {
      this.categoria = categoria;
    }



    @Override
    public String toString() {
     String cadena = "------------------------------------------";
     cadena += "\nCódigo: " + this.codigo;  
     cadena += "\nDescripción: " + this.descripcion;    
     cadena += "\nPrecio de compra: " + this.precioCompra + "€";
     cadena += "\nPrecio de venta: " + this.precioVenta + "€";
     cadena += "\nStock: " + this.stock + " unidades";
     cadena += "\nCategoria: " + this.categoria;
     cadena += "\n------------------------------------------";
     return cadena;
    }

   public int compareTo(Articulo articulo) {
      if(!descripcion.equals(articulo.getDescripcion())){

      }
        return descripcion.compareTo(articulo.getDescripcion());
    }
  }
