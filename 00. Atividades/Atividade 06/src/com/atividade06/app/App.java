package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia
        Pessoa usuario = new Pessoa(null,
        null,
        null,
        null,
        null,
        null,
        null);

        Veiculo veiculo = new Veiculo(usuario,
        null,
        null,
        null,
        null,
        null);

            // input
            usuario.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário do veículo:"));
            usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário do veículo:"));
            usuario.setEmail(JOptionPane.showInputDialog("Informe o E-mail do proprietário do veículo:"));
            usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do proprietário do veículo:"));
            usuario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do proprietário do veículo:"));
            usuario.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do proprietário do veículo:"));
            usuario.setCnh(JOptionPane.showInputDialog("Informe a CNH do proprietário do veículo:"));
            veiculo.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo:"));
            veiculo.setFabricante(JOptionPane.showInputDialog("Informe o fabricante do veículo:"));
            veiculo.setPlaca(JOptionPane.showInputDialog("Informe a placa do veículo:"));
            veiculo.setCor(JOptionPane.showInputDialog("Informe a cor do veículo:"));
            veiculo.setAno(JOptionPane.showInputDialog("Informe o ano do veículo:"));
        
            //output
            JOptionPane.showMessageDialog(null,
            veiculo.exibirDados(),
            "Dados do proprietário e do veículo:",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
