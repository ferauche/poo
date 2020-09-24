/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula5;

/**
 *
 * @author ferauche
 */
public class Aula_5 {
    
    public static void main(String args[]) {
        
        OperadorCaixa op = new OperadorCaixa("Thiago F","8712631927391-X",1500.00, 1234, 1);
        Segurança seg = new Segurança("Joao", "123123131231", 900.00, 1111, "Portão principal");
        Gerente gerente = new Gerente("Ciro C. T.","231231231-X",5000, 4321,1000);
        
        //System.out.println(func.getNome()+" "+logar(func, 2222));
        System.out.println(gerente.getNome()+" "+logar(gerente, 4321));
        System.out.println(op.getNome()+" "+logar(op, 4321));
        System.out.println(seg.getNome()+" "+logar(seg, 4321));
        
        gerente.cancelarOperacao();
        op.registrar();
        seg.acionarAlarme();
    }
    
    private static boolean logar(Funcionario f, int senha) {
        return f.autenticar(senha);
    }
    
}
