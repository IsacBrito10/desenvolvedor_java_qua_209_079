package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Pessoa usuario = new Pessoa(
        null,
        null,
        null,
        null,
        null);
        Conta conta = new Conta(
        "1234-5",
        "12345-6",
        0, 
        usuario);
        
        // variavel
        String[] opcoes = {"Exibir dados da conta.", "Fazer depósito.", "Fazer saque.", "Sair."};
        Object opcao;
        double valor;

        // menu1 (Informar dados do usuario)
            usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
            usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta:"));
            usuario.setEmail(JOptionPane.showInputDialog("Informe o Email do titular da conta:"));
            usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do titular da conta:"));
            usuario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do titular da conta:"));


        do {
            opcao = JOptionPane.showInputDialog(null,
                "Selecione a opção desejada:",
                "JAVA BANK",
                JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]);

               switch (opcao.toString()){
                case "Exibir dados da conta.":
                    JOptionPane.showMessageDialog(null,
                    conta.exibirDados(),
                    "Dados da conta:",
                    JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Fazer depósito.":
                    valor = (Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito em R$:")));
                    JOptionPane.showMessageDialog(null,
                    "O depósito foi efetuado com sucesso.\n Saldo atual: R$ " + conta.fazerDeposito(valor),
                    "Depósito.",
                    JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Fazer saque.":
                    valor = (Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque: R$ ")));
                    JOptionPane.showMessageDialog(null,
                    "O saque foi efetuado com sucesso.\n Saldo atual: R$ " + conta.fazerSaque(valor),
                    "Saque.",
                    JOptionPane.INFORMATION_MESSAGE);
                    break;
               }
        } while (opcao != "Sair.");
    }
}
