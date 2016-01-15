/**
 * 
 * Ejercicio2 array de 10 caracteres con nombre simbolo y asigna valores segun la tabla
 * 
 * @author Alberto Ortega Padila
 * 
 */
 
 public class Ejercicio2{
   public static void main(String[] args){
     
     char[] simbolo = new char[10];
     
     simbolo[0]='a';
     simbolo[1]='x';
     simbolo[4]='@';
     simbolo[6]=' ';
     simbolo[7]='+';
     simbolo[8]='Q';
     
     for(int i=0; i<9;i++){
       
       System.out.print(simbolo[i] + " ");
     }
   }
 }
