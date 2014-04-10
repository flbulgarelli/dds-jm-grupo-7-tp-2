package macoWins;

public class Pantalon implements Tipo {

	private int precio;
	private int tela;

	public Pantalon(int unosMts) {
		precio = 250;
		tela = unosMts;
	}

	public int precio() {
		// System.out.println(this.precio);
		return (this.precio);
	}

	public float precioBase() {
		// System.out.println(this.precio + this.tela);
		return (this.precio + this.tela);
	}
}
