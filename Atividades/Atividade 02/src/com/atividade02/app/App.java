package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner leia = new Scanner(System.in);

         //variáveis:
         String nome;
         int idade, opcao;

         do {
            //menu
            System.out.println("Informe seu nome:");
            nome = leia.nextLine();
            System.out.println("Informe sua idade:");
            idade = leia.nextInt();
            System.out.println("Filme 1.");
            System.out.println("Filme 2.");
            System.out.println("Filme 3.");
            System.out.println("Filme 4.");
            System.out.println("Filme 5.");
            System.out.println("Informe a sala de cinema desejada:");
            opcao = leia.nextInt();
            
            if(opcao >= 1 && opcao <= 5)
            { if(opcao == 1 && idade >= 10){
            System.out.println("Imprimindo o ingresso...");}
            else if(opcao == 2 && idade >= 12){
                System.out.println("Imprimindo o ingresso...");
            }
            else if(opcao == 3 && idade >= 14){
                System.out.println("Imprimindo o ingresso...");
            }
            else if(opcao == 4 && idade >= 16){
                System.out.println("Imprimindo o ingresso...");
            }
            else if(opcao == 5 && idade >= 18){
                System.out.println("Imprimindo o ingresso...");
            } 
            } 
         } while (// TODO);
    }
}
