package oca.collections.equals;

public class SetMain {

    public static void main(String[] args) {

        Curso java = new Curso("Java");

        AlunoSet aluno = new AlunoSet("Fulano");
        aluno.matricula(java);

        AlunoSet aluno2 = new AlunoSet("Fulano");
        aluno2.matricula(java);

        System.out.println(aluno.getCursos().equals(aluno2.getCursos()));

        //busca na tabela de espalhamento
        System.out.println(aluno.matriculado(java));

    }
}
