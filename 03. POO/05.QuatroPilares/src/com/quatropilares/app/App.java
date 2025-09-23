package com.quatropilares.app;
import java.util.Scanner;
import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia do objeto:
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        // entrada de dados da PessoaFisica:
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("Informe seu nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe sua data de nascimento: ");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("Informe seu CPF: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe seu email: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe seu telefone: ");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Informe seu endereço: ");
        usuario.setEndereco(leia.nextLine());

        // entrada de dadis da PessoaJuridica
        System.out.println("\nDADOS DA EMPRESA:");
        System.out.println("Informe a razão social da sua empresa:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome fantasia da sua empresa:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o CNPJ da sua empresa:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o email da sua empresa:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone da sua empresa:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço da sua empresa:");
        empresa.setEndereco(leia.nextLine());

        // saida de dados do usuário:
        System.out.print("\nINFORMAÇÕES DO USUÁRIO:");
        System.out.printf("\nNome: " + usuario.getNome());
        System.out.printf("\nData de nascimento: " + usuario.getDataNascimento());
        System.out.printf("\nCPF: " + usuario.getCpf());
        System.out.printf("\nEmail: " + usuario.getEmail());
        System.out.printf("\nTelefone: " + usuario.getTelefone());
        System.out.printf("\nEndereço: " + usuario.getEndereco() + "\n");

        // saída de dados da empresa:
        System.out.print("\nDADOS DA EMPRESA:");
        System.out.printf("\nRazão social: " + empresa.getRazaoSocial());
        System.out.printf("\nNome Fantasia: " + empresa.getNomeFantasia());
        System.out.printf("\nCNPJ: " + empresa.getCnpj());
        System.out.printf("\nEmail: " + empresa.getEmail());
        System.out.printf("\nTelefone: " + empresa.getTelefone());
        System.out.printf("\nEndereço: " + empresa.getEndereco());

        // leia close:
        leia.close();
    }
}
