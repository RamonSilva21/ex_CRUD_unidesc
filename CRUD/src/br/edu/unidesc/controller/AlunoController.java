package br.edu.unidesc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.interfaces.AlunoContract;

public class AlunoController implements AlunoContract {
	
	
	//Repository in memory of Students
	private List<Aluno> students = new ArrayList<Aluno>();
	
	
	@Override
	public Aluno criarAluno() {
		
		//Creating a Student
		Aluno aluno = new Aluno();
		
		//Scanner Instance
		@SuppressWarnings("resource")
		Scanner getin = new Scanner(System.in);
		
		//Entering search information
		System.out.println("\nInforme o número de CPF: ");
		aluno.setCpf(getin.nextLine());
		System.out.println("Informe o nome: ");
		aluno.setNome(getin.nextLine());
		System.out.println("Informe o curso: ");
		aluno.setCurso(getin.nextLine());
		aluno.setMatricula();
		
		//Saving in Repository
		saveEntidade(aluno);
		
		
		return aluno;
		
	}

	

	@Override
	public Aluno searchAluno(String cpf) {
		
		//Search of Student
		for(Aluno aluno : students) {
			//Answer of the Search
			if(cpf.equals(aluno.getCpf())) {
				
				return aluno;
			}
		}
		
		return null;
	}

	@Override
	public String atualizarAluno(String cpf) {
		
		
		//Verification attribute
		boolean alunoFound = false;
		
		//Scanner instance
		
		Scanner getin = new Scanner(System.in);
		
		
		for(Aluno aluno : students) {
			//Answer of the Search
			if(cpf.equals(aluno.getCpf())) {
				//Get in with news attributes
				System.out.println("\nInforme o novo Nome: ");
				aluno.setNome(getin.nextLine());
				System.out.println("\nInforme o novo Curso: ");
				aluno.setCurso(getin.nextLine());
			
				alunoFound = true;
			}
		}
		return null;
	}
		

	@Override
	public Boolean deleteALuno(String cpf) {
		
		Aluno alunoRecovered = searchAluno(cpf);
		
		if(alunoRecovered != null) {
			System.out.println("Removendo o aluno....");
			//Removendo o Aluno da List
			students.remove(alunoRecovered);
			System.out.println("Aluno REMOVIDO!");
			return true;
		}
		return false;
		
	}
	
	
	private void saveEntidade(Aluno aluno) {
		students.add(aluno);
		System.out.println("Aluno salvo na base!");
		
	}


	
}
