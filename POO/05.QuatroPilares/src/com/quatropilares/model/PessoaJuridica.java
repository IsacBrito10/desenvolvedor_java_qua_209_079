package com.quatropilares.model;

final public class PessoaJuridica extends Pessoa{
    //atributos:
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    //construtor:
    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = nomeFantasia;
        this.nomeFantasia = razaoSocial;
        this.cnpj = cnpj;
    }

    //set e get
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}