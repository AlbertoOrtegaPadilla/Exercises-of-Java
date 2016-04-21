/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class PruebaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Pinguino lola = new Pinguino(Sexo.HEMBRA);
        lola.come("pescado");
        lola.caza();
        lola.duerme();
        lola.vuela();
        lola.corteja();
        System.out.println();
        Mamifero pepe = new Mamifero(Sexo.MACHO);
        pepe.amamanta();
        pepe.anda();
        System.out.println();
        Ave pio = new Ave (Sexo.HEMBRA);
        pio.ponHuevo();
        pio.limpiate();
        System.out.println();
        Perro Luis = new Perro (Sexo.MACHO);
        Luis.bebe();

    }
    
}
