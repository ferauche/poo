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
public class Bazuca extends Arma implements Disparavel {
    
    private int misseis;
    
    public Bazuca() {
        this.misseis = 3;
        this.destruicao = 100;
    }

    @Override
    public void disparar() {
        this.misseis -=1;
        if(this.misseis < 0) {
            this.misseis = 0;
        }
    }

    @Override
    public void recarregar() {
        if(this.misseis < 3) {
            this.misseis += 1;
        }
    }
    
    @Override
    public void golpear() {
        this.destruicao = 100;
    }
    
    @Override
    public String toString() {
        return "Misseis: "+this.misseis+" Destruicao: "+this.destruicao;
    }
    
    
    
    
}
