/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula14_examples;

import java.io.*;
import java.util.*;

/**
 *
 * @author ferauche
 */
public class WordTypeCount {
    
    private Map<String, Integer> map = new HashMap<String, Integer>();
    private String[] strings = {"Unisantos","unisantos", "Ciências","da","Computação"};
    private List<String> lstrings = new ArrayList<String>(Arrays.asList(strings));
    
    private void countWord() {
        
        Iterator<String> it = lstrings.iterator();
        while(it.hasNext()) {
           String str = it.next().toLowerCase();
           if(map.containsKey(str)) {
               int count = map.get(str);
               map.put(str, count+1);
            }
           else {
               map.put(str, 1);
           }
        }
    }
    
    private void exibirMap() {
        Set<String> keys = map.keySet();
        SortedSet<String> skeys = new TreeSet<String>(keys);
        
        for(String s : skeys) {
            System.out.println(s+" - "+map.get(s));
        }
    }
    
    private void saveProperties() throws IOException {
        Properties props = new Properties();
        FileOutputStream fos = new FileOutputStream("count.txt");
        
        for(String s : map.keySet()) {
            props.put(s, Integer.toString(map.get(s)));
        }    
        props.store(fos, "Contagem das palavras");
    }
    
    private void getProperties() throws IOException {
        FileInputStream fis = new FileInputStream("count.txt");
        Properties props = new Properties();
        
        props.load(fis);
        
        Set keys = props.keySet();
        
        for(Object o : keys) {
            int count = Integer.parseInt((String)props.get(o));
            map.put((String)o, count);
        }
    }
    
    public WordTypeCount() {
        try {
            getProperties();
            countWord();
            exibirMap();
            saveProperties();
        }
        catch(IOException io) {
            System.out.println(io.getMessage());
        }
    }
    
    public static void main(String args[]) {
        new WordTypeCount();
    }
   
    
}
