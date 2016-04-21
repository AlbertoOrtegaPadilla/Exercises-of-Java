/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K
 */
public class ArrayDeGato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Gato[] gato = new Gato[4];

        int i;

        gato[0] = new Gato("Garfield", "Naranja", "Mestizo", "Macho");
        gato[1] = new Gato("Pepe", "Gris", "Angora", "Macho");
        gato[2] = new Gato("Mauri", "Blanco", "Manx", "Hembra");
        gato[3] = new Gato("Ulises", "Marrón", "Persa", "Macho");

        System.out.println("\nDatos de los gatos.");

        for (i = 0; i < 4; i++) {
          System.out.println("\nGato nº" + (i + 1));
          System.out.println("Nombre: " + gato[i].getNombre());
          System.out.println("Color: " + gato[i].getColor());
          System.out.println("Raza: " + gato[i].getRaza());
          System.out.println("Sexo: " + gato[i].getSexo());
        }

    }
    
}
