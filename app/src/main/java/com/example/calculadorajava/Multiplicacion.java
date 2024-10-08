package com.example.calculadorajava;

public class Multiplicacion extends Operacion{
    public Multiplicacion(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        return num1 * num2;
    }
}
