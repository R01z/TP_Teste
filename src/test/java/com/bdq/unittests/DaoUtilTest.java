package com.bdq.unittests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bdq.config.util.DaoUtil;

public class DaoUtilTest {

    @Test
    public void testaEncriptamentoDeSenhaComRespostaConhecida() {
        String resposta = DaoUtil.encryptPass("teste");
        assertEquals("46070d4bf934fb0d4b06d9e2c46e346944e322444900a435d7d9a95e6d7435f5", resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroSejaNull() {
        boolean resposta = DaoUtil.validaSenha(null);
        assertFalse(resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroSejaMenorQue8() {
        boolean resposta = DaoUtil.validaSenha("Abc12!");
        assertFalse(resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroNaoTenhaNumero() {
        boolean resposta = DaoUtil.validaSenha("AbcDEf@!");
        assertFalse(resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroNaoTenhaLetraMaiuscula() {
        boolean resposta = DaoUtil.validaSenha("1bc23f@!");
        assertFalse(resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroNaoTenhaLetraMinuscula() {
        boolean resposta = DaoUtil.validaSenha("1BC23F@!");
        assertFalse(resposta);
    }

    @Test
    public void senhaInvalidaCasoParametroNaoTenhaCaractereEspecial() {
        boolean resposta = DaoUtil.validaSenha("1BC23Fab");
        assertFalse(resposta);
    }

    @Test
    public void senhavalida() {
        boolean resposta = DaoUtil.validaSenha("1B!23Fab");
        assertTrue(resposta);
    }
}
