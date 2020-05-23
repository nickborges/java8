package ocp.collections.equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoList {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();

    public AlunoList(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void matricula(Curso curso){
        this.cursos.add(curso);
    }

    public boolean matriculado(Curso curso){
        return this.cursos.contains(curso);
    }
}
