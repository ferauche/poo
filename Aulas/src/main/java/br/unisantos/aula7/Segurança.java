/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula7;

/**
 *
 * @author ferauche
 */
public class Segurança extends Funcionario {
    
    
    private String posto;
    
    public Segurança(String nome, String cpf, double sal, int senha, String posto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = sal;
        this.senha = senha;
        this.posto = posto;
    }
    
    public void acionarAlarme() {
        System.out.println("Uooooooooooooooooooooooooooooooooouuuuuuuooooooooouuuuo!");
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }
    
}
