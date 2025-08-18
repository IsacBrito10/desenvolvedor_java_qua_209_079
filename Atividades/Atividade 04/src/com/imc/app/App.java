package com.imc.app;

import javax.swing.JOptionPane;

import com.imc.model.IMC;


public class App {
    public static void main(String[] args) throws Exception {
        // instancia
        IMC imc = new IMC(0.0, 0.0, 0.0);

        //variavel
        String[] opcoes = {"Calcular IMC", "Sair do programa"};
        Object opcao;

        double imcValor;

        do {
            opcao = JOptionPane.showInputDialog(null, "Selecione uma opção", "IMC", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            
            if (opcao == "Calcular IMC") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em KG:").replace(",", ".")));
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:").replace(",", ".")));
                
                imcValor = imc.calculoImc();

                JOptionPane.showMessageDialog(null,
                "Valor do IMC: " + String.format("%.2f", imcValor) + "\n" + imc.diagnostico(imcValor), 
                "Diagnostico",
                JOptionPane.INFORMATION_MESSAGE);
            }
        } while (opcao != "Sair do programa");
    }
}
