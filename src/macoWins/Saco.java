package macoWins;

public class Saco implements Tipo {

	private  int precio;
	private int botones;
	
	public Saco( int unosBotones)
	{
		precio= 300;
		botones= unosBotones;
	}
	
	public int precio()
	{
		//System.out.println(this.precio);
		return (this.precio);
	}
	
	public float precioBase()
	{
		//System.out.println(this.precio + this.botones * 10);
		return(this.precio + this.botones * 10);
		
	}
}
