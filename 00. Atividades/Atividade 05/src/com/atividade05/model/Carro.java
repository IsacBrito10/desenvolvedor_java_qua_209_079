package com.atividade05.model;

public class Carro {
    //atributos
    private double etanol, gasolina;
    
    // constructor

    public Carro(double etanol, double gasolina, double resultado) {
        this.etanol = etanol;
        this.gasolina = gasolina;
    }
    
    // set e get
    public double getEtanol() {
        return this.etanol;
    }
    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }
    public double getGasolina() {
        return this.gasolina;
    }
    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }    
    // metodo
        public String calculo(){
            return (this.etanol >= this.gasolina * 0.7) ? "Não compensa utilizar Etanol. Utilize Gasolina."
            : "Compensa utilizar etanol.";
        }
}
