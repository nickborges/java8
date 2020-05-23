package oca.collections.equals;

import java.util.*;

public class AlunoSet {
    private String nome;
    private Set<Curso> cursos = new HashSet();

    public AlunoSet(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Curso> getCursos() {
        return Collections.unmodifiableSet(cursos);
    }

    public void matricula(Curso curso){
        this.cursos.add(curso);
    }

    public boolean matriculado(Curso curso){
        return this.cursos.contains(curso);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlunoSet)) return false;
        AlunoSet alunoSet = (AlunoSet) o;
        return Objects.equals(getNome(), alunoSet.getNome()) &&
                Objects.equals(getCursos(), alunoSet.getCursos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCursos());
    }
}
