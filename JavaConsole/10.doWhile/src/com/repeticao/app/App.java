package com.repeticao.app;

import java.util.Scanner;

public class App {   public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // variáveis:
        String nome;
        int idade, opcao;
        double altura;

        // faça enquanto
        do {
            //menu:
            System.out.println();
        System.out.println("1- Registrar nova entrada.");
        System.out.println("2- Sair do programa:");
        System.out.printf("Informe a opção desejada: ");
        opcao = leia.nextInt();
        if(opcao == 1){
            // limpeza de buffer
        leia.nextLine();
            // entrada de dados
         System.out.println();
        System.out.printf("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.printf("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.printf("Informe sua altura: ");
        altura = leia.nextDouble();

            //verifica a idade e a altura
        if(idade >= 12 && altura >= 1.15){
            System.out.println(nome + " está autorizado.");
        }
        else{
            System.out.println(nome + " não está autorizado.");
        }
        }
        else if(opcao != 2){
            System.out.println("Opção inválida.");
        }
        } while (opcao != 2);
        leia.close();
}
}