/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula13;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class Eleicoes {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        Urna urna;
        
        try {
            System.out.print("Quantidade de eleitores: ");
            int qtd_eleitores = sc.nextInt();
            System.out.print("Quantidade de candidatos: ");
            int qtd_candidatos = sc.nextInt();
            ArrayList<Candidato> alist = new ArrayList<Candidato>();

            for(int i=1; alist.size()<qtd_candidatos; i++) {
                System.out.println("Candidato "+i);
                System.out.print("Número: ");
                int num = sc.nextInt();
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                Candidato c = new Candidato(nome, num);
                alist.add(c);
            }

            System.out.println();
            System.out.print("Remover Candidato?");
            String resp = sc.next();
            if(resp.equals("S")) {
                System.out.print("Digite o numero do Candidato: ");
                int n = sc.nextInt();
                removerCandidato(alist, n);
            }

            System.out.println("Preparando Candidatos para Urna...");
            LinkedList listaCandidatos = toUrna(alist);
            System.out.println("Preparando Carrenado candidatos na Urna...");
            urna = new Urna(qtd_eleitores, listaCandidatos); //deve receber a quantidade de eleitores e o List de Candidatos

            while(urna.getVotos().size() < urna.getEleitores()) {
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
             Contabilizar o total de votos de cada candidato, e exibir em ordem decrescente a
            quantidade de votos.
            */

            System.out.println("=====================================");
            System.out.println("        RESULTADO DESTA URNA");
            System.out.println("=====================================");
            List<Candidato> candidatos = urna.contabilizar();

            Collections.sort(candidatos);

            for(Candidato c : candidatos) {
                System.out.println(c.getNome()+" total de votos "+c.getTotalVotos());
            }
        }
        catch(UrnaException ue) {
            System.out.println(ue.getMessage());
        }
        catch(InputMismatchException ime) {
            System.out.println("Dados de entrada incorretos!");
        }  
    }
    
    private static LinkedList<Candidato> toUrna(List<Candidato> lista) {
        LinkedList<Candidato> ll = new LinkedList<Candidato>(lista);
        ll.addFirst(new Candidato());
        ll.addLast(new Candidato());
        return ll;
    }
    
    private static void removerCandidato(List<Candidato> lista, int num) throws UrnaException {
        boolean removeu = false;
        Iterator<Candidato> it = lista.iterator();
        while(it.hasNext()) {
            Candidato c = it.next();
            if(c.getNumero() == num) {
                it.remove();
                removeu = true;
            }
        }
        if(!removeu) {
            throw new UrnaException("Candidato não encontrado!", UrnaException.CANDIDATO_INEXISTENTE);
        }
    }
    
}
