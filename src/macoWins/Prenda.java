package macoWins;

public class Prenda {

	private int valorFijo;
	private Tipo tipo;
	private Marca marca;
	private boolean importada;

	//FIXME En Java la convención es llamar a las cosas si prefijos tipo
	//un/una, porque a diferencia de smalltalk, se puede
	//remover la ambigüedad usando la palabra clave this:
	//this.tipo = tipo;
	public Prenda(int unValor, Tipo unTipo, Marca unaMarca, boolean esImportada) {
		valorFijo = unValor;
		tipo = unTipo;
		marca = unaMarca;
		importada = esImportada;
	}

	public float coefDeMarca() {
		return (marca.coefPara(this));
	}

	public float precioBase() {
		return (tipo.precioBase());
	}

	public float precioBaseSinCoeficiente() {
		return ((valorFijo + this.precioBase()) * this.tasaDeImportacion());
	}

	public float tasaDeImportacion() {
		if (importada)
			return (float) 1.3;
		else
			return 1;

	}

	public float precioFinal() {
		// System.out.println(this.precioBaseSinCoeficiente() *
		// this.coefDeMarca());
		return (float) (this.precioBaseSinCoeficiente() * this.coefDeMarca());
	}

}
