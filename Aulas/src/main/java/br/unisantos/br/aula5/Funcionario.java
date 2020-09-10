/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula5;

/**
 *
 * @author ferauche
 */
public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;
    
    public Funcionario() {
        
    }
    
    public Funcionario(String nome, String cpf, double salario, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autenticar(int pwd) {
        boolean pass = false;
        
        if(this.senha == pwd) {
            pass = true;
        }
        
        return pass;
    }
    
}
