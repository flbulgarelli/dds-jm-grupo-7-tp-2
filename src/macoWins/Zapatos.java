package macoWins;

public class Zapatos implements Tipo {

	private int precio;
	private int talle;

	public Zapatos(int unTalle) {
		precio = 400;
		talle = unTalle;
	}

	public int precio() {
		// System.out.println(this.precio);
		return (this.precio);
	}

	public float precioBase() {
		// System.out.println(this.precio + this.talle * 5);
		return (this.precio + this.talle * 5);
	}
}
