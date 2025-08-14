package com.quatropilares.model;

abstract public class Pessoa {
    // atributos
    private String email;
    private String telefone;
    private String endereco;

    // construtor
    public Pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // set e get
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
}
