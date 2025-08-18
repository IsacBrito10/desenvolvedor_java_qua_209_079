package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.model.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia
        Carro carro = new Carro(0, 0, 0, 0, 0);

        // cálculo
        carro.setValorG(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço da Gasolina:")));
        carro.setValorE(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do Etanol:")));
        
        if(carro.getValorE() >= carro.getResultado()){
            JOptionPane.showMessageDialog(null, "Compensa utilizar etanol", "Análise", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não compensa utilizar etanol", "Análise", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
