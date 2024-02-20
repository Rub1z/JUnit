package org.example.test;

import org.example.GestorDeTareas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {
    private GestorDeTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDeTareas();
        // Agregar tareas predeterminadas
        List<String> tareasPredeterminadas = Arrays.asList("Tarea 1", "Tarea 2", "Tarea 3");
        tareasPredeterminadas.forEach(gestor::agregarTarea);
    }

    @AfterEach
    void tearDown() {
        // Limpiar tareas después de cada prueba
        gestor.limpiarTareas();
    }

    @Test
    void testAgregarTarea() {
        gestor.agregarTarea("Nueva Tarea");
        assertEquals(4, gestor.obtenerTareas().size());
    }

    @Test
    void testEliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 2"));
        assertFalse(gestor.obtenerTareas().contains("Tarea 2"));
    }

    @Test
    void testLimpiarTareas() {
        gestor.limpiarTareas();
        assertTrue(gestor.obtenerTareas().isEmpty());
    }
}
