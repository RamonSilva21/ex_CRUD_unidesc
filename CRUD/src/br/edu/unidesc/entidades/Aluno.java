package br.edu.unidesc.entidades;

import java.time.LocalDateTime;
import java.util.Random;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String curso;
	private String matricula;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula() {
		
		LocalDateTime data = LocalDateTime.now();
		

		 Random random = new Random();
		 int aleatorio = random.nextInt(100);
		
		
		int YY = data.getYear();
		int MM = data.getMonthValue() + 1;
		int DD = data.getDayOfMonth();
		int hh = data.getHour();
		int mm = data.getMinute();
		int ss = data.getSecond();
		int RR = aleatorio;
		String SS = "";
		
		if(MM < 6) {
			SS = "01";
		}else {
			SS = "02";
		}
		
		Integer.toString(MM);
		Integer.toString(DD);
		Integer.toString(hh);
		Integer.toString(mm);
		Integer.toString(ss);
		Integer.toString(RR);
			
		
		
		this.matricula = YY + MM + DD + hh + mm + ss+ "-" + RR + "-" + SS;
	}
	 
	
}
