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
public class TreeSetTest {
     private static String colors[] = {"red","white","blue","green","white","red","cyan"};
     
     public TreeSetTest() {
         SortedSet<String>  tree = new TreeSet<String>(Arrays.asList(colors));
         System.out.printf("Elementos ordenados: %s \n", tree);
         System.out.println("Headset green");
         printSetTest(tree.headSet("green"));
         System.out.println("Tailset green");
         printSetTest(tree.tailSet("green"));
     }
     
     
     private static void printSetTest(SortedSet<String> set) {
         System.out.printf("%s \n", set);
     }
     
     public static void main(String args[]) {
         new TreeSetTest();
     }
}
