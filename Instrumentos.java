// Erick Jair Garcia Barradas A01740197, Carlos Orozco A01328800
// 07 de Mayo del 2018


abstract class Instrumentos implements Comparable<String>{

	protected String nombre;
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

	String getNombre(){
		return nombre;
	}

	String getMarca(){
		return marca;
	}

	int getFechaFabricacion(){
		return fechaFabricacion;
	}

	abstract Instrumentos crear(String nombre, String marca, int fechaFabricacion, int electrico);

	@Override
	public int compareTo(String otro){
		if (nombre.equalsIgnoreCase(otro))
			return 1;
		else if (marca.equalsIgnoreCase(otro)) 
			return 1;
		else
			return 0;
	}
	
	public String toString(){
		return "Nombre: " + nombre + "\nMarca: " + marca + "\nFabricado en " + fechaFabricacion + "\nElectrico: " + electrico; 
	}

}