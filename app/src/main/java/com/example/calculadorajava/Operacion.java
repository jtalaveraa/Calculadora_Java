package com.example.calculadorajava;

public class Operacion {
    protected double num1;
    protected double num2;

    public Operacion (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion(double num1) {
        this.num1 = num1;
    }

    public double calcular() {
        return 0;
    }
}
