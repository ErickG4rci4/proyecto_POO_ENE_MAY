class Cuerda extends Instrumentos{
	private Cuerdas misCuerdas;
	public String tipo;
	public String material;
	//Constructor
	Cuerda(String nombre, String marca, int fechaFabricacion, boolean electrico,String tipo, String material, String cmaterial, String cmarca , String estado, boolean afinado){
		super(nombre,marca,fechaFabricacion,electrico);
		this.tipo = tipo;
		this.material = material;
		//misCuerdas = new Cuerdas(cmaterial,cmarca,estado,afinado);
	}
}