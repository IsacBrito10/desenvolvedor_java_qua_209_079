package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner leia = new Scanner(System.in);

         //variáveis:
         String nome;
         int idade, opcao;
            // menu 1
               System.out.println("Informe seu nome:");
            nome = leia.nextLine();
            System.out.println("Informe sua idade:");
            idade = leia.nextInt();

         do {
            //menu 2
            System.out.println("\n" + "1- Harry Potter e a Pedra Filosofal. (Idade mínima: 10 anos.)");
            System.out.println("2- Os Vingadores. (Idade mínima: 12 anos.)");
            System.out.println("3- Pantera Negra. (Idade mínima: 14 anos.)");
            System.out.println("4- Deadpool. (Idade mínima: 16 anos.)");
            System.out.println("5- Coringa. (Idade mínima: 18 anos.)");
            System.out.println("Informe a sala de cinema desejada:");
            opcao = leia.nextInt();
            
             if(opcao >= 1 && opcao <= 5)
            { if(opcao == 1 && idade >= 10){
            System.out.println(nome + " pode pegar seu ingresso...");
                break;  
            }
            else if(opcao == 2 && idade >= 12){
                System.out.println(nome + " pode pegar seu ingresso...");
                break;
            }
            else if(opcao == 3 && idade >= 14){
                System.out.println(nome + " pode pegar seu ingresso...");
                break;
            }
            else if(opcao == 4 && idade >= 16){
                System.out.println(nome + " pode pegar seu ingresso...");
                break;
            }
            else if(opcao == 5 && idade >= 18){
                System.out.println(nome + " pode pegar seu ingresso...");
                break;
            }
                else if(opcao >= 1 && idade < 10){
                System.out.println(nome + " você não tem idade para ver nenhum filme do catálogo.");
                break;
            }
            else{
                System.out.println(nome + " você não tem a idade necessária para ver esse filme, selecione outro filme:");
            }
            }
         } while (idade >= 10);
         leia.close();
    }
}