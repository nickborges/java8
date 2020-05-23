package ocp.collections.equals;

public class ListMain {

    public static void main(String[] args) {

        Curso java = new Curso("Java");

        AlunoList aluno = new AlunoList("Fulano");
        aluno.matricula(java);

        AlunoList aluno2 = new AlunoList("Fulano");
        aluno2.matricula(java);

        System.out.println(aluno.getCursos().equals(aluno2.getCursos()));

        //busca comparando elemento à elemento até encontrar
        System.out.println(aluno.matriculado(java));

    }
}
