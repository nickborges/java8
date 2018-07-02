package interfaces;

public class ClasseAnimal {
	
	private String nome;
	private float peso;
	private int idade;
	private boolean existe;
	
	public ClasseAnimal(){
		
	}
	
	public ClasseAnimal(final String nome, final float peso, final int idade, final boolean existe) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.existe = existe;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	@Override
	public String toString() {
		return "ClasseAnimal [nome=" + nome + ", peso=" + peso + ", idade=" + idade + ", existe=" + existe + "]";
	}	
	

}
