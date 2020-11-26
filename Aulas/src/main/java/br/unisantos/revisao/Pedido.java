/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.revisao;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ferauche
 */
public class Pedido {
    
    private int numero;
    private ArrayList<Produto> itens;
    private double valorTotal;
    
    public Pedido(){
        this.itens = new ArrayList<Produto>();
        this.valorTotal = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void adicionarProduto(Produto p) {
        this.itens.add(p);
        this.valorTotal += p.getValor();
    }
    
    public void removerProduto(Produto p) throws PedidoException {
        if(this.itens.isEmpty()) {
            throw new PedidoException("Lista Vazia!");
        }
        else if(!this.itens.contains(p)) {
            throw new PedidoException("Produto não encontrado!");
        }
        else {
            this.itens.remove(p);
            this.valorTotal -= p.getValor();
        }
    }
    
    public ArrayList<Produto> ordernarPreco() {
        Collections.sort(this.itens);
        return this.itens;
    }
    
}
