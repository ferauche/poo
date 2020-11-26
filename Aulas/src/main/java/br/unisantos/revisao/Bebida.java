/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.revisao;

/**
 *
 * @author ferauche
 */
public class Bebida extends Produto {
    
    private int tamanho;
    
    public Bebida(int cod, String desc, double valor, int tamanho) {
        super(cod, desc, valor);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
