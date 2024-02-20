package org.example.test;

import org.example.CalculadoraFinanciera;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraFinancieraTest {

    private CalculadoraFinanciera calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraFinanciera();
    }

    @Test
    void calcularInteresCompuesto_deberiaCalcularCorrectamente() {
        double principal = 1000;
        double tasaInteres = 0.05;
        int numeroCompuestos = 12; // Mensualmente
        int años = 5;
        double resultadoEsperado = 1000 * Math.pow(1 + (0.05 / 12), 12 * 5); // Fórmula del interés compuesto
        assertEquals(resultadoEsperado, calculadora.calcularInteresCompuesto(principal, tasaInteres, numeroCompuestos, años));
    }

    @Test
    void calcularVPN_deberiaCalcularCorrectamente() {
        double tasaDescuento = 0.1;
        double[] flujosCaja = {-1000, 200, 300, 400, 500};
        double resultadoEsperado = -1000 + 200 / Math.pow(1 + 0.1, 1) + 300 / Math.pow(1 + 0.1, 2) +
                400 / Math.pow(1 + 0.1, 3) + 500 / Math.pow(1 + 0.1, 4);
        assertEquals(resultadoEsperado, calculadora.calcularVPN(tasaDescuento, flujosCaja));
    }
}
