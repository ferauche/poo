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
public abstract class Arma {
    
    protected double destruicao;
    
    public void golpear() {
        this.destruicao -= 0.5;
    }
    
}
