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
public abstract class Produto implements Comparable<Produto> {
    private int cod;
    private String descricao;
    private double valor;
    
    public Produto() {
        
    }
    
    public Produto(int cod, String desc, double valor) {
        this.cod = cod;
        this.descricao = desc;
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Produto p) {
        return (int)(this.valor - p.getValor());
    }
    
    
}
