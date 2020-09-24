/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula6;

/**
 *
 * @author ferauche
 */
public abstract class Produto {
    
    private String nome;
    private double valor;
    
    public Produto() {
        
    }
    
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public Produto(String nome) {
        this.nome = nome;
        this.valor = 0;
    }
     
    public double getValorLiquido() {
        return 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
