/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class DiscoArrayList {
    
    private String codigo;
    private String titulo;
    private String autor;
    private String genero;
    private int nCanciones;
    private int duracion;
    
    
    public DiscoArrayList(String c, String t, String a, String g,int nC, int d) {
        
        this.codigo = c;
        this.titulo = t;
        this.autor = a;      
        this.genero = g;
        this.nCanciones = nC;
        this.duracion = d;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getNCanciones() {
        return nCanciones;
    }
    
    public void setNCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
    
     // Considero que dos discos son iguales si tienen el mismo código.
     // Es obligatorio pasar un objeto genérico como parámetro.
     @Override
     public boolean equals(Object d) {
         return (this.codigo).equals(((DiscoArrayList)d).getCodigo());
      }
}
