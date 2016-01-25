/**
 * 
 * ejercicio4 programa que sume,reste,multipleque y divida dos numeros introducido por teclado.
 * 
 * @author Alberto Ortega Padilla
 * 
 */
 import java.util.Scanner;
 
 public class ejercicio4{
   public static void main(String[] args){
     Scanner s= new Scanner(System.in);
     
     System.out.println("\n\nCalculemos varias operaciones a la vez a partir de introducir dos numeros");
     System.out.println("\nPon un numero");
      
      float prNumero= s.nextFloat();
     
     System.out.println("\nPon otro numero");
     
      float sgNumero= s.nextFloat();
      
      double  suma= prNumero + sgNumero;
      double resta= prNumero - sgNumero;
      double mult= prNumero * sgNumero;
      double div= prNumero / sgNumero;
      
     System.out.print("\n la suma seria " + (int)prNumero + " + " + (int)sgNumero + " = " + (int)suma);
     System.out.print("\n La resta seria " + (int)prNumero + " - " + (int)sgNumero + " = " + (int)resta);
     System.out.print("\n La multiplicación seria " + (int)prNumero + " * " + (int)sgNumero + " = " + (int)mult);
     System.out.printf("\n La división seria %.0f / %.0f = %.2f",prNumero,sgNumero,div);
   }
 }
