package macoWins;

public class Sombrero implements Tipo {

	private int precio;
	private int coefDeMetrosexualidad;
	
	public Sombrero( int unCoeficiente)
	{
		precio= 450;
		coefDeMetrosexualidad= unCoeficiente;
	}
	
	public int precio()
	{
		//System.out.println(this.precio);
		return (this.precio);
	}
	
	public float precioBase()
	{
		//System.out.println(this.precio + this.coefDeMetrosexualidad);
		return (this.precio + this.coefDeMetrosexualidad);
	}
	
}
