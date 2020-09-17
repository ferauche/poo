/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula7;

import br.unisantos.br.aula5.*;

/**
 *
 * @author ferauche
 */
public class OperadorCaixa extends Funcionario {
    
    private int numeroCaixa;
    
    public OperadorCaixa(String nome, String cpf, double sal, int senha, int numCx){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = sal;
        this.senha = senha;
        this.numeroCaixa = numCx;
    }
    
    public void registrar() {
        System.out.println("Produto registrado");
    }

    public int getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }
    
    
    
}
