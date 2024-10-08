package com.example.calculadorajava;

public class Resta extends Operacion{
    public Resta(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        return num1 - num2;
    }
}
