package oca.collections.set;

public class SetMain {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Fulano", "12345");
        aluno.matricula(new Curso("Java"));
        aluno.matricula(new Curso("Python"));
        aluno.matricula(new Curso("Rest"));
        aluno.matricula(new Curso("Spring Boot"));

        System.out.println(aluno);


    }

}
