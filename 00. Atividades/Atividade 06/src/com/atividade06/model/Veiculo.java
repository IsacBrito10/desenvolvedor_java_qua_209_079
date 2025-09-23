package com.atividade06.model;

import com.atividade06.interfaces.IVeiculo;

public class Veiculo implements IVeiculo{
    // atributos
    private Pessoa proprietário;
    private String placa;
    private String cor;
    private String modelo;
    private String fabricante;
    private String ano;

    //construtor
    public Veiculo(Pessoa proprietário, String placa, String cor, String modelo, String fabricante, String ano) {
        this.proprietário = proprietário;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    // set e get
    public Pessoa getProprietário() {
        return this.proprietário;
    }
    public void setProprietário(Pessoa proprietário) {
        this.proprietário = proprietário;
    }
    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getAno() {
        return this.ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String exibirDados() {
        return 
        "Nome do proprietário do veículo: " + this.proprietário.getNome() + "." +
        "\n CPF do proprietário do veículo: " + this.proprietário.getCpf() + "." +
        "\n Email do proprietário do veículo: " + this.proprietário.getEmail() + "." +
        "\n Telefone do proprietário do veículo: " + this.proprietário.getTelefone() + "." +
        "\n Endereço do proprietário do veículo: " + this.proprietário.getEndereco() + "." +
        "\n Data de nascimento do proprietário do veículo: " + this.proprietário.getDataNascimento() + "." +
        "\n Cnh do proprietário do veículo: " + this.proprietário.getCnh() + "." +
        "\n Modelo do veículo: " + this.modelo + "." +
        "\n Fabricante do veículo: " + this.fabricante + "." +
        "\n Placa do veículo: " + this.placa + "." +
        "\n Cor do veículo: " + this.cor + "." +
        "\n Ano do veículo: " + this.ano + ".";
    }

    //metodo
    


}
