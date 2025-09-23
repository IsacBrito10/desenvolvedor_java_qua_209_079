package com.polimorfismo.app;

final public class PessoaFisica extends Pessoa{
// atributos:
    public String nome;
    public String cpf;
    public String dataNascimento;

// construtor:
    public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
// metodo:
    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + ", meu cpf é " + this.cpf + ", nasci no dia " + this.dataNascimento + ", moro no endereço " + this.endereco + ", meu telefone é " + this.telefone + " e meu e-mail é " + this.email + ".";
    }
}
