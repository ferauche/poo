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
public class Faca extends Arma {
    
    private int lamina;
    
    public Faca() {
        this.lamina = 10;
        this.destruicao = 2.5;
    }
    
    @Override
    public void golpear() {
        this.lamina -= 1;
        if(this.lamina < 5) {
            this.destruicao = 1.5;
        }
        else if(this.lamina <= 0) {
            this.destruicao = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Lamina: "+this.lamina+" Destruicao: "+this.destruicao;
    }
    
}
