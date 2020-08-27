/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula2;

import java.util.Scanner;

/**
 *
 * @author ferauche
 */
public class Aula_2 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        Carro carro1 = new Carro();
        carro1.consumoMedio = 9f;
        carro1.tanque = 20;
        
        Carro carro2 = new Carro(13.0f);
        
        System.out.println("Carro 1 tanque: " + carro1.tanque);
        System.out.println("Carro 1 consumo medio: " + carro1.consumoMedio);
        System.out.println("Carro 2 tanque: " + carro2.tanque);
        System.out.println("Carro 2 consumo medio: " + carro2.consumoMedio);
        
        System.out.print("Entre com a velocidade média dos carros: ");
        float vm = sc.nextFloat();
                
        System.out.print("Entre com o tempo da viagem: ");
        float t = sc.nextFloat();
        
        carro1.setarVelocidade(vm, t);
        carro2.setarVelocidade(vm, t);
        
        System.out.println("Carro 1 tanque: " + carro1.tanque);
        System.out.println("Carro 1 odomento: " + carro1.odometro);
        System.out.println("Carro 2 tanque: " + carro2.tanque);
        System.out.println("Carro 2 odometro: " + carro2.odometro);
        
    }
    
}
