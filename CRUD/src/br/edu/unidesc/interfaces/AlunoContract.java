package interfaces;

import entidades.Aluno;

public interface AlunoContract {

    Aluno newAluno(Aluno student);
    Aluno searchAluno(String cpf);
    Aluno attAluno(Aluno student);
    Boolean deleteAluno(String cpf);

}
