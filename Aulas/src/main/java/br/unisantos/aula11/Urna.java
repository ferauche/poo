/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula11;

import java.util.Vector;

/**
 *
 * @author ferauche
 */
public class Urna {
    
    private Vector<Candidato> candidatos = new Vector<Candidato>(2);
    private int[] votos = new int[5];
    private int idx = 0;
    
    public Urna() {
        Candidato c1 = new Candidato("Guilherme Prado",50);
        Candidato c2 = new Candidato("Arthur Durval",51);
        
        candidatos.add(c1);
        candidatos.add(c2);
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
        this.votos[idx] = numero;
        this.idx++;
    }
    
    public int[] getVotos() {
        return this.votos;
    }
    
    public Vector<Candidato> contabilizar() {
        /* contar todos os votos presentes no atributo votos, e armazenar o total de vontos em cada um 
        dos objetos Candidato presentes no atrituto candidatos.
        Deve retorna o atributo candidatos
        */
        return null;
    }
    
}
