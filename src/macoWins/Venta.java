package macoWins;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	private int dia;

	public Venta(Prenda unaPrenda, int unaCantidad, int unDia) {
		prenda = unaPrenda;
		cantidad = unaCantidad;
		dia = unDia;

	}

	public int dia() {
		return (this.dia);
	}

	public float valorFinal() {
		// System.out.println(valorFinal);
		return (cantidad * prenda.precioFinal());

	}

}
