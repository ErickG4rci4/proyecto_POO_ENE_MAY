// Erick Jair Garcia Barradas A01740197, Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;

class Viento extends Instrumentos implements Serializable{

	public String material;
	public String clasificacion;
	public String forma;
	
	Viento(String nombre, String marca, int fechaFabricacion, int electrico, String material, String clasificacion, String forma){
		super(nombre,marca,fechaFabricacion,electrico);
		this.material = material;
		this.clasificacion = clasificacion;
		this.forma = forma;
	}

	Viento(){}

	String getNombre(){
		return nombre;
	}

	String getMarca(){
		return marca;
	}

	public Viento crear(String nombre, String marca, int fechaFabricacion, int electrico){
		String forma, clasificacion, material;
		material = Opcion.inputString("¿De que materia esta hecho?","Viento");
		String menu = "¿Que forma tiene?\n" + "1.- Conico\n" + "2.- Cilindrica\n";
		int opcion = Opcion.inputInt(menu,"Viento",1,2);
		if (opcion == 1)
			forma = "Conico";
		else
			forma = "Cilindrica";
		menu = "¿A que grupo pertenece?\n" + "1.- Embocadura\n" + "2.- Lengueta\n" + "3.- Boquilla";
		opcion = Opcion.inputInt(menu,"Viento",1,3);
		if (opcion == 1) 
			clasificacion = "Embocadura";
		else if (opcion == 2) 
			clasificacion = "Lengueta";
		else 
			clasificacion = "Boquilla";
		return new Viento(nombre,marca,fechaFabricacion,electrico,material, clasificacion,forma);
	}

	public String toString(){
		return super.toString() + "\nMaterial: " + material + "\nClasificacion: " + clasificacion + "\nForma: " + forma;
	}

}