package org.example.test;

import org.example.ControladorAcceso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControladorAccesoTest {

    @Test
    void testAccesoAdmin() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("adminUser", "ADMIN");
        assertTrue(controlador.verificarAcceso("adminUser", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void testAccesoEditor() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("editorUser", "EDITOR");
        assertTrue(controlador.verificarAcceso("editorUser", "ALGUNA_FUNCIONALIDAD"));
        assertFalse(controlador.verificarAcceso("editorUser", "GESTION_USUARIOS"));
    }

    @Test
    void testAccesoVisitante() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("visitanteUser", "VISITANTE");
        assertTrue(controlador.verificarAcceso("visitanteUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitanteUser", "ALGUNA_FUNCIONALIDAD"));
    }

    @Test
    void testUsuarioSinRolAsignado() {
        ControladorAcceso controlador = new ControladorAcceso();
        assertFalse(controlador.verificarAcceso("usuarioSinRol", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void testUsuarioConRolNoReconocido() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("unknownUser", "ROL_DESCONOCIDO");
        assertFalse(controlador.verificarAcceso("unknownUser", "CUALQUIER_FUNCIONALIDAD"));
    }
}
