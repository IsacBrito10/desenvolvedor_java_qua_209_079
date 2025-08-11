package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {    
    // intancia as classe:
    Pessoa usuario = new Pessoa("", 0, 0.0);
    Scanner leia = new Scanner(System.in);  
    
    //defina os valores dos atributos:
    System.out.println("Informe o nome: ");
    usuario.nome = leia.nextLine();
    System.out.println("Informe sua idade: ");
    usuario.idade = leia.nextInt();
    System.out.println("Informe sua altura: ");
    usuario.altura = leia.nextDouble();
    
    // saída de dados:
    System.out.println(usuario.cumprimentar());
    usuario.exibirDados();

    //leia close
    leia.close();
    }
}
