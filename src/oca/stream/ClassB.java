package oca.stream;

public class ClassB {

    private String nome;
    private int idade;

    public ClassB(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ClassB(ClassA classA) {
        this.nome = classA.getNome();
        this.idade = classA.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
