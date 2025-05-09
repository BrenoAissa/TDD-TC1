package org.ifsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DroneDriveTest {

    @Test
    void testCaixaPassaPelaJanela() {
        assertTrue(DroneDrive.caixaPassaPelaJanela(2, 3, 5, 3, 4), "Face AxB deveria passar");
        assertTrue(DroneDrive.caixaPassaPelaJanela(2, 5, 3, 3, 4), "Face AxC deveria passar");
        assertTrue(DroneDrive.caixaPassaPelaJanela(5, 2, 3, 3, 4), "Face BxC deveria passar");
        assertFalse(DroneDrive.caixaPassaPelaJanela(5, 6, 7, 3, 4), "Nenhuma face deveria passar");
        assertTrue(DroneDrive.caixaPassaPelaJanela(3, 4, 10, 3, 4), "Caixa deveria encaixar exatamente");
        assertTrue(DroneDrive.caixaPassaPelaJanela(2, 5, 1, 5, 2), "Caixa deveria passar com janela rotacionada");
    }

    @Test
    public void testCaixaNaoPassa() {
        assertFalse(DroneDrive.caixaPassaPelaJanela(75, 100, 50, 100, 30));
    }

    @Test
    public void testeCaixaIgualJanela() {
        assertTrue(DroneDrive.caixaPassaPelaJanela(10, 10, 10, 10, 10));
    }

    @Test
    public void testeCaixaNaoPassaMuitoGrande() {
        assertFalse(DroneDrive.caixaPassaPelaJanela(100, 100, 100, 50, 50));
    }
}