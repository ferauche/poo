/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula2;

/**
 *
 * @author ferauche
 */
public class Carro {
    
    private float tanque = 0;
    private float odometro = 0;
    private float consumoMedio = 0;
    
    public Carro() {
        
    }
    
    public Carro(float consumo) {
        this.consumoMedio = consumo;
        this.tanque = 40;
    }
     
    public Carro(float consumo, float tanque) {
        this.consumoMedio = consumo;
        this.tanque = tanque;
    }
    
    public void setarVelocidade(float vm, float tempo) {
        float distancia =  vm * tempo;
        float litros = distancia / this.consumoMedio;
        
        this.odometro += distancia;
        this.tanque -= litros;
    }
    
    public float getTanque() {
        return this.tanque;
    }

    public float getOdometro() {
        return odometro;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }
        
    public void setConsumoMedio(float consumo) {
        this.consumoMedio = consumo;
    }
    
}
