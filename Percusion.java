class Percusion extends Instrumentos{
	//Atributos
	public boolean afinados;
	public Baquetas palos;
	//Constructor
	Percusion (String nombre, String marca, int fechaFabricacion, boolean electrico, boolean afinados, String tipoMadera, String forma, String nombrePalos){
		super(nombre,marca,fechaFabricacion,electrico);
		palos = new Baquetas(tipoMadera,forma,nombrePalos);
	}
		
	//Metodos


	public String toString(){
		return super.toString() + "\nTipo: Percusion" + "\nAfinado: " + afinados + "\nSe toca con: " + palos;
	}
}
