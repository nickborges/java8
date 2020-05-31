package oca.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamMap {

    public static void main(String args[]){

        List<ClassA> classAList = Arrays.asList(new ClassA("A", 20));
        List<ClassB> classBList = new ArrayList<>();

        classBList.addAll(
                classAList.stream()
                        .map(ClassB::new)
                        .collect(Collectors.toList())
        );

        System.out.println(classBList);

    }
}

class ClassA {

    private String nome;
    private int idade;

    public ClassA(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}

class ClassB {

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