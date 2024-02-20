package org.example.test;

import org.example.CalculadoraAvanzada;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    private CalculadoraAvanzada calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new CalculadoraAvanzada();
    }

    @Test
    public void testRaizCuadrada() {
        double resultado = calculadora.raizCuadrada(25);
        assertEquals(5, resultado);
    }

    @Test
    public void testLogaritmoNatural() {
        double resultado = calculadora.logaritmoNatural(10);
        assertEquals(2.302585092994046, resultado);
    }

    @Disabled("La implementación del método está pendiente o en revisión.")
    @Test
    public void testFactorial() {
        long resultado = calculadora.factorial(5);
        assertEquals(120, resultado);
    }
}
