// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

class InstCuerda extends Instrumentos{
	
	private Cuerdas misCuerdas;
	public String tipo;
	public String material;
	
	//Constructor
	
	InstCuerda(String nombre, String marca, int fechaFabricacion, int electrico,String tipo, String material, Cuerdas misCuerdas){
		super(nombre,marca,fechaFabricacion,electrico);
		this.tipo = tipo;
		this.material = material;
		this.misCuerdas = misCuerdas;
	}

	InstCuerda(){}

	public InstCuerda crear(String nombre, String marca, int fechaFabricacion, int electrico){
		String menu = "Que tipo de cuerdas usa?\n" + "1.- Cuerdas Frotadas\n" + "2.- Cuerdas Golpeadas\n" + "3.- Cuerdas Pulsadas";
		String tipoIns;
		int opcion = Opcion.inputInt(menu,"Cuerdas",1,3);
		boolean afinado;
		if (opcion == 1) 
			tipoIns = "Frotadas";
		else if (opcion == 2) 
			tipoIns = "Golpeadas";
		else 
			tipoIns = "Pulsadas";
		String materialIns = Opcion.inputString("Que material esta hecho?","Material");
		String cuerdasMaterial = Opcion.inputString( ("Que material estan hechas las cuerdas?\n" +"Ejemplo: Nylon, Animal, Acero etc.."),"Material Cuerdas");
		String marcaCuerdas = Opcion.inputString("Que marca son las cuerdas?","Cuerdas");
		menu = "En que estado estan las cuerdas?\n" + "1.- Bueno\n" + "2.- Regular\n" + "3.- Malo";
		String estado = Opcion.inputString(menu,"Cuerdas");
		menu = "Estan afinadas?\n" + "1.- Si\n" + "2.- No";
		int afinadas = Opcion.inputInt(menu,"Cuerdas",1,2);
		if (afinadas==1) 
			afinado = true;
		else
			afinado = false;
		InstCuerda miInst;
		return miInst = new InstCuerda(nombre,marca,fechaFabricacion,electrico,tipoIns,materialIns,new Cuerdas(cuerdasMaterial,marcaCuerdas,estado,afinado));
	}

}