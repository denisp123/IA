public class NodoBusqueda
{
	private Entorno estado;
	private NodoBusqueda padre;
	private int[] costos1;
	private int[] costos2;

	public NodoBusqueda(Entorno dato)
	{
		estado = dato;
		padre = null;
	}
	public NodoBusqueda(Entorno dato, NodoBusqueda antes)
	{
		estado = dato;
		padre = antes;
	}

	public Entorno getEstado()
	{
		return estado;
	}
	public NodoBusqueda getPadre()
	{
		return padre;
	}

	public boolean esRaiz()
	{
		boolean res = false;
		if(padre == null)
		{
			res = true;
		}else{}
		return res;
	}

	public ArrayList getHijos()
	{
		//blablabla
	}
}