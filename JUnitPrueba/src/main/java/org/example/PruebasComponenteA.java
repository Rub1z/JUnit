package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteA")
public class PruebasComponenteA {

    private final ComponenteA componenteA = new ComponenteA();

    @Test
    public void testOperacionA() {
        assertEquals("Resultado de operación A", componenteA.operacionA());
    }
}

