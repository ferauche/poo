/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula2;

import java.util.Scanner;

/**
 *
 * @author ferauche
 */
public class Aula_2 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        Carro carro1 = new Carro(9f, 20);
        
        Carro carro2 = new Carro(13.0f);
        
        System.out.println("Carro 1 tanque: " + carro1.getTanque());
        System.out.println("Carro 1 consumo medio: " + carro1.getConsumoMedio());
        System.out.println("Carro 2 tanque: " + carro2.getTanque());
        System.out.println("Carro 2 consumo medio: " + carro2.getConsumoMedio());
        
        System.out.print("Entre com a velocidade média dos carros: ");
        float vm = sc.nextFloat();
                
        System.out.print("Entre com o tempo da viagem: ");
        float t = sc.nextFloat();
        
        carro1.setarVelocidade(vm, t);
        carro2.setarVelocidade(vm, t);
        
        carro2.setConsumoMedio(10f);
   
        System.out.println("Carro 1 tanque: " + carro1.getTanque());
        System.out.println("Carro 1 odomento: " + carro1.getOdometro());
        System.out.println("Carro 2 tanque: " + carro2.getTanque());
        System.out.println("Carro 2 odometro: " + carro2.getOdometro());
        
    }
    
}
