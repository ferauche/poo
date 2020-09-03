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
public class Aula_4 {
    
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        System.out.println("C1 "+c1.getCount());
        System.out.println("C2 "+c2.getCount());
        System.out.println("C3 "+c3.getCount());
        
        System.out.println("Quadrado de count..: "+Counter.quadrado());
        System.out.println("Cubo de C1...: "+Calculate.cube(c1.getCount()));
        
        System.out.println("Valor de PI "+Math.PI);
        
        System.out.println(Calculate.area(10.0));
        
        Dado d = new Dado(12);
        System.out.println(d.getValor());
    }
    
}
