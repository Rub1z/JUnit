package org.example.test;

import org.example.SistemaOperativoUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SistemaOperativoUtilsTest {

    @Test
    public void testFuncionalidadEspecialEnWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());
    }
}

