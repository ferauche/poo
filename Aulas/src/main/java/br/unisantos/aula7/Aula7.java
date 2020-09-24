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
public class Aula7 {
    
    public static void main (String args[]) {
        Gerente g = new Gerente("Ciro Cirne Trindade","111.111.111-X",9000.00,1234,1000);
        OperadorCaixa oc = new OperadorCaixa("Thiago Ferauche","333.333.333-X",3000.0,4321,3000);
        Cliente c = new Cliente("joao.alfredo@unisantos.br",11);
        
        validarAutenticacao(g,1234);
        validarAutenticacao(oc,1234);
        validarAutenticacao(c,1234);
        
    }
    
    private static void validarAutenticacao(Autenticavel a, int senha) {
        if(a.autenticar(senha)) {
            System.out.println("Entrou no sistema");
        }
        else {
            System.out.println("Autenticacao Invalida!");
        }
    }
    
}
