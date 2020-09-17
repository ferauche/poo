/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula6;

/**
 *
 * @author ferauche
 */
public class Livro extends Produto {
    
    private String ISBN;
    
    public Livro() {
        
    }
    
    public Livro(String nome, double valor, String ISBN) {
        super(nome, valor);
        this.ISBN = ISBN;
    }
    
    @Override
    public double getValorLiquido() {
        return this.getValor()*0.75;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
