package oca.collections.sort;

public class Car {

    private String nome;

    public Car(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
