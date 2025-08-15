package com.calculadora.controller;

public class Calculadora implements ICalculadora{
    // atributos
    private double x;
    private double y;

    // construtor
    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // set e get
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    // metodos iCalculadora
    @Override
    public double somar(double x, double y) {
        return x + y;
    }

    @Override
    public double subtrair(double x, double y) {
        return x - y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x * y;
    }

    @Override
    public double dividir(double x, double y) {
        return x / y;
    }
}
