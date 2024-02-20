package org.example.test;

import org.example.ProcesadorTareas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasTest {

    private final ProcesadorTareas procesador = new ProcesadorTareas();

    @Test
    @Timeout(1000) // Establece un límite de tiempo de 1000 milisegundos (1 segundo)
    public void pruebaTareaLarga() {
        assertDoesNotThrow(() -> procesador.ejecutarTareaLarga(500)); // Tarea debería completarse en 500 ms
    }
}
