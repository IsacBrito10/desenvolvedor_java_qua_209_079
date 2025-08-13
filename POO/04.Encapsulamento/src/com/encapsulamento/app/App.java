package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia da classe Pessoa:
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner(System.in);

        // entrada de dados:
        System.out.println("Informe seu nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe sua idade:");
        usuario.setIdade(leia.nextInt());

        // saida de dados:
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade() + " anos.");
        leia.close();
    }
}
