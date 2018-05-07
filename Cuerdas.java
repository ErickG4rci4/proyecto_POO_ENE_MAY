// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

class Cuerdas{

	private String material;
	private String marca;
	private String estado;
	private boolean afinado;

	Cuerdas(String material, String marca, String estado, boolean afinado){
		this.material = material;
		this.marca = marca;
		this.estado = estado;
		this.afinado  = afinado;
	}

	public String toString(){
		return marca + " " + material + " " + estado + " " + "afinado" + afinado;
	}

}