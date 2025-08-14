package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia:
        Conta conta = new Conta(null, null, "1234-5", "10101-0", 0);
        Scanner leia = new Scanner(System.in);

        //variavel
        int opcao;
        double valor;

        // entrada de dados:
        System.out.println("Informe o nome do titular:");
        conta.setTitular(leia.nextLine());
        System.out.println("Informe seu CPF:");
        conta.setCpf(leia.nextLine());

        do {
            System.out.println("\nJAVA BANK");
            System.out.println("1- Exibir dados.");
            System.out.println("2- Fazer depósito.");
            System.out.println("3- Fazer saque.");
            System.out.println("4- Sair do programa.");
            opcao = leia.nextInt();
            
            switch (opcao) {
                    case 1:
                    conta.exibirDados();
                    break;
                    case 2:
                    System.out.println("Quanto você deseja depositar:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito efetuado com sucesso. Saldo atual da conta é: R$ " + conta.fazerDeposito(valor) : "Valor do depósito inválido.");
                    break;
                    case 3:
                    System.out.println("Quanto você deseja sacar:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0 && valor <= conta.getSaldo()) ? "Saque efetuado com sucesso. Saldo atual da conta é: R$ " + conta.fazerSaque(valor) : "Valor do saque inválido.");
                    break;
                    case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
        // leia close
        leia.close();
    }
}
