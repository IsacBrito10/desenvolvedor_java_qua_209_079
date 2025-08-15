package com.dialogos.app;

import javax.swing.JOptionPane;

import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
    // instancia:
    Pessoa usuario = new Pessoa(null, 0);

    // caixa entrada de dados:
    usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
    usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

    // caixa de saida de dados:
    JOptionPane.showMessageDialog(
    null, 
    "Seu nome é: " + usuario.getNome() + "." +
    "\nIdade: " + usuario.getIdade() + " anos.", 
    "Saída", 
    JOptionPane.INFORMATION_MESSAGE);
    }
}