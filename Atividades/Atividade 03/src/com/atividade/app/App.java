package com.atividade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //intancias
        Conta dados = new Conta();
        Scanner leia = new Scanner (System.in);

        // valores dos atributos
        System.out.println("Informe o nome do titular da conta:");
        dados.nome = leia.nextLine();
        System.out.println("Insira o CPF do titular:");
        dados.nome = leia.nextLine();
        System.out.println("Insira o número da agencia:");
        dados.nome = leia.nextLine();
        System.out.println("Insira o número da conta:");
        dados.nome = leia.nextLine();

        do {
            dados.exibirDados();
            System.out.println();
            System.out.println("O que você deseja fazer?");
            
        } while (condition);
        // leia close
        leia.close();
    }
}
