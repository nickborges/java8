package oca.cloneable;

public class ExemploCloneable implements Cloneable{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "ExemploCloneable [nome=" + nome + ", getNome()=" + getNome() + "]";
	}
	
}
