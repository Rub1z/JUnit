package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteB")
public class PruebasComponenteB {

    private final ComponenteB componenteB = new ComponenteB();

    @Test
    public void testOperacionB() {
        assertEquals(42, componenteB.operacionB());
    }
}

