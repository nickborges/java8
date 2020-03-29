package ocp.streams.dto;

public class PessoaDTO {
    private String nome;
    private int idade;

    public PessoaDTO() {
    }

    public PessoaDTO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaDTO(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.idade = pessoa.getIdade();

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
