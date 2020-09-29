package br.edu.unidesc.interfaces;

import br.edu.unidesc.entidades.Aluno;

public interface AlunoContract {
	
	Aluno criarAluno();			//C REATE
	Aluno searchAluno(String cpf);		//R EAD
	void atualizarAluno(String cpf);	//U PDATE
	Boolean deleteALuno(String cpf);	//D ELETE
	

}

