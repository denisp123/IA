import java.util.ArrayList;

public class ArbolBusqueda<T>
{
	private T raiz;
	private ArrayList<ArbolBusqueda<T>> hijos;

	public ArbolBusqueda()
	{
		raiz = null;
		hijos = null;
	}
	public ArbolBusqueda(T inicio)
	{
		raiz = inicio;
		hijos = new ArrayList<ArbolBusqueda<T>>();
	}

	public T getRaiz()
	{
		return raiz;
	}
	public ArrayList<ArbolBusqueda<T>> getHijos()
	{
		return hijos;
	}

	public void insertarHijo(T dato)
	{
		ArbolBusqueda<T> nuevo = new ArbolBusqueda<T>(dato);
		hijos.add(nuevo);
	}

	public void insertarHijos(ArrayList<T> datos)
	{
		for(int i = 0; i < hijos.size(); i++)
		{
			T dato = datos.get(i);
			ArbolBusqueda<T> nuevo = new ArbolBusqueda<T>(dato);
			hijos.add(nuevo);
		}
	}
}