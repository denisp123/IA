import java.util.ArrayList;
public class Ubicacion extends Entorno
{
        float[]cs={0,0};
	public Ubicacion(String nom)
	{
		nombre = nom;
		costos = cs;
	}
	public Ubicacion(String nom, float[] cos)
	{
		nombre = nom;
		costos = cos;
	}
	public ArrayList<Ubicacion> devolverHijos()
	{
		ArrayList<Ubicacion> res = new ArrayList<Ubicacion>();
		switch(nombre)
                {
		    case("bloque antiguo tecno"):
			Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo tecno",{2.0,1.0});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca tecno", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("trensito", {1.0, 0.5});
			res.add(hijo);
			break;
                    case("edificio nuevo tecno"):
                        //Ubicacion hijo;
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
		        //Ubicacion hijo;
			hijo = new Ubicacion("tinglado economia", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("edificio nuevo economia", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("comedor", {1.0, 1.5});
			res.add(hijo);
			break;
                    case("teatro humanidades"):
			//Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo humanidades", {1.0, 1.2});
			res.add(hijo);
			hijo = new Ubicacion("edificio derecho", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("multiacademico", {2.0, 2.5});
			res.add(hijo);
			break;
                    case("sector FUL"):
			//aqui eso Ubicacion hijo;
			hijo = new Ubicacion("comedor", {2.0, 1.1});
			res.add(hijo);
			hijo = new Ubicacion("edificio derecho", {1.0, 0.3});
			res.add(hijo);
			break;
                    case("edificio nuevo arqui"):
			//Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo tecno", {2.0, 2.5});
			res.add(hijo);
			hijo = new Ubicacion("trensito", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca arqui", {1.0, 2.0});
			res.add(hijo);
			break;
                    case("tinglado economia"):
			//Ubicacion hijo;
			hijo = new Ubicacion("biblioteca arqui", {1.0, 1.5});
			res.add(hijo);
			hijo = new Ubicacion("multiacademico", {2.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca economia", {1.0, 1.5});
			res.add(hijo);
			break;
                    case("trensito"):
			//Ubicacion hijo;
			hijo = new Ubicacion("edificio nuevo tecno", {3.0, 0.5});
			res.add(hijo);
			hijo = new Ubicacion("edificio nuevo arqui", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("bloque antiguo tecno", {2.0, 0.5});
			res.add(hijo);
			hijo = new Ubicacion("biblioteca tecno", {4.0, 0.5});
			res.add(hijo);
			hijo = new Ubicacion("memi", {1.0, 1.0});
			res.add(hijo);
			hijo = new Ubicacion("multiacademico", {1.0, 1.0});
			res.add(hijo);
			break;
                    case ("memi"):
                        //Ubicacion hijo;
                        hijo = new Ubicacion("biblioteca tecno",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("trensito",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("edificio nuevo humanidades",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("multiacademico",{3.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("edificio nuevo tecno",{5.0,1.0});
			res.add(hijo);
                        break;
                    case ("edificio nuevo eco"):
                        //Ubicacion hijo;
                        hijo = new Ubicacion("biblioteca eco",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("comedor",{1.0,1.0});
			res.add(hijo);
                        break;
                    case ("edificio nuevo humanidades"):
                        hijo = new Ubicacion("multiacademico",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("memi",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("teatro humanidades",{1.0,1.0});
			res.add(hijo);
                        break;
                    case ("multiacademico"):
                        hijo = new Ubicacion("biblioteca arqui",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("tinglado economia",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("comedor",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("trensito",{1.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("edificio derecho",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("teatro humanidades",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("edificio nuevo humanidades",{2.0,1.0});
			res.add(hijo);
                        hijo = new Ubicacion("memi",{3.0,1.0});
			res.add(hijo);
                }
                return res;
	}
}