package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.model.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia
        Carro carro = new Carro(0, 0, 0);

        // variavel
        String[] opcoes = {"Conferir compensação.", "Encerrar programa."};
        Object opcao;

        do {
        // menu
            opcao = JOptionPane.showInputDialog(null, "Selecione uma opção", "Compensação", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            
        // cálculo
        if(opcao == "Conferir compensação."){
            carro.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço da Gasolina:").replace(",", ".")));
            carro.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do Etanol:").replace(",", ".")));
            
            JOptionPane.showMessageDialog(null,
            carro.calculo(),
            "Verificar se compensa.",
            JOptionPane.INFORMATION_MESSAGE);
            }
        }while (opcao != "Encerrar programa.");
    }   
}