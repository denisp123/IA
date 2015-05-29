import java.util.ArrayList;

public class BuscadorBidireccional
{
	private ArrayList<NodoBusqueda> superior;
	private ArrayList<NodoBusqueda> inferior;

	public BuscadorBidireccional(Entorno inicio, Entorno objetivo)
	{
		superior = new ArrayList<NodoBusqueda>();
		inferior = new ArrayList<NodoBusqueda>();
		NodoBusqueda ini = new NodoBusqueda(inicio);
		NodoBusqueda fin = new NodoBusqueda(objetivo);
		superior.add(ini);
		inferior.add(fin);
	}

	public void? buscar()
	{
		boolean arriba = true;
		NodoBusqueda[] res = cruce();
		while(res == null)
		{
			paso(arriba);
			res = cruce();
			arriba = !arriba;
		}
	}

	private void paso(boolean arriba)
	{
		ArrayList<NodoBusqueda> nuevo = new ArrayList<NodoBusqueda>();
		ArrayList<NodoBusqueda> actual;
		if(arriba)
		{
			actual = superior;
		}else
		{
			actual = inferior;
		}
		for(int i = 0; i < actual.size(); i++)
		{
			ArrayList<NodoBusqueda> hijos = actual.get(i).expandir();
			for(int j = 0; j < hijos.size(); j++)
			{
				nuevo.add(hijos.get(i));
			}
		}
		if(arriba)
		{
			superior = nuevo;
		}else
		{
			inferior = nuevo;
		}
	}

	private NodoBusqueda[] cruce()
	{
		NodoBusqueda[] res = null;
		boolean encontrado = false;
		for(int i = 0; i < superior.size() && !encontrado; i++)
		{
			NodoBusqueda a = superior.get(i);
			for(int j = 0; j < inferior.size() && !encontrado; j++)
			{
				NodoBusqueda b = inferior.get(j);
				if(a.equals(b))
				{
					NodoBusqueda arriba = a;
					NodoBusqueda abajo = b;
					res = {a, b};
				}
			}
		}
		return res;
	}
}