
public class TestarFila {

	public static void main(String[] args) {
				
		Fila minhaFila = new Fila();
		minhaFila.enfileira(new Cliente("Christian", 21));
		minhaFila.enfileira(new Carro("gol", "volkswagen"));		
		minhaFila.enfileira(new Cliente("Julliana", 23));
		minhaFila.enfileira(new Carro("palio", "fiat"));
		minhaFila.enfileira(new Cliente("Beatriz", 30));
		minhaFila.enfileira(new Carro("tucson", "hyundai"));
		minhaFila.enfileira(new Cliente("Amora", 26));
		minhaFila.enfileira(new Carro("palio", "fiat"));
		minhaFila.enfileira(new Cliente("João", 17));
		minhaFila.enfileira(new Carro("fiesta", "ford"));
		minhaFila.enfileira(new Cliente("Renato", 17));
		minhaFila.enfileira(new Carro("ka", "ford"));
		
		try {
			while (!minhaFila.vazia()) {
				System.out.println(minhaFila.desenfileira().toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
