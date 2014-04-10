package macoWins;

public class Prueba {

	public static void main(String[] args) {
		int valorFijo = 200;
		Saco saco = new Saco(5);
		Sarkany sarkany = new Sarkany();
		Armani armani = new Armani();
		Prenda prenda1 = new Prenda(valorFijo, saco, sarkany, true);
		Pantalon pantalon = new Pantalon(2);
		Prenda prenda2 = new Prenda(valorFijo, pantalon, armani, false);
		Venta venta1 = new Venta(prenda1, 2, 2);
		Venta venta2 = new Venta(prenda2, 3, 2);
		Negocio negocio = new Negocio();
		negocio.seRealizo(venta1);
		negocio.seRealizo(venta2);
		negocio.gananciaDelDia(2); // muestra por consola 4167.9
		System.out.println(prenda1.precioFinal()); // muestra por consola 965.25

	}
}
