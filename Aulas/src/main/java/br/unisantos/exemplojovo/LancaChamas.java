/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.exemplojovo;

/**
 *
 * @author ferauche
 */
public class LancaChamas extends Arma implements Disparavel {
    
    private int gas;
    
    public LancaChamas() {
        this.gas = 100;
        this.destruicao = 8;
    }
    
    @Override
    public void recarregar() {
        this.gas = 100;
    }
    
    @Override
    public void disparar() {
        this.gas -= 10;
        if(this.gas < 0) {
            this.gas = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Gas: "+this.gas+" Destruicao: "+this.destruicao;
    }
    
}
