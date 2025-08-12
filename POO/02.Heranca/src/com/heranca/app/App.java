package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciar a classe PessoaFisica
         Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // definindo valores dos atributos do usuario:
        System.out.println("Informe o nome do usuario:");
        usuario.nome = leia.nextLine();
         System.out.println("Informe o CPF do usuario:");
        usuario.cpf = leia.nextLine();
         System.out.println("Informe o email do usuario:");
        usuario.email = leia.nextLine();
         System.out.println("Informe o telefone do usuario:");
        usuario.telefone = leia.nextLine();
         System.out.println("Informe o endereço do usuario:");
        usuario.endereco = leia.nextLine();

        // definindo valores dos atributos da empresa
        System.out.println("Informe a razão social:");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia da empresa:");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o cnpj da empresa:");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o email da empresa:");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone da empresa:");
        empresa.telefone = leia.nextLine();
        System.out.println("Informe o endereço da empresa:");
        empresa.endereco = leia.nextLine();

        // saida de dados:
        System.out.println("\nNome do usuario: " + usuario.nome);
        System.out.println("CPF do usuario: " + usuario.cpf);
        System.out.println("Email do usuario: " + usuario.email);
        System.out.println("Telefone do usuario: " + usuario.telefone);
        System.out.println("Endereço do usuario: " + usuario.endereco);
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome fantasia da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("Email da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);
        System.out.println("Endereço da empresa: " + empresa.endereco);

        //leia close
        leia.close();
    }
}
