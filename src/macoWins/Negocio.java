package macoWins;

import java.util.List;
import java.util.ArrayList;

public class Negocio {

	private List<Venta> ventas;

	public Negocio() {
		ventas = new ArrayList<Venta>();
	}

	public void seRealizo(Venta unaVenta) {
		ventas.add(unaVenta);
	}

	public float gananciaDelDia(int unDia) {
		int i = 0;
		float acum = 0;
		while (i < ventas.size()) {
			if (ventas.get(i).dia() == unDia)
				acum = acum + ventas.get(i).valorFinal();
			i++;

		}

		System.out.println(acum);
		return acum;

	}

}
