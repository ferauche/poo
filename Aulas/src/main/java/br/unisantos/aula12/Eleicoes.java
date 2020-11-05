/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula12;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class Eleicoes {
    
    public static void main(String args[]) {
        
        /*
        Alterar aqui para colocar um menu 1 - Gerenciar Candidatos, 2 - Iniciar Eleições
        */
        
        Urna urna = new Urna(5); //deve receber a quantidade de eleitores e o List de Candidatos
        
        Scanner sc = new Scanner(System.in);
        
        while(urna.getVotos().size() < urna.getEleitores()) {
            try {
                System.out.println("ELEICOES 2021 - PREFEITURA FICTICIA");
                System.out.println("====================================");
                System.out.print("Digitie o numero o candidato: ");
                int op = sc.nextInt();
                Candidato c = urna.getCandidato(op);
                System.out.print("Deseja votar no "+c.getNome()+" (S/N)?");
                String resposta = sc.next();
                if(resposta.equals("S")) {
                    urna.inserirVoto(op);
                    System.out.println("Voto confirmado!");
                }
            }
            /*
            Aqui não estão implementadas as exceções da solução da Aula 10
            */
            catch(UrnaException ue) {
                System.out.println(ue.getMessage());
            }
        }
        
        /*
         Contabilizar o total de votos de cada candidato, e exibir em ordem decrescente a
        quantidade de votos.
        */
        
        System.out.println("=====================================");
        System.out.println("        RESULTADO DESTA URNA");
        System.out.println("=====================================");
        Vector<Candidato> candidatos = urna.contabilizar();
        
        Collections.sort(candidatos);
        
        for(Candidato c : candidatos) {
            System.out.println(c.getNome()+" total de votos "+c.getTotalVotos());
        }
        
    }
    
}
