/**
 * Ejercicios 1-14 Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones.
 * Recuerda que puedes usar unas dentro de otras si es necesario.
 * 
 * @author Alberto Ortega Padilla
 * 
 * 
 */

import matematicas.Varias;

public class Ejercicios1_14 {
	
	public static void main (String args[]) {
    
    long num= (int)(Math.random()*100000000) + 1;
    int elevado; // numero para elevar la potencia
    int n;// posicion del digito del numero
    int resultado; // potencia
    int d;// un digito
    int n2; // numero de digitos para eliminar por detras.
    int n3; // numero de digitos para eliminar por delante
    int n4; // numero de digitos para añadir por detras.
    int n5; // numero de digitos para añadir por delante
    int posFinal; // una posicion inicual de algun numero de num.
    int posInicial; // una posicion final de algun numero de num.
    int num1; // primer numero para juntar.
    int num2; // segundo numero para juntar.
    
    System.out.print("\n\n           - Introduce un numero: ");
    
    System.out.println(num);
    
    
    
    System.out.print("\n ------¿CAPICUA?------ \n");
    
    if (matematicas.Varias.esCapicua(num)) {
      
      System.out.println("\n          ■ El numero es capicúa");
    
    }else{
        System.out.println("\n          ■ El numero no es capicúa");
      
      }
    System.out.println();
      
      
      
    System.out.print("\n ------¿PRIMO?------ \n");
    
    if (matematicas.Varias.esPrimo(num)) {
      
      System.out.println("\n          ■ El numero es primo");
    
    }else{
        System.out.println("\n          ■ El numero no es primo");
      
      }
    
    System.out.println();
    
    
    
    System.out.print("\n ------¿SIGUIENTE PRIMO?------ \n");
    
		System.out.println("\n          ■ El siguiente primo mayor de " + num + " es " + matematicas.Varias.siguientePrimo(num));
    System.out.println();
    
    
    
    System.out.print("\n ------¿POTENCIA?------ \n");
    
    System.out.print("\n           - Introduce una Potencia: ");
    elevado= Integer.parseInt(System.console().readLine());
    
    resultado=0;
    
		System.out.println("\n          ■ La potencia de " + num + " elevado a " + elevado + " es: " + matematicas.Varias.laPotencia(num, elevado, resultado));
    System.out.println();
     
    
    
    System.out.print("\n ------¿NUMERO DE DIGITOS?------ \n");
    
		System.out.println("\n          ■ El numero de digitos es: " + matematicas.Varias.digitos(num));
    System.out.println();
    
    
    
    System.out.print("\n ------¿NUMERO VOLTEADO?------ \n");
    
		System.out.println("\n          ■ El numero: " + num + " invertido es: " + matematicas.Varias.volteaNumero(num));
    System.out.println();
    
    
    
    System.out.print("\n ------¿DIGITO N?------ \n");
    
    System.out.print("\n          - Introduce una posicion ");
    
    n=Integer.parseInt(System.console().readLine());
    
    if (matematicas.Varias.digitoN(num, n) == 0){
      
      System.out.println("\n          ■ La posición: " + n + " no entra dentro de los numeros de digitos del numero inicial "); 
      
    }
    
    System.out.println("\n          ■ En la posición: " + n + " se encuentra el digito " + matematicas.Varias.digitoN(num, n)); 
    
    
    
    System.out.print("\n ------¿POSICION DE DIGITO?------ \n");
    
    System.out.print("\n          - Introduce digito ");
    
    d= Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ El digito se encuentra en la posicion " + matematicas.Varias.posicionDeDigito(num, d));
    
    
    
    System.out.print("\n ------¿QUITA POR DETRAS?------ \n");
    
    System.out.print("\n          - Numeros de digitos a eliminar: ");
    
    n2=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.quitaPorDetras( num, n2));
    
    
    
    System.out.print("\n ------¿QUITA POR DELANTE?------ \n");
    
    System.out.print("\n          - Numeros de digitos a eliminar: ");
    
    n3=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.quitaPorDelante( num, n3));
    
    
    
    System.out.print("\n ------¿AÑADE POR DETRAS?------ \n");
    
    System.out.print("\n          - Numeros de digitos a eliminar: ");
    
    n4=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.pegaPorDetras(num, n4));
    
    
    
    System.out.print("\n ------¿AÑADE POR DELANTE?------ \n");
    
    System.out.print("\n          - Numeros de digitos a eliminar: ");
    
    n5=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.pegaPorDelante(num, n5));
    
    
    
    System.out.print("\n ------¿TROZO DE NUMERO?------ \n");
    
    System.out.print("\n          - Numeros posiciones inicial: ");
    
    posInicial=Integer.parseInt(System.console().readLine());
    
    System.out.print("\n          - Numeros posiciones final: ");
    
    posFinal=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.trozoDeNumero(num, posInicial, posFinal));
    
    
    
    System.out.print("\n ------¿JUNTAR NUMEROS?------ \n");
    
    System.out.print("\n          - Introduce un primer numero: ");
    
    num1=Integer.parseInt(System.console().readLine());
    
    System.out.print("\n          - Introduce un segundo numero: ");
    
    num2=Integer.parseInt(System.console().readLine());
    
    System.out.println("\n          ■ Los numeros restantes serian: " + matematicas.Varias.juntaNumeros(num1, num2));
	}
}

