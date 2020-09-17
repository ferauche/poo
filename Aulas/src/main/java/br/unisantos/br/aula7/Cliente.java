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
public class Cliente implements Autenticavel {

    private String email;
    private int senha;
    
    public Cliente() {
        
    }
    
    public Cliente(String email, int senha) {
        this.email = email;
        this.senha = senha;
    }
    
    @Override
    public boolean autenticar(int p) {
        boolean passou = false;
        if(this.senha == p ) {
            passou = true;
        }
        return passou;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
}
