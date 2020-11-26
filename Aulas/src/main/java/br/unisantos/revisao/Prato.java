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
public class Prato extends Produto {
    
    private String nome;
    
    public Prato(int cod, String desc, double valor, String nome) {
        super(cod, desc, valor);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
