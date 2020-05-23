package ocp.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Aluno {

    private String nome;
    private String matricula;
    private Set<Curso> cursos = new HashSet<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Set<Curso> getCursos() {
        return Collections.unmodifiableSet(cursos);
    }

    public void matricula(Curso curso){
        this.cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
