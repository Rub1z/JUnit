package org.example.test;

import org.example.ProcesadorTareasPesadas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcesadorTareasPesadasTest {

    @Test
    void testRendimientoOperacionIntensiva() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();
        long tiempoInicio = System.currentTimeMillis();

        // Ejecutar la operación intensiva
        procesador.realizarOperacionIntensiva();

        long tiempoFin = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFin - tiempoInicio;

        // Definir el límite de tiempo aceptable en milisegundos (por ejemplo, 5 segundos)
        long limiteTiempoAceptable = 5000;

        // Verificar que el tiempo de ejecución esté dentro del límite aceptable
        assertTrue(tiempoEjecucion <= limiteTiempoAceptable,
                "El tiempo de ejecución (" + tiempoEjecucion + " ms) excede el límite aceptable (" + limiteTiempoAceptable + " ms)");
    }
}
