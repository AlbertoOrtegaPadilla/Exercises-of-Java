/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Pizza {
    
    private final String tamaño;
    private final String tipo;
    private String estado;
    
    
    private static int totalPedidas;
    private static int totalServidas;
    
    
    public Pizza (String t, String tp){
        this.tamaño = t;
        this.tipo = tp;
        this.estado = "Pedida";
        Pizza.totalPedidas++;
    }
    
    @Override
    public String toString() {
        return "Pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
     }
    
    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }
  
    public static int getTotalServidas() {
      return Pizza.totalServidas;
    }

    public void sirve() {
        
        if (this.estado.equals("Pedida")) {
          this.estado = " Servida";
          Pizza.totalServidas++;
        } else {
          System.out.println(" Ya se ha servido");
        }
    }

}
