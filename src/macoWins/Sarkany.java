package macoWins;

public class Sarkany implements Marca {

	public float coefPara(Prenda unaPrenda) {
		if (unaPrenda.precioBaseSinCoeficiente() > 500)
			return (float) 1.35;
		else
			return (float) 1.1;
	}
}
