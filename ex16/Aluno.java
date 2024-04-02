package ex16;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private String matricula;
    private StatusAluno status;

    public Aluno(String nome, String matricula, StatusAluno status) {
        this.nome = nome;
        this.matricula = matricula;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public StatusAluno getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", status=" + status +
                '}';
    }
}

