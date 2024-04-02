package ex16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalaDeAula implements GestaoEscolar, Serializable {
    private List<Aluno> alunos;

    public SalaDeAula() {
        this.alunos = new ArrayList<>();
    }

    @Override
    public void adicionarAluno(Aluno aluno) throws MatriculaExistenteException {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                throw new MatriculaExistenteException("Matrícula já existe: " + aluno.getMatricula());
            }
        }
        alunos.add(aluno);
    }

    @Override
    public void removerAluno(String matricula) throws MatriculaInexistenteException {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                return;
            }
        }
        throw new MatriculaInexistenteException("Matrícula não encontrada: " + matricula);
    }

    @Override
    public Aluno buscarAlunoPorMatricula(String matricula) throws MatriculaInexistenteException {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        throw new MatriculaInexistenteException("Matrícula não encontrada: " + matricula);
    }

    // Métodos de serialização e desserialização

    public void serializar(String nomeArquivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            out.writeObject(this);
        }
    }

    public static SalaDeAula desserializar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (SalaDeAula) in.readObject();
        }
    }
}

