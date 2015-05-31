public class Ubicacion 
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
		case("bloque antiguo tecno"):
			//aqui eso
			Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo tecno", {2.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca tecno", {2.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("trensito", {2.0, 0.5});
			res.add(hijo);
			break;
		case("edificio nuevo tecno"):
                        Ubicacion hijo;
			hijo = new Ubicacion("memi", {5.0, 3.0});
			res.add(hijo);
			hijo = new Ubicacion("bloque antiguo tecno", {2.0, 1.5});
			res.add(hijo);
			hijo = new Ubicacion("trensito", {2.0, 0.5});
			res.add(hijo);
			hijo = new Ubicacion("edificio nuevo arqui", {2.0, 2.5});
			res.add(hijo);
                        break;
                case("biblioteca economia"):
		
			Ubicacion hijo;
			hijo = new Ubicacion("tinglado economia", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("entrada", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("comedor", {1.0, 1.5});
			res.add(hijo);
			break;
                case("teatro humanidades"):
			
			Ubicacion hijo;
			hijo = new Ubicacion("entrada humanidades", {1.0, 1.2});
			res.add(hijo);
			hijo = new Ubicacion("edificio derecho", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("multiacademico", {2.0, 2.5});
			res.add(hijo);
			break;
                case("sector FUL"):
			//aqui eso
			Ubicacion hijo;
			hijo = new Ubicacion("comedor", {2.0, 1.1});
			res.add(hijo);
			hijo = new Ubicacion("edificio derecho", {1.0, 0.3});
			res.add(hijo);
			break;
        }

}
