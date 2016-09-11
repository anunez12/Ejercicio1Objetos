/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SP
 */
public class Fraccionario { 
    private int numerador;private int denominador; 
    public Fraccionario(int numerador,int denominador) throws Indeterminacion{ 
      this.numerador=numerador;this.denominador=denominador; 
      if(denominador==0){ 
       throw new Indeterminacion();
      }
    } 

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    } 
    public Fraccionario Suma(Fraccionario f2) throws Indeterminacion{ 
      Fraccionario f;int numerador,denominador; 
      numerador=this.numerador * f2.denominador + this.denominador * f2.numerador;
      denominador=this.denominador * f2.denominador; 
      f=new Fraccionario(numerador, denominador); 
      return f;
    } 
    public Fraccionario Resta(Fraccionario f2) throws Indeterminacion{ 
      Fraccionario f;int numerador,denominador; 
       numerador=this.numerador * f2.denominador - this.denominador * f2.numerador;
      denominador=this.denominador * f2.denominador; 
      f=new Fraccionario(numerador, denominador); 
      return f;
    } 
    public Fraccionario Multiplicacion(Fraccionario f2) throws Indeterminacion{ 
      Fraccionario f;int numerador,denominador; 
      numerador=this.numerador * f2.numerador;
      denominador=this.denominador * f2.denominador; 
      f=new Fraccionario(numerador, denominador); 
      return f;
    } 
    public Fraccionario Division(Fraccionario f2) throws Indeterminacion{ 
      Fraccionario f;int numerador,denominador; 
       numerador = this.numerador * f2.denominador;
        denominador = this.denominador * f2.numerador; 
        f=new Fraccionario(numerador, denominador); 
        return f;
    }
    
    
}
