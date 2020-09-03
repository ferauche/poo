/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.br.aula4;

/**
 *
 * @author ferauche
 */
public class Counter {
    
    private static int count = 0;
    
    public Counter() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
    public static double quadrado() {
        return Math.pow(count, 2);
    }
    
}
