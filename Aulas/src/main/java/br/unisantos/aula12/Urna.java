/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula12;

import java.util.Vector;

/**
 *
 * @author ferauche
 */
public class Urna {
    
    private Vector<Candidato> candidatos;
    private Vector<Integer> votos;
    private int eleitores;
    
    //alterar o construtor para receber uma lista de candidatos
    public Urna(int eleitores) {
        this.eleitores = eleitores;
        candidatos = new Vector<Candidato>();
        Candidato c1 = new Candidato("Guilherme Prado",50);
        Candidato c2 = new Candidato("Arthur Durval",51);
        
        candidatos.add(c1);
        candidatos.add(c2);
        
        votos = new Vector<Integer>(eleitores);
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
    
    public Vector<Integer> getVotos() {
        return this.votos;
    }
    
    public Vector<Candidato> contabilizar() {
        /* contar todos os votos presentes no atributo votos, e armazenar o total de vontos em cada um 
        dos objetos Candidato presentes no atrituto candidatos.
        Deve retorna o atributo candidatos
        */
        for(Candidato c : this.candidatos) {
            int total = 0;
            for(int v : this.votos) {
                if(v == c.getNumero()) {
                    total++;
                }
            }
            c.setTotalVotos(total);
        }
        return this.candidatos;
    }

    public int getEleitores() {
        return eleitores;
    }
    
}
