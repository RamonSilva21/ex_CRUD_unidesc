package br.edu.unidesc.entidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        //FIRST PART OF MATRICULA = 'YEAR, MONTH, DAY, HOUR, MINUTE, SECOND'
        Calendar data = Calendar.getInstance();
        String mat = "yyyyMMddHHmmss";
        SimpleDateFormat formato = new SimpleDateFormat(mat);
        mat = formato.format(data.getTime());

        //RANDOM NUMBER
        Random random = new Random();
        String aleatorio = Integer.toString(random.nextInt(100));

        //DISCOVERING THE SEMESTER
        String SS = "";

        if (data.MONTH >= 6){
            SS = "01";
        }else{
            SS = "02";
        }

        this.matricula = mat +"-"+aleatorio+"-"+SS;
    }
}
