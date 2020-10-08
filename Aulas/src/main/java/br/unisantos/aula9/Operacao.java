/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula9;

/**
 *
 * @author ferauche
 */
public class Operacao {
    
    private int resultado = 0;
    
    public void dividir(int divisor) throws ArithmeticException {
        this.resultado =  this.resultado / divisor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
}
