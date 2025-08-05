package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia do objeto de entrada de dados:
        Scanner leia = new Scanner(System.in);
         //declaração das variaveis
         String nome;
         int idade;

         //entrada de dados:
         System.out.println("Informe seu nome:");
         nome = leia.nextLine();
         System.out.println("Informe sua idade:");
         idade = leia.nextInt();

         if(idade >= 18){
            System.out.println(nome + " é maior de idade.");
         }
         else{
            System.out.println(nome + " é menor de idade.");
         }
         
         // fechar objeto leia:
        leia.close();
    }
}
