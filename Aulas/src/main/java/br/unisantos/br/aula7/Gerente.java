/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula7;


/**
 *
 * @author ferauche
 */
public class Gerente extends Funcionario {
    
    private int nFunc;
    
    public Gerente(String nome, String cpf, double sal, int senha, int nfunc) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = sal;
        this.senha = senha;
        this.nFunc = nfunc;
    }
    
    public void cancelarOperacao() {
        System.out.println("Operacao cancelada!");
    }
}
