package macoWins;

public class Saco implements Tipo {

	//FIXME problema de diseño: noten que casi todos sus tipos de prenda
	//tienen el mismo comportamiento y métodos casi idénticos
	//FIXME Además, si el precio es un valor fijo en cada uno de los tipos de prenda, 
	//no es necesario tener un atributo, pueden directametne devolver eso en el método, 
	//lo cual es además menos propenso a error (porque de lo contrario parecería que 
	//el precio es algo configurable o mutable). 
	private int precio;
	private int botones;

	public Saco(int unosBotones) {
		precio = 300;
		botones = unosBotones;
	}

	public int precio() {
		// System.out.println(this.precio);
		return (this.precio);
	}

	public float precioBase() {
		// System.out.println(this.precio + this.botones * 10);
		return (this.precio + this.botones * 10);

	}
}
