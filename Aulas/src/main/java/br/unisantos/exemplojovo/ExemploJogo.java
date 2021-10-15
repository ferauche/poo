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
public class ExemploJogo {
    
    public static void main(String args[]) {
        
        Faca f1 = new Faca();
        Faca f2 = new Faca();
        Revolver r = new Revolver();
        LancaChamas lc = new LancaChamas();
        Bazuca b = new Bazuca();
        
        agredir(f1);
        agredir(f2);
        agredir(f2);
        agredir(f2);
        agredir(b);
        agredir(r);
        agredir(lc);
        
        atirar(r);
        atirar(r);
        atirar(lc);
        atirar(b);
        
        recarregar(r);
        
        System.out.println("Exibir Dados das Armas");
        System.out.println(f1+"\n"+f2+"\n"+r+"\n"+lc+"\n"+b);
    }
    
    public static void agredir(Arma a) {
        a.golpear();
    }
    
    public static void atirar(Disparavel d) {
        d.disparar();
    }
    
    public static void recarregar(Disparavel d) {
        d.recarregar();
    }
    
    
}
