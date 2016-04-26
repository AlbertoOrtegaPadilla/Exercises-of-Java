/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Disco {
    
    private String codigo;
    private String titulo;
    private String autor;
    private String genero;
    private int nCanciones;
    private int duracion;

    public Disco() {
        this.codigo = "LIBRE";
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String c) {
        this.codigo = c;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String t) {
        this.titulo = t;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String a) {
        this.autor = a;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String g) {
        this.genero = g;
    }
    
    public int getNCanciones() {
        return nCanciones;
    }
    
    public void setNCanciones(int nC) {
        this.nCanciones = nC;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int d) {
        this.duracion = d;
    }
    
    
    @Override
    public String toString() {
        
        String cadena = "\n------------------------------------------";
        
            cadena += "\n CODIGO: " + this.codigo;  
            cadena += "\n TITULO: " + this.titulo;    
            cadena += "\n AUTOR: " + this.autor;
            cadena += "\n GENERO: " + this.genero;
            cadena += "\n NUMERO DE CANCIONES: " + this.nCanciones;
            cadena += "\n DURACION DEL DISCO: " + this.duracion;
            cadena += 
                    
            cadena += "\n------------------------------------------";

        return cadena;
    }

}
