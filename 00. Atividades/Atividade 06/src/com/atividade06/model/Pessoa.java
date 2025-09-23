package com.atividade06.model;

public class Pessoa {
    // atributos
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String dataNascimento;
    private String cnh;

    // construtor
    public Pessoa(String nome, String cpf, String email, String telefone, String endereco, String dataNascimento, String cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.cnh = cnh;
    }

    //set e get
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     public String getCnh() {
        return this.cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    }

