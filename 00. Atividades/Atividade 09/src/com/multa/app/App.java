package com.multa.app;
import javax.swing.JOptionPane;

import com.multa.app.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia
        Veiculo carro = new Veiculo();

        //variaveis
        String[] opcoes = {"Averiguar Multa", "Sair"};
        Object opcao;

        //menu 
        do {
            opcao = JOptionPane.showInputDialog(null,
            "Selecione a opção:",
            "Multa", JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes, opcoes[0]);  

            if (opcao == "Averiguar Multa") {
                carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro:"));
                carro.setFabricante(JOptionPane.showInputDialog("Informe o fabricante do carro:"));
                carro.setDistancia(Double.parseDouble(JOptionPane.showInputDialog("Informe a distancia entre os pardais(Em KM):")));
                carro.setTempo(Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo que o carro demora de atravessar os pardais(Em Minutos):")));
                carro.averiguarMulta();

                if(carro.getVelMedia() > 80){
                    JOptionPane.showMessageDialog(null,
                    "O proprietario do " + carro.getModelo() + " " + carro.getFabricante() + " foi multado." +
                    " A velocidade do veículo era de: " + carro.getVelMedia() + "KM/H",
                    "Multa",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,
                    "O proprietario do " + carro.getModelo() + " " + carro.getFabricante() + " não foi multado." +
                    " A velocidade do veículo era de: " + carro.getVelMedia() + "KM/H",
                    "Multa",
                    JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,
                "Você encerrou o programa.",
                "Saída",
                JOptionPane.INFORMATION_MESSAGE);
            }
        } while (opcao != "Sair");
        


    }
}
