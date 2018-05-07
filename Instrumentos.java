// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

abstract class Instrumentos{

	public String nombre;
	public String marca;
	public int fechaFabricacion;
	public boolean electrico;

	Instrumentos(String nombre, String marca, int fechaFabricacion, int electrico){
		this.nombre = nombre;
		this.marca = marca;
		this.fechaFabricacion = fechaFabricacion;
		if (electrico==1) 
			this.electrico = true;
		else
			this.electrico = false;
	}

	Instrumentos(){}

	abstract Instrumentos crear(String nombre, String marca, int fechaFabricacion, int electrico);

	public String toString(){
		return "Nombre: " + nombre + "\nMarca: " + marca + "\nFabricado en " + fechaFabricacion + "\nElectrico: " + electrico; 
	}

}