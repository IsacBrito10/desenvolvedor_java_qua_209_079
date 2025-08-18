package com.atividade05.model;

public class Carro {
    //atributos
    private double valorE, valorG, resultado;
    
    // constructor

    public Carro(double valorE, double valorG, double resultado, double etanol, double gasolina) {
        this.valorE = valorE;
        this.valorG = valorG;
        this.resultado = resultado;
    }
    
    // set e get
    public double getValorE() {
        return this.valorE;
    }
    public void setValorE(double valorE) {
        this.valorE = valorE;
    }
    public double getValorG() {
        return this.valorG;
    }
    public void setValorG(double valorG) {
        this.valorG = valorG;
    }
    public double getResultado() {
        return this.resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    // metodo
        public double calculo(double valor){
            resultado = valorG * (70/100);
            return this.resultado;            
        }
}
