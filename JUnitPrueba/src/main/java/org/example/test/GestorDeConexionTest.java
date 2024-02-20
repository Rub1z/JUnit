package org.example.test;
import org.example.GestorDeConexion;
import org.junit.jupiter.api.*;

public class GestorDeConexionTest{

    @BeforeAll
    public static void setUp() {
        // Cargar recursos pesados antes de todas las pruebas
        GestorDeConexion.abrirConexion();
    }

    @AfterAll
    public static void tearDown() {
        // Limpiar recursos pesados después de todas las pruebas
        GestorDeConexion.cerrarConexion();
    }

    @Test
    public void test1() {
        // Prueba 1
        System.out.println("Test 1 ejecutado");
        // Lógica de prueba...
    }

    @Test
    public void test2() {
        // Prueba 2
        System.out.println("Test 2 ejecutado");
        // Lógica de prueba...
    }

    // Agregar más pruebas según sea necesario
}
