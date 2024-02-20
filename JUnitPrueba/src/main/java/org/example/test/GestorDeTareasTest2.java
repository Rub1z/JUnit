package org.example.test;

import org.example.GestorDeTareas2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest2 {

    GestorDeTareas2 gestorDeTareas;

    @BeforeEach
    void setUp() {
        gestorDeTareas = new GestorDeTareas2();
    }

    @Nested
    class AgregarTareaTest {

        @Test
        void deberiaAgregarTarea() {
            gestorDeTareas.agregarTarea("1", "Tarea 1");
            assertEquals("Tarea 1", gestorDeTareas.buscarTareaPorId("1").orElse(null));
        }
    }

    @Nested
    class EliminarTareaTest {

        @Test
        void deberiaEliminarTareaExistente() {
            gestorDeTareas.agregarTarea("1", "Tarea 1");
            assertTrue(gestorDeTareas.eliminarTarea("1"));
        }

        @Test
        void noDeberiaEliminarTareaInexistente() {
            assertFalse(gestorDeTareas.eliminarTarea("1"));
        }
    }

    @Nested
    class BuscarTareaPorIdTest {

        @Test
        void deberiaEncontrarTareaExistente() {
            gestorDeTareas.agregarTarea("1", "Tarea 1");
            Optional<String> tareaEncontrada = gestorDeTareas.buscarTareaPorId("1");
            assertTrue(tareaEncontrada.isPresent());
            assertEquals("Tarea 1", tareaEncontrada.get());
        }

        @Test
        void noDeberiaEncontrarTareaInexistente() {
            Optional<String> tareaEncontrada = gestorDeTareas.buscarTareaPorId("1");
            assertFalse(tareaEncontrada.isPresent());
        }
    }
}

