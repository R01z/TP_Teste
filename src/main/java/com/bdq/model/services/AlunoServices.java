package com.bdq.model.services;

import com.bdq.model.dao.AlunoDao;
import com.bdq.model.dao.DaoFactory;
import com.bdq.model.entities.Aluno;

public class AlunoServices {
	private AlunoDao dao = DaoFactory.createAlunoDao();

	public int insereAluno(Aluno obj) {
		return dao.insert(obj);
	}

	public Aluno pesquisaAlunoId(Aluno obj) {
		return dao.findById(obj.getIdUsr());
	}

	public Aluno pesquisaAlunoNomeUsrSenha(String nomeUsr, String senha) {
		return dao.findByNomeUsrSenha(nomeUsr, senha);
	}

	public Aluno pesquisaAlunoMatricula(Aluno obj) {
		return dao.findByMatricula(obj.getMatricula());
	}

	public Boolean checaNomeUsuario(String nomeUsr) {
		return dao.checkByNomeUsr(nomeUsr);
	}

	public void deletaPorId(Aluno obj) {
		dao.deleteById(obj.getIdUsr());
	}

	public static boolean salvaMatricula(String matricula, Aluno aluno) throws NullPointerException {
		if (matricula == null)
			throw new NullPointerException("Necessario preencher matricula");

		if (matricula.length() != 10)
			return false;

		for (int i = 0; i < matricula.length(); i++) {
			char num = matricula.charAt(i);
			if (!Character.isDigit(num))
				return false;
		}
		aluno.setMatricula(matricula);
		return true;
	}
}
