package org.example.test;

import org.example.GeneradorReportes;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneradorReportesTest {

    private final GeneradorReportes generador = new GeneradorReportes();

    @TestFactory
    public Stream<DynamicTest> testGenerarReporte() {
        List<String> datos1 = Arrays.asList("Dato 1", "Dato 2", "Dato 3");
        List<String> datos2 = Arrays.asList("Info 1", "Info 2", "Info 3", "Info 4");
        List<String> datos3 = Arrays.asList("Elemento 1", "Elemento 2");

        return Stream.of(
                dynamicTest("Prueba con datos 1", datos1, "Reporte:\n- Dato 1\n- Dato 2\n- Dato 3\n"),
                dynamicTest("Prueba con datos 2", datos2, "Reporte:\n- Info 1\n- Info 2\n- Info 3\n- Info 4\n"),
                dynamicTest("Prueba con datos 3", datos3, "Reporte:\n- Elemento 1\n- Elemento 2\n")
        );
    }

    private DynamicTest dynamicTest(String testName, List<String> inputData, String expectedOutput) {
        return DynamicTest.dynamicTest(testName, () -> {
            String actualOutput = generador.generarReporte(inputData);
            assertEquals(expectedOutput, actualOutput);
        });
    }
}

