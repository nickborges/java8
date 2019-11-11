package stream;

import java.util.Objects;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassB classA = (ClassB) o;
        return idade == classA.idade &&
                Objects.equals(nome, classA.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
