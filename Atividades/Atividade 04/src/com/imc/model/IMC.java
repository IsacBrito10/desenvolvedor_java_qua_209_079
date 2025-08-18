package com.imc.model;

public class IMC {
 //atributos
    private double peso, altura;
    public double imc;

    // constructor
    public IMC(double peso, double altura, double imc) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }
    // set e get
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc(double imc) {
        return this.imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    // metodos
    public double calculoImc() {
       return this.peso / (this.altura * this.altura);
    }

    public String diagnostico (double imc) {
       return (imc <= 18.5) ? "Você está abaixo do peso."
       : (imc < 25) ? "Você está com o peso ideal."
       : (imc < 30) ? "Você está acima do peso."
       : (imc < 35) ? "Você está com obesidade 1."
       : (imc < 40) ? "Você está com obesidade 2."
       : "Você está com obesidade mórbida.";
    }
}
