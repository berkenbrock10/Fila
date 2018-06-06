
public class Fila {

	private static class Celula {
		// Descobrimos quem e o objeto, nesse caso o objeto é o cliente
		ItemFila item;
		Celula prox;
	}

	private Celula frente;
	private Celula tras;

	// Cria uma Fila vazia
	public Fila() { 
		this.frente = new Celula();
		this.tras = this.frente;
		this.frente.prox = null;
	}

	public void enfileira(ItemFila x) {
		// Chamando o método podeAdicionar() definido dentro das classes usadas
		if(!x.podeAdicionar()) {
			return;
		}
		
		this.tras.prox = new Celula();
		this.tras = this.tras.prox;
		this.tras.item = x;
		this.tras.prox = null;
	}

	public Object desenfileira() throws Exception {
		Object item = null;
		if (this.vazia())
			throw new Exception("Erro : A fila esta vazia");
		this.frente = this.frente.prox;
		item = this.frente.item;
		return item;
	}

	public boolean vazia() {
		return (this.frente == this.tras);
	}

}
