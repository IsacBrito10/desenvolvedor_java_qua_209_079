package com.atividade.app;

public class Conta {
    //atributos:
    public String nome, cpf, agencia, nc; // nc= numero da conta
    public double saldo;
    //construtor
    public Conta(String nome, String cpf, String agencia, String nc, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nc = nc;
        this.saldo = saldo;
    }

    //metodo
    public void exibirDados(){
        System.out.println("\nNome do titular: " + this.nome + ".");
        System.out.println("Cpf do titular:: " + this.cpf + ".");
        System.out.println("Numero da agencia: " + this.agencia + ".");
        System.out.println("Numero da conta: " + this.nc + ".");
        System.out.println("Saldo da conta: R$ " + String.format("%.2f", this.saldo) + ".");
    }

    public double fazerDeposito(double valor){
        this.saldo =+ valor;
        return this.saldo;
    }
    
    public double fazerSaque(double valor){
        this.saldo =- valor;
        return this.saldo;
    }
}
