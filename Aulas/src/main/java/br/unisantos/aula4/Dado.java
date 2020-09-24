/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula4;

/**
 *
 * @author ferauche
 */
public class Dado {
    
    private Integer valor;
    
    public Dado(int valor) {
        this.valor = new Integer(valor);
    }
    
    public String somarVoltaBin(int vsoma) {
        this.valor+=vsoma;
        return valor.toString();
    }
    
    public void setValor(int valor) {
        this.valor = new Integer(valor);
    }

    public Integer getValor() {
        return valor;
    }
    
}
