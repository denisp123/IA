public class Ubicacion extends Entorno
{
	//blablabla
	public Ubicacion(String nom)
	{
		nombre = nom;
		costos = {null, null};
	}
	public Ubicacion(String nom, float[] cos)
	{
		nombre = nom;
		costos = cos;
	}

	public ArrayList<Ubicacion> devolverHijos()
	{
		ArrayList<Ubicacion> res = new ArrayList<Ubicacion>();
		//esta es la parte laaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaarga
		swich(nombre)
		case("edificio"):
			//aqui eso
			Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo tecno", {2.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca tecno", {2.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("trensito", {2.0, 0.5});
			res.add(hijo);
			break;
		case...........
	}
}