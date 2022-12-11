package com.bdq.unittests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bdq.model.entities.Aluno;
import com.bdq.model.entities.Professor;
import com.bdq.model.entities.Usuario;

public class UsuarioTest {

	@Test
	public void usuarioCadastradoNaoEAluno() {
		Usuario professor = new Professor("Professor", 555, "47970631061");
		assertFalse(professor.getUsrAluno());
	}

	@Test
	public void usuarioCadastradoEAluno() {
		Usuario aluno = new Aluno("Aluno", 555, "2018046", "47970631061");
		assertTrue(aluno.getUsrAluno());
	}

	@Test
	public void setarNomeDoUsuario() {
		String nome = "Aluno";
		Usuario aluno = new Aluno("", 555, "2018046", "47970631061");
		aluno.setNome(nome);
		assertEquals(nome, aluno.getNome());
	}

	@Test
	public void setarCpfComValidadores() {
		Usuario prof = new Professor();
		prof.setCpf("47970631061");
		assertEquals("47970631061", prof.getCpf());
	}

	@Test
	public void setarCpfInvalidoRetornaExcecao() {
		Usuario prof = new Professor();
		try {
			prof.setCpf("47970ABC061");
		} catch (RuntimeException e) {
			assertEquals("CPF invalido", e.getMessage());
		}
	}

	@Test
	public void setarCpfNullRetornaExcecao() {
		Usuario prof = new Professor();
		try {
			prof.setCpf(null);
		} catch (RuntimeException e) {
			assertEquals("CPF invalido", e.getMessage());
		}
	}

}
