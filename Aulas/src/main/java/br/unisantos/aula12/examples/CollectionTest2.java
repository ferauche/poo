/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula12.examples;

import java.util.*;
/**
 *
 * @author ferauche
 */
public class CollectionTest2 {
    
    private static final String[] cores = { "preto", "amarelo","verde","azul","azul","violeta","prateado" };
    private static final String[] cores2 = {"dourado", "branco","marrom","azul","cinza","prateado" };
    
    public CollectionTest2() {
        List<String> lista1 = new LinkedList<String>(Arrays.asList(cores));
        List<String> lista2 = new LinkedList<String>(Arrays.asList(cores2));
        
        lista1.addAll(lista2);
        
        imprimirLista(lista1);
        
        converterParaMaiusculo(lista1);
        
        imprimirLista(lista1);
        
        removerItens(lista1,0,4);
        
        imprimirLista(lista1);
        
        // String strings[] = lista1.toArray(new String[lista1.size()]);
    }
    
    private void imprimirLista(List<String> lista) {
        System.out.println();
        System.out.print("Lista..:");
        for(String s : lista) {
            System.out.print(" "+s);
        }
    }
    
    private void converterParaMaiusculo(List<String> lista) {
       /*for(int i=0; i<lista.size();i++) {
           String cor = lista.get(i);
           lista.set(i, cor.toUpperCase());
       }
       */
       
       for(String c : lista) {
            int idx = lista.indexOf(c);
            lista.set(idx,c.toUpperCase());  
       }
    }
    
    private void removerItens(List<String> lista, int inicio, int fim) {
        lista.subList(inicio, fim).clear();
    }
    
    public static void main(String args[]) {
        new CollectionTest2();
    }
    
}
