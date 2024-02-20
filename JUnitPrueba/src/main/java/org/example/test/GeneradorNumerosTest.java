package org.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.example.GeneradorNumeros;
import org.junit.jupiter.api.Test;

public class GeneradorNumerosTest {

    GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void testGenerarNumeroAleatorioEnRango() {
        // Prueba con diferentes rangos y números generados aleatoriamente
        for (int i = 0; i < 100; i++) {
            int min = generador.generarNumeroAleatorioEnRango(-1000, 1000);
            int max = generador.generarNumeroAleatorioEnRango(min, 2000);
            int numero = generador.generarNumeroAleatorioEnRango(min, max);
            assertTrue(numero >= min && numero <= max, "Número generado dentro del rango");
        }
    }

    @Test
    void testEsPar() {
        // Prueba con números generados aleatoriamente
        for (int i = 0; i < 100; i++) {
            int numero = generador.generarNumeroAleatorioEnRango(Integer.MIN_VALUE, Integer.MAX_VALUE);
            boolean esperado = numero % 2 == 0;
            assertEquals(esperado, generador.esPar(numero), "Número par/impares verificado correctamente");
        }
    }
}
