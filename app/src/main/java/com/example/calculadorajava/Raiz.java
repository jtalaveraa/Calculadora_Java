package com.example.calculadorajava;

public class Raiz extends Operacion{

    public Raiz(double num1) {
        super(num1);
    }

    @Override
    public double calcular() {
        return Math.sqrt(num1);
    }
}
