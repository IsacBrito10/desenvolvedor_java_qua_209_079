package com.atividade.app;

public class Conta {
    //atributos:
    public String nome, cpf, agencia, nc; // nc= numero da conta
    public double saldo;   

    // TODO

    //metodo
    public void exibirDados(){
        System.out.println("Nome do titular:" + this.nome);
        System.out.println("Cpf do titular:" + this.cpf);
        System.out.println("Agencia da conta:" + this.agencia);
        System.out.println("Numero da conta:" + this.nc);
    }
}
