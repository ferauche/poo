package br.unisantos.aula13_sol;

/**
 *
 * @author ferauche
 */
public class Candidato implements Comparable<Candidato> {
    
    private String nome;
    private int numero;
    private int totalVotos;
    
    public Candidato() {
        
    }
    
    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setTotalVotos(int t) {
        this.totalVotos = t;
    }
    
    public int getTotalVotos() {
        return this.totalVotos;
    }

    @Override
    public int compareTo(Candidato o) {
        if(o.getNumero() == this.numero) {
            return 0;
        }
        else if(o.getTotalVotos() < this.totalVotos) {
            return -1;
        }
        else {
            return 1;
        }
    }
    
}
