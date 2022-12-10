package com.bdq.unittests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.bdq.model.services.util.NomeUtil;

public class NomeUtilTest {

    @Test
    public void nomeInseridoEValido() {
        boolean resultado = NomeUtil.nomeValido("Igor Roiz");
        assertTrue(resultado);
    }

    @Test
    public void nomeInseridoContemDigito() {
        boolean resultado = NomeUtil.nomeValido("Ig0r");
        assertFalse(resultado);
    }

    @Test
    public void nomeTemMenosDe3Digitos() {
        boolean resultado = NomeUtil.nomeValido("Ig");
        assertFalse(resultado);
    }

    @Test
    public void testaMensagemExcecaoCasoNomeSejaNull() {
        try {
            boolean resultado = NomeUtil.nomeValido(null);
        } catch (NullPointerException e) {
            assertEquals("Necessário preencher o nome", e.getMessage());
        }
    }
}
