package ex16;

import java.util.List;

public interface GestaoEscolar {
    void adicionarAluno(Aluno aluno) throws MatriculaExistenteException;
    void removerAluno(String matricula) throws MatriculaInexistenteException;
    Aluno buscarAlunoPorMatricula(String matricula) throws MatriculaInexistenteException;
}

