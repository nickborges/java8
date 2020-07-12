package ocp.collections.equals;

public class ListMain {

    public static void main(String[] args) {

        Curso java = new Curso("Java");
        Curso oop = new Curso("Orientação a Objetos");
        Curso kubernetes = new Curso("Kubernetes");

        AlunoList aluno = new AlunoList("Fulano 1");
        aluno.matricular(java);
        aluno.matricular(oop);

        AlunoList aluno2 = new AlunoList("Fulano");
        aluno2.matricular(java);
        aluno2.matricular(java); //permite duplicar elementos
        aluno2.matricular(oop);
        aluno2.matricular(kubernetes);

        //busca comparando elemento à elemento até encontrar
        System.out.println(aluno.matriculado(java));
        System.out.println(aluno.desmatricular(oop));

    }
}
