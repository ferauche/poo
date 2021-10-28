/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula11;

/**
 *
 * @author ferauche
 */
public class UrnaException extends Exception {
    
    public static final int CANDIDATO_INEXISTENTE = 0;
    public static final int VOTO_NAO_COMPUTADO = 1;
    
    private int cod_erro;
    
    public UrnaException(String msg, int cod_erro) {
        super(msg);
        this.cod_erro = cod_erro;
    }

    public int getCod_erro() {
        return cod_erro;
    }
    
}
