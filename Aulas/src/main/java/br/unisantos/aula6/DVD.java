/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula6;

/**
 *
 * @author ferauche
 */
public class DVD extends Produto {
    
    private String SN;
    
    public DVD() {
        
    }
    
    public DVD(String nome, double valor, String SN) {
        super(nome, valor);
        this.SN = SN;
    }
    
    public double getValorLiquido() {
        return this.getValor()*0.9;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }
}
