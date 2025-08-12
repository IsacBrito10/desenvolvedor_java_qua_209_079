package com.atividade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //intancias
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta("", "", "1010-1", "10101-1", 0.0);

        // variavel
        int opcao;
        double valor;

        System.out.println("Informe o nome do titular:");
        cc.nome = leia.nextLine();
        System.out.println("Informe o CPF do titular da conta:");
        cc.cpf = leia.nextLine();

        do {
            //menu
            System.out.println("\nJAVA BANK");
            System.out.println("1- Exibir dados da conta.");
            System.out.println("2- Fazer depósito");
            System.out.println("3- Fazer saque.");
            System.out.println("4- Encerrar programa.");
            opcao = leia.nextInt();

            switch (opcao) {
                 case 1:
                    cc.exibirDados();
                    break;
                    case 2:
                    System.out.println("Quanto você deseja depositar?");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito efetuado com sucesso. Saldo atual da conta: R$" + cc.fazerDeposito(valor) : "Valor do depósito inválido.");
                    break;
                    case 3:
                    System.out.println("Quanto você deseja sacar?");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0 && valor <= cc.saldo) ? "Saque efetuado com sucesso. Saldo: R$ " + cc.fazerSaque(valor) : "Valor do saque inválido.");
                    break;
                    case 4:
                    System.out.println("Programa encerrado.");
                    break;
                    default: 
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        //leia close
        leia.close();
    }
}