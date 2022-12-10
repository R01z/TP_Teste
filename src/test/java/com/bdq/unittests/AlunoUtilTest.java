package com.bdq.unittests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.bdq.model.entities.Util.AlunoUtil;

public class AlunoUtilTest {

    @Test
    public void matriculaNullRetornaExcecao() {
        try {
            boolean resultado = AlunoUtil.matriculaValida(null);
        } catch (NullPointerException e) {
            assertEquals("Necessario preencher matricula", e.getMessage());
        }
    }

    @Test
    public void matriculaComQuantidadeDeDigitosDiferenteDe10RetornaFalso() {
        boolean resultado = AlunoUtil.matriculaValida("666666");
        assertFalse(resultado);
    }

    @Test
    public void matriculaComLetrasRetornaFalso() {
        boolean resultado = AlunoUtil.matriculaValida("123456789A");
        assertFalse(resultado);
    }

    @Test
    public void matriculaValida() {
        boolean resultado = AlunoUtil.matriculaValida("1234567890");
        assertTrue(resultado);
    }
}
