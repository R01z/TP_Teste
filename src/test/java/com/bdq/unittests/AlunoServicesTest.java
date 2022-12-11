package com.bdq.unittests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.bdq.model.services.AlunoServices;
import com.bdq.model.entities.Aluno;

public class AlunoServicesTest {

    @Test
    public void matriculaNullRetornaExcecao() {
        Aluno aluno = new Aluno();
        try {
            boolean resultado = AlunoServices.salvaMatricula(null, aluno);
        } catch (NullPointerException e) {
            assertEquals("Necessario preencher matricula", e.getMessage());
        }
    }

    @Test
    public void matriculaComQuantidadeDeDigitosDiferenteDe10RetornaFalso() {
        Aluno aluno = new Aluno();
        boolean resultado = AlunoServices.salvaMatricula("666666", aluno);
        assertFalse(resultado);
    }

    @Test
    public void matriculaComLetrasRetornaFalso() {
        Aluno aluno = new Aluno();
        boolean resultado = AlunoServices.salvaMatricula("123456789A", aluno);
        assertFalse(resultado);
    }

    @Test
    public void matriculaValida() {
        Aluno aluno = new Aluno();
        boolean resultado = AlunoServices.salvaMatricula("1234567890", aluno);
        assertTrue(resultado);
        assertEquals("1234567890", aluno.getMatricula());
    }
}
