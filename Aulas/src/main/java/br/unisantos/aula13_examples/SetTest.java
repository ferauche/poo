/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula13_examples;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class SetTest {
    
    private static String colors[] = {"red","white","blue","green","white","red","cyan"};
    
    public SetTest() {
        List<String> list = Arrays.asList(colors);
        System.out.printf("ArrayList: %s \n", list);
        printNonDuplicates(list);
    }
    
    private static void printNonDuplicates(Collection<String> collection) {
        Set<String> set = new HashSet<String>(collection);
        System.out.printf("Sets: %s \n", set);
    }
    
    public static void main(String args[]) {
        new SetTest();
    }
    
}
