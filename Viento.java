// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 05 de Febrero del 2018

class Viento extends Instrumentos{
	//Atributos
	public String material;
	public String clasificacion;
	public String forma;
	//Constructores
	Viento(String nombre, String marca, int fechaFabricacion, boolean electrico, String material, String clasificacion, String forma){
		super(nombre,marca,fechaFabricacion,electrico);
		this.material = material;
		this.clasificacion = clasificacion;
		this.forma = forma;
	}

	public String toString(){
		return super.toString() + "\nMaterial: " + material + "\nClasificacion: " + clasificacion + "\nForma: " + forma;
	}
}