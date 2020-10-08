/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula9;

import java.util.*;

/**
 *
 * @author ferauche
 */
public class Calculadora {
    
    public static void main(String args[]) {
        
        String option;
        int digitado = 0;
        
        Scanner sc = new Scanner(System.in);
        
        Operacao op = new Operacao();
        
        char key = 0;
        
        while(key != 27) {
            try {
                System.out.println(">> "+op.getResultado());
                System.out.println("Digitie uma operação.: ");
                option = sc.next();
                key = option.charAt(0);
                System.out.println(">> "+key);
                System.out.println("Digite o numero.: ");
                digitado = sc.nextInt();
                switch(key) {
                    case 47: op.dividir(digitado);
                             break;
                    case 61: op.setResultado(digitado);
                             break;
                    case 27: System.out.println("Encerrando o programa");
                             break;
                }
            }
            catch(ArithmeticException ae) {
                System.out.println("Erro provavel divisao por 0");
            }
            catch(InputMismatchException ime) {
                System.out.println("Erro de entrada de dados! Corrija a entrada!");
            }
            catch(Exception e) {
                System.out.println("Deu erro!");
                e.printStackTrace();
            }
        }
    }
    
}
