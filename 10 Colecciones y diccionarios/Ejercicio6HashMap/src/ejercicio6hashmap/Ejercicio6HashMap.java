/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6hashmap;
import java.util.*;

/**
 *
 * @author AlbertoOrtegaPadilla
 */
public class Ejercicio6HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        HashMap<String, String> m = new HashMap<>();
        
        String usuario;
        String contraseña;
        boolean entrada = false;
        int intentos = 3;
        
        m.put("admin", "admin");
        m.put("usuario","usuario");
        m.put("root", "root");
        
        System.out.println("Introduzca usuario y contraseña para acceder al sistema (3 intentos): ");
        
        while((!entrada) && (intentos > 0)){
            
            System.out.print("Usuario: ");
            usuario = s.nextLine();
            System.out.print("Contraseña: ");
            contraseña = s.nextLine();
            
            if (m.containsKey(usuario)) {
                if (m.get(usuario).equals(contraseña)) {
                
                    System.out.println("Accediendo al sistema......espere.....");
                    entrada = true;
                }else{
                    
                    intentos --;
                    System.out.println("La contraseña es incorrecta, le quedan " + intentos + " intentos");                    
                }
            }else{
                intentos --;
                System.out.println("El ususario introducido no existe en la base de datos, le quedan " + intentos + " intentos");
            }
        }
        
        if (intentos == 0) {
            
            System.out.println("Cierra y abra el programa nuevamente para regenerar el numero de intentos, Gracias.");
        }
    }
}
