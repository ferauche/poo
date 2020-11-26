/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.revisao;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ferauche
 */
public class Estoque {
    
    private ArrayList<Produto> produtos;
    private int cod  = 0;
    
    public Estoque() {
        this.produtos = new ArrayList<Produto>();
    }
    
    public void adicionarProduto(Produto p) {
        p.setCod(cod++);
        this.produtos.add(p);
    }
    
    public void removerProduto(Produto p) {
        int codp = p.getCod();
        
        /* for(Produto prod : this.produtos) {
            if(prod.getCod() == codp) {
                this.produtos.remove(prod);
                break;
            }
        } */
        
        Iterator<Produto> it = this.produtos.iterator();
        while(it.hasNext()) {
            Produto prod = it.next();
            if(prod.getCod() == codp) {
                it.remove();
            }
        }
    }
}
