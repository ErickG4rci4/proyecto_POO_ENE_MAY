

class InstCuerda extends Instrumentos{
	
	private Cuerdas misCuerdas;
	public String tipo;
	public String material;
	
	//Constructor
	
	Cuerda(String nombre, String marca, int fechaFabricacion, boolean electrico,String tipo, String material, Cuerdas misCuerdas){
		super(nombre,marca,fechaFabricacion,electrico);
		this.tipo = tipo;
		this.material = material;
		this.misCuerdas = misCuerdas;
	}

	void crear(){
		input 
		this.misCuerdas = new ();
	}

}