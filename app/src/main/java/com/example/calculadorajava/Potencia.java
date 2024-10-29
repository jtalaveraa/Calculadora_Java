package com.example.calculadorajava;



public class Potencia extends Operacion {

    public Potencia (double num1, double num2){ super(num1, num2); }

    @Override
    public double calcular() {
        return Math.pow(num1, num2);
    }


}
