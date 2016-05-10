/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7arraylist;

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Moneda {
    
    private static String posiciones[] = {"Cara", "Cruz"};
    private static String cantidades[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    
    private String posicion;
    private String cantidad;
    
    public Moneda(){
        
        this.posicion = posiciones [(int)(Math.random()*2)];
        this.cantidad = cantidades [(int)(Math.random()*8)];
    }
    
    public String getPosicion(){
    
        return this.posicion;
    }
    
    public String getCantidad(){
        
        return this.cantidad;
    }
    
    @Override
    public String toString(){
        
        return this.cantidad + " - " + this.posicion;
    }
}
