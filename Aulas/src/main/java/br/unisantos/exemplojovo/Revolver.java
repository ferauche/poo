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
public class Revolver extends Arma implements Disparavel {
    
    private int cartucho;
    
    public Revolver() {
        this.cartucho = 6;
        this.destruicao = 5;
    }
    
    @Override
    public void recarregar() {
        this.cartucho = 6;
    }
    
    @Override
    public void disparar() {
        this.cartucho -= 1;
        if(this.cartucho < 0) {
            this.cartucho = 0;
        }
    }
    
    @Override
    public String toString() {
        return "Cartuchos: "+this.cartucho+" Destruicao: "+this.destruicao;
    }
    
}
