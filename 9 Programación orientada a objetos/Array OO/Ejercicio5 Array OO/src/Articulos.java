/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kvothe
 */
public class Articulos {
    
    private String codigo = "LIBRE";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String c) {
        this.codigo = c;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    
    public double getPrecioCompra() {
        return precioCompra;
    }
    
    public void setPrecioCompra(double pC) {
        this.precioCompra = pC;
    }
    
    public double getPrecioVenta() {
        return precioVenta;
    }
    
    public void setPrecioVenta(double pV) {
        this.precioVenta = pV;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int s) {
        this.precioCompra = s;
    }
    
    @Override
    public String toString() {
        
        String cadena = "\n------------------------------------------";
        
            cadena += "\n CODIGO: " + this.codigo;  
            cadena += "\n DESCRIPCION: " + this.descripcion;    
            cadena += "\n PRECIO COMPRA: " + this.precioCompra;
            cadena += "\n PRECIO VENTA: " + this.precioVenta;
            cadena += "\n STOCK: " + this.stock;
            cadena += 
                    
            cadena += "\n------------------------------------------";

        return cadena;
    }
}

