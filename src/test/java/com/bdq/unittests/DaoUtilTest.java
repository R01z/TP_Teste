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
}
