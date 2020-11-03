import controller.AlunoController;
import entidades.Aluno;


import java.util.Scanner;


public class TestMain {

    public static void main(String[] args) {
        String SEPARATOR = "; ";

        AlunoController control = new AlunoController();
        Aluno student = new Aluno();

        Scanner getin = new Scanner(System.in);

        //CREATING STUDENT
        System.out.println("Olá! Desejaria criar um novo Aluno?");
        System.out.print("1 - Sim\t\t");
        System.out.println("2 - Não");
        int n = getin.nextInt();

        if (n == 1) {
            control.newAluno(student);
            System.out.println("Aluno criado com sucesso!");
        } else {
            System.out.println("Muito obrigado!");
        }


        //SEARCHING STUDENT
        System.out.println("Gostaria de realizar uma busca por algum aluno criado?");
        System.out.print("1 - Sim\t\t");
        System.out.println("2 - Não");


        if (getin.nextInt() == 1) {
            System.out.print("Digite o CPF do aluno: ");
            control.searchAluno("");
            System.out.println(student.getNome() + SEPARATOR + student.getCurso() + SEPARATOR + student.getMatricula());
        } else {
            System.out.println("Tudo bem, até a próxima!");
        }

        ////UPDATING STUDENT
        System.out.println("Deseja atualizar o aluno?");
        System.out.print("1 - Sim\t\t");
        System.out.println("2 - Não");

        if (getin.nextInt() == 1) {
            control.attAluno(student);
        } else {
            System.out.println("Entendido!");
        }

        //DELETING STUDENT
        System.out.println("Deseja deletar o aluno da Lista?");
        System.out.print("1 - Sim\t\t");
        System.out.println("2 - Não");

        if(getin.nextInt() == 1) {

            control.deleteAluno("");
        }else{
            System.out.println("Fica para próxima então! ;)");
        }


    }

}
