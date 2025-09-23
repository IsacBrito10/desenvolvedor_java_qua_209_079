package com.multa.app.model;

import com.multa.app.interfaces.Multa;

public class Veiculo implements Multa{
    //variaveis
    private String modelo;
    private String fabricante;
    private double distancia;
    private double tempo;
    private double velMedia;
    //constructor
    public Veiculo() {
    }

    //get and set
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
    public double getDistancia() {
        return this.distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getTempo() {
        return this.tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public double getVelMedia() {
        return this.velMedia;
    }
    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }

    //metodo
    @Override
    public double averiguarMulta(){
        tempo = tempo/60;
        velMedia= distancia/tempo;
        return this.velMedia;
    }
}
