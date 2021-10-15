/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula10;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class Eleicoes {
    
    public static void main(String args[]) {
        
        Urna urna = new Urna();
        
        int votos = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(votos < urna.getVotos().length) {
            try {
                System.out.println("ELEICOES 2021 - PREFEITURA FICTICIA");
                System.out.println("====================================");
                System.out.println("Digitie o numero o candidato ");
                int op = sc.nextInt();
                Candidato c = urna.getCandidato(op);
                System.out.println("Deseja votar no "+c.getNome()+" (S/N)?");
                String resposta = sc.next();
                if(resposta.equals("S")) {
                    urna.inserirVoto(op);
                    votos++;
                    System.out.println("Voto confirmado!");
                }
            }
            catch(UrnaException ue) {
                System.out.println(ue.getMessage());
            }
        }
        
    }
    
}
