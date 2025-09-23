package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)  throws Exception {
        // instancia do objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis:
        String nome;
        int idade;
        double altura;

        // entrada de dados:
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura:");
        altura = leia.nextDouble();

        if (idade >= 12 && altura >= 1.15){
            System.out.println(nome + " está autorizado.");
        }
        else{
            System.out.println(nome + " não está autorizado");
        }

        //fechar objeto:
        leia.close();
    }
}
