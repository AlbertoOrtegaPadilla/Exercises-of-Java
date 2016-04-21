package poo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public abstract class Vehiculo {

    private static int kilometrosTotales ;
    private int kilometrosRecorridos ;
    
    public Vehiculo() {

        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    public void recorre(int k) {

        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
    }

}
