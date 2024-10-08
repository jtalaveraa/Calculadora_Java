package com.example.calculadorajava;

public class Suma extends Operacion {

    public Suma(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        return num1 + num2;
    }
}
