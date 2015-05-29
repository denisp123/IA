public abstract class Entorno
{
	private String nombre;
	private float[] costos;
	private String[] acciones;

	public abstract ArrayList<Entorno> devolverHijos();
	public abstract boolean equals(Entorno otro)
	{
		boolean res = otro.getNombre().equals(nombre);
		return res;
	}

	public String getNombre()
	{
		return nombre;
	}
	public int[] getCostos()
	{
		return costos;
	}
}