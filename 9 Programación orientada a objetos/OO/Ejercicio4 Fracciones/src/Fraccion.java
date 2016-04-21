/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Ortega Padilla
 */
public class Fraccion {
     
  private int signo;
  private int numerador;
  private int denominador;
  
  public Fraccion(int n, int d) {
    
    if (d == 0) {
      System.out.println("Una fracción no puede tener como denominador el número 0");
      
    } else {
        if (n * d < 0) {

          this.signo = -1;

        } else {
              this.signo = 1;
          }

        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);
      }
  }
  
  int getNumerador(){
    return this.numerador;
  }
  
  int getDenominador(){
    return this.denominador;
  }
  
  
  /**
   * Devuelve la fraccion visual del numerador y el denominador.
   * @return 
   */
  @Override
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }
  
  
  /**
   * Devuelve una fracción invertida. Lo que antes era el numerador
   * ahora será el denominador y viceversa.
   * 
   * @return fracción invertida
   */
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }
  
  
  /**
   * Devuelve una fracción que es el resultado de simplificar la
   * fracción original.
   * 
   * @return  resultado de simplificar (si se puede) la fracción
   *          original, o la misma fracción en caso de que la original
   *          sea irreducible
   */
  public Fraccion simplifica() {
    
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
    int i;
      
    for (i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
    return new Fraccion(s * n, d);
  }
  
  
  /**
   * Devuelve una fracción multiplicada por un escalar (un número "n")
   * El resultado es otra fracción con el mismo denominador que la
   * original.
   * 
   * @param n escalar por el que se multiplica la fracción original.
   * 
   * @return  fracción multiplicada por "n"
   */
  public Fraccion multiplica(int n) {
    return new Fraccion(this.signo * this.numerador * n, this.denominador);
  }
  
  
  /**
   * Devuelve una fracción que es el resultado de multiplicar la
   * fracción original por otra fracción que se pasa como parámetro.
   * 
   * @param f fracción por la que se multiplica la fracción original
   * 
   * @return  resultado de multiplicar la fracción original por la
   *          fracción que se pasa como parámetro
   */
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }
  
  
  /**
   * Devuelve una fracción dividida entre un escalar (un número "n").
   * 
   * @param n escalar entre el que se divide la fracción original.
   * 
   * @return  fracción dividida entre "n".
   */
  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }
  
  
  /**
   * Devuelve una fracción que es el resultado de dividir la fracción
   * original entre otra fracción que se pasa como parámetro.
   * 
   * @param f fracción entre la que se quiere dividir la fracción
   *          original
   * 
   * @return  resultado de dividir la fracción original entre la
   *          fracción que se pasa como parámetro
   */
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
  }
}
