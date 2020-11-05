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
public class CollectionTest {
    
    private static final String[] colors = {"MARROM","VERMELHO","BRANCO", "AZUL","VERDE"};
    private static final String[] removeColors = {"VERMELHO","BRANCO","AZUL"};
    
    public CollectionTest() {
        List<String> list = new ArrayList<String> ();
        List<String> removeList = new ArrayList<String> ();
        
        
        
        for(String c : colors) {
            list.add(c);
        }
        
        for(String c : removeColors) {
            removeList.add(c);
        }
        
        System.out.print("Conteúdo original:");
        for(int i=0; i<list.size();i++) {
            System.out.print(" "+list.get(i));
        }
        
        removeColors(list, removeList);
        System.out.println();
        System.out.print("Conteúdo após a remoção:");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.print(" "+it.next());
        }
    }
    
    private void removeColors(List<String> collection1, List<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
        while(iterator.hasNext()) {
            if(collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
    
    public static void main(String args[]) {
        new CollectionTest();
    }
}
