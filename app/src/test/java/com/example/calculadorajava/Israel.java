package com.example.calculadorajava;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.calculadorajava.testIsra.Persona;

import org.junit.Assert;
import org.junit.Test;

public class Israel {
    @Test
    public void testSuma() {
        Suma suma = new Suma(2.0, 3.0);

        double resultado = suma.calcular();
        assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void testResta() {
        Resta resta = new Resta(5.0, 3.0);

        double resultado = resta.calcular();
        assertEquals(2.0, resultado, 0.001);
    }

    @Test
    public void testMultiplicacion() {
        Multiplicacion multiplicacion = new Multiplicacion(2.0, 3.0);

        double resultado = multiplicacion.calcular();
        assertEquals(6.0, resultado, 0.001);
    }

    @Test
    public void testDivision() {
        Division division = new Division(6.0, 3.0);

        double resultado = division.calcular();
        assertEquals(2.0, resultado, 0.001);
    }
        @Test
    public void testPotencia() {
        Potencia potencia = new Potencia(2.0, 3.0);

        double resultado = potencia.calcular();
        assertEquals(8.0, resultado, 0.001);
    }

    @Test
    public void testRaiz() {
        Raiz raiz = new Raiz(9.0);

        double resultado = raiz.calcular();
        assertEquals(3.0, resultado, 0.001);
    }

    @Test
    public void SumaDouble() {
        Suma suma = new Suma(2.0, 3.0);

        Double resultado = suma.calcular();

        assertTrue(resultado instanceof Double);
    }

    @Test
    public void getNombre(){
        Persona persona = new Persona("Israel", 20);

        assertEquals("Israel", persona.getNombre());
    }

    @Test
    public void getEdad(){
        Persona persona = new Persona("Rodrigo", 30);
        assertEquals(30, persona.getEdad());

    }

    @Test
    public void testNombreString() {
        Persona persona = new Persona("Carlos", 40);
        assertTrue(persona.getNombre() instanceof String);
    }
}
