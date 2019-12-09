package ocp.streams;

public class EstadoDTO {
    private String nome;

    public EstadoDTO(String nome) {
        this.nome = nome;
    }

    public EstadoDTO(Estado estado){
        this.nome = estado.getNome();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "EstadoDTO{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
