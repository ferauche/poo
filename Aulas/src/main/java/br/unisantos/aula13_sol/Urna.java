/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula13_sol;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class Urna {
    
    private Set<Candidato> candidatos;
    private List<Integer> votos;
    private int eleitores;
    
    //alterar o construtor para receber uma lista de candidatos
    public Urna(int eleitores, List candidatos) {
        this.eleitores = eleitores;
        this.candidatos = new HashSet<Candidato>(candidatos);
        
        votos = new ArrayList<Integer>(eleitores);
    }
    
    public Candidato getCandidato(int numero) throws UrnaException {
        for(Candidato c: this.candidatos) {
            if(c.getNumero() == numero) {
                return c;
            }
        }
        throw new UrnaException("Candidato não encontrado!", UrnaException.CANDIDATO_INEXISTENTE);
    }
    
    public void inserirVoto(int numero) {
       this.votos.add(numero);
    }
    
    public List<Integer> getVotos() {
        return this.votos;
    }
    
    public SortedSet<Candidato> contabilizar() {
        /* contar todos os votos presentes no atributo votos, e armazenar o total de vontos em cada um 
        dos objetos Candidato presentes no atrituto candidatos.
        Deve retorna o atributo candidatos, sem os candidatos de conrole de início e fim da lista
        */  
        //removendo o primeiro objeto  de controle de numero 0 de controle
        this.candidatos.remove(new Candidato());
        
        for(Candidato c : this.candidatos) {
            int total = 0;
            for(int v : this.votos) {
                if(v == c.getNumero()) {
                    total++;
                }
            }
            c.setTotalVotos(total);
        }
        
        return new TreeSet<Candidato>(this.candidatos);
    }

    public int getEleitores() {
        return eleitores;
    }
    
}
