package com.projeto.app.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Desaparecido implements Serializable{
    // atributos
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idDesaparecido;

    // DADOS PESSOAIS DA PESSOA
    private String nome;
    private String cpf;
    private String genero;
    private String dataNascimento;
    
    // DADOS FISICOS DA PESSOA
    private double altura;
    private double peso;
    private String cOlho; // COR DOS OLHOS
    private String cCabelo; // COR DO CABELO
    private String cPele; // COR DA PELE
    private String sinais; // POSSÍVEIS CICATRIZES OU SINAIS CORPORAIS COMO PINTAS E ETC

    // DADOS DE CONTATO PARA AUXÍLIO NA INVESTIGAÇÃO
    private String email;
    private String telefone; 

    // DADOS DO DESAPARECIMENTO
    private String dataDesaparecimento;
    private String cep; 
    private String estado; 
    private String cidade; 
    private String bairro; 
    private String logradouro; 
    private String complemento; 
    private String numero; 
    private String roupa; 
    private String circunstancias;
    
    //CASO A PESSOA QUEIRA COMPLEMENTAR ALGO
    private String complementoCaso;

    //status

    // constructor
    public Desaparecido() {
    }

    // get and set

    public long getIdDesaparecido() {
        return this.idDesaparecido;
    }

    public void setIdDesaparecido(long idDesaparecido) {
        this.idDesaparecido = idDesaparecido;
    }

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

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCOlho() {
        return this.cOlho;
    }

    public void setCOlho(String cOlho) {
        this.cOlho = cOlho;
    }

    public String getCCabelo() {
        return this.cCabelo;
    }

    public void setCCabelo(String cCabelo) {
        this.cCabelo = cCabelo;
    }

    public String getCPele() {
        return this.cPele;
    }

    public void setCPele(String cPele) {
        this.cPele = cPele;
    }

    public String getSinais() {
        return this.sinais;
    }

    public void setSinais(String sinais) {
        this.sinais = sinais;
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

    public String getDataDesaparecimento() {
        return this.dataDesaparecimento;
    }

    public void setDataDesaparecimento(String dataDesaparecimento) {
        this.dataDesaparecimento = dataDesaparecimento;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRoupa() {
        return this.roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getCircunstancias() {
        return this.circunstancias;
    }

    public void setCircunstancias(String circunstancias) {
        this.circunstancias = circunstancias;
    }

    public String getComplementoCaso() {
        return this.complementoCaso;
    }

    public void setComplementoCaso(String complementoCaso) {
        this.complementoCaso = complementoCaso;
    }

}
