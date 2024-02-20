package org.example.test;
import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(10, calculadora.sumar(5, 5));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-5, calculadora.restar(0, 5));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2));
        assertEquals(0.0, calculadora.dividir(0, 5));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}

