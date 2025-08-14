package com.regras.model;

import com.regras.interfaces.IConta;

public class Conta implements IConta{
    // atributos
    private String titular;
    private String cpf; 
    private String agencia;
    private String nConta; //nConta = numero da conta
    private double saldo;

    // construtor
    public Conta(String titular, String cpf, String agencia, String nc, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nc;
        this.saldo = saldo;
    }

    // set e get
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNConta() {
        return this.nConta;
    }
    public void setNConta(String nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void exibirDados() {
        System.out.print("\nNome do titular: " + this.titular);
        System.out.print("\nCPF do titular: " + this.cpf);
        System.out.print("\nAgência: " + this.agencia);
        System.out.print("\nNúmero da conta: " + this.nConta);
        System.out.print("\nSaldo da conta: R$ " + String.format("%.2f", this.saldo));
    }
    @Override
    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }
    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
    
}
