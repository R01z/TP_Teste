package com.bdq.unittests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
    public void nomeInseridoNaoEValido() {
        boolean resultado = NomeUtil.nomeValido("Ig0r");
        assertFalse(resultado);
    }
}
