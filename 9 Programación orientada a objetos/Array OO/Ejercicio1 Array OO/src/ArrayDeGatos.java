/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author K
 */
public class ArrayDeGatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        Gato[] cat = new Gato[4];
        String nombre;
        String raza;
        String sexo;
        int i;
        
        for(i = 0; i < 4; i++) {
            
            cat[i] = new Gato();
            
            System.out.println();
            System.out.println("Gato nº " + (i + 1));
            System.out.println();
            System.out.print("Nombre: ");
            nombre = s.nextLine();
            (cat[i]).setNombre(nombre);
            
            System.out.print("Raza: ");
            raza = s.nextLine();
            (cat[i]).setRaza(raza);
            
            System.out.print("Sexo: ");
            sexo = s.nextLine();
            (cat[i]).setSexo(sexo);
            System.out.println();
            
        } 
        
        
        for( i = 0; i < 4; i++) {
                
            System.out.println("Gato nº " + i);
            System.out.println("Nombre: " + cat[i].getNombre());
            System.out.println("Raza: " + cat[i].getRaza());
            System.out.println("Sexo: " + cat[i].getSexo());
            System.out.println();
            System.out.println("----------------------------");
            System.out.println();
          } 
    }
    
}
