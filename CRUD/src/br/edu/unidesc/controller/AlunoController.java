package br.edu.unidesc.controller;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.interfaces.AlunoContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoController implements AlunoContract {

    //REPOSITORY IN MEMORY
    private List<Aluno> alunos = new ArrayList<Aluno>();


    @Override
    public Aluno newAluno(Aluno student) {


        Scanner getin = new Scanner(System.in);

        System.out.print("\nInoforme o número de CPF: ");
        student.setCpf(getin.nextLine());
        System.out.print("Informe o nome: ");
        student.setNome(getin.nextLine());
        System.out.print("Informe o curso: ");
        student.setCurso(getin.nextLine());
        student.setMatricula();

        //SAVING AT REPOSITORY
        saveStudent(student);

        return student;
    }

    //SEARCHING STUDENT
    @Override
    public Aluno searchAluno(String cpf) {

        Scanner getin = new Scanner(System.in);
        cpf = getin.nextLine();

        for (Aluno a : alunos) {
            if (cpf.equals(a.getCpf())){
            return a;
            }
        }
        return null;
    }

    //UPDATING THE STUDENT
    @Override
    public Aluno attAluno(Aluno student) {

        boolean studentFound = false;

        Scanner getin = new Scanner(System.in);

        for (Aluno a: alunos) {
            if(a.getCpf().equals(student.getCpf())){
                System.out.println("\nInforme as mudanças abaixo!");
                System.out.print("Informe o novo NOME: ");
                student.setNome(getin.nextLine());
                System.out.print("Informe o novo CURSO: ");
                student.setCurso(getin.nextLine());

                studentFound = true;
            }
        }


        return student;
    }

    //REMOVING STUDENT
    @Override
    public Boolean deleteAluno(String cpf) {

        Aluno studentRecovered = searchAluno(cpf);

        if (studentRecovered != null){
            System.out.println("Removendo aluno....");
            alunos.remove(studentRecovered);
            System.out.println("Aluno REMOVIDO");
            return true;
        }
        return false;
    }

    //SAVING STUDENT IN THE LIST 'ALUNOS'
    private void saveStudent(Aluno student) {
        alunos.add(student);
    }


}
