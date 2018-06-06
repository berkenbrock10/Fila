
public class Cliente extends ItemFila {
	private String nome;
	private int idade;
	
	// Definindo que so podemos inserir na fila clientes maiores de 18 anos
	public boolean podeAdicionar() {
		return idade > 18;
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
	public String toString() {
		return "Cliente [Nome = " + nome + ", Idade = " + idade + "]";
	}
	
	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

}
