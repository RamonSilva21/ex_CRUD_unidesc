package br.edu.unidesc;


import br.edu.unidesc.controller.AlunoController;


public class TestMain {

	public static void main(String[] args) {
		
		AlunoController controller = new AlunoController();
		
		controller.criarAluno();
		
		controller.searchAluno("");
		
		controller.atualizarAluno("");
		
		controller.searchAluno("");
		
		controller.deleteALuno("");
		
		controller.searchAluno("");
	}

}
