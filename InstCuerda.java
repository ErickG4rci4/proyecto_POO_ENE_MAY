// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018
import java.io.*;

class InstCuerda extends Instrumentos implements Serializable{
	
	private Cuerdas misCuerdas;
	public String tipo;
	public String material;
	
	//Constructor
	
	Cuerda(String nombre, String marca, int fechaFabricacion, int electrico,String tipo, String material, Cuerdas misCuerdas){
		super(nombre,marca,fechaFabricacion,electrico);
		this.tipo = tipo;
		this.material = material;
		this.misCuerdas = misCuerdas;
	}

	Cuerda(){}

	void crear(){
		input
		this.misCuerdas = new ();
	}

}