/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kvothe
 */
public class PruebaTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tiempo t1 = new Tiempo(1,10,22) {};
        Tiempo t2 = new Tiempo(1,10,22) {};
        
        t1.suma(t2);
        System.out.println(t1);
    }
    
}
