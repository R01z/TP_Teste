package com.bdq.model.entities;

public class Aluno extends Usuario {

	private String matricula;

	public Aluno(String nomeUsr, Integer idUsr, String matricula, String cpf) {
		super(nomeUsr, idUsr, Boolean.TRUE, cpf);
		this.matricula = matricula;
	}

	public Aluno() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
