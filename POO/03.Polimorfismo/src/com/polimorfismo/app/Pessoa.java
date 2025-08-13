package com.polimorfismo.app;

abstract public class Pessoa {
// atributos
    public String email;
    public String telefone;
    public String endereco;

// construtor
    public Pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

// metodo
    public String cumprimentar() {
        return null;
    }
    
}
