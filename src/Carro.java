
public class Carro extends ItemFila {
	private String modelo;
	private String marca;

	// Definindo que so podemos inserir na fila carros diferentes de ford
	public boolean podeAdicionar() {
		return !marca.equals("ford");
	}

	public Carro(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [Modelo = " + modelo + ", Marca = " + marca + "]";
	}

}
