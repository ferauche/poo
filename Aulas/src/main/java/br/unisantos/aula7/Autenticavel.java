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
public interface Autenticavel {
    
    /**
     * Metodos responsavel pelo login
     * @param p senha que sera utilizada para validar a autenticacao
     * @return  True - Validou, Fale - Autenticacao Negada
     */
    public boolean autenticar(int p);
    
    
    
}
