package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia do objeto de entrada de dados:
        Scanner leia = new Scanner(System.in);
        
        // declaração de variáveis:
        String nome;
        double peso, altura;
        double result;
        int opcao;

        // menu
        do {
            System.out.println();
            System.out.println("1- Calcular IMC.");
            System.out.println("2- Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();
                // limpeza de buffer:
            leia.nextLine();
                // verifica IMC
                  
                if(opcao == 1)
                {
                System.out.println("Informe seu nome:");
                nome = leia.nextLine();
                System.out.println("Informe seu peso:");
                peso = leia.nextDouble();
                System.out.println("Informe sua altura:");
                altura = leia.nextDouble();
                  result = peso/(altura*altura);
                    if(result <= 18.4) System.out.println(nome + " você está abaixo do peso.");
                    else if(result >= 18.5 && result <=24.9) System.err.println(nome + " você está com o peso ideal.");
                    else if(result >= 25 && result <=29.9) System.err.println(nome + " você está acima do peso.");
                    else if(result >= 30 && result <=34.9) System.err.println(nome + " você está com obesidade grau 1.");
                    else if(result >= 35 && result <=39.9) System.err.println(nome + " você está com obesidade grau 2.");
                    else if(result >= 40) System.err.println(nome + " você está com obesidade mórbida.");
                } 
                else if (opcao != 2){
                    System.out.println("Opção inválida.");
                }
                else{
                   System.out.println("Programa encerrado.");
                }
            } while (opcao == 1);
        // fechar leia:
        leia.close();
    }
}