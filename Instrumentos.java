class Instrumentos{
	//Atributos
	public String nombre;
	public String marca;
	public int fechaFabricacion;
	public boolean electrico;

	//Constructor
	Instrumentos(String nombre, String marca, int fechaFabricacion, boolean electrico){
		this.nombre = nombre;
		this.marca = marca;
		this.fechaFabricacion = fechaFabricacion;
		this.electrico = electrico;
	}

	//Metodos
	//abstract void tocar();

	//abstract void afinar();

	public String toString(){
		return "Nombre: " + nombre + "\nMarca: " + marca + "\nFabricado en " + fechaFabricacion + "\nElectrico: " + electrico; 
	}

}