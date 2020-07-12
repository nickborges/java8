package ocp.collections.equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AlunoList {
    private String nome;
    private List<Curso> cursos = new LinkedList<>();

    public AlunoList(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos); //informa para o java devolver uma List imutável.
    }

    public void matricular(Curso curso){
        this.cursos.add(curso);
    }

    public boolean matriculado(Curso curso){
        return this.cursos.contains(curso);
    }

    public boolean desmatricular(Curso curso){
        return this.cursos.remove(curso);
    }
}
