// Erick Jair Garcia Barradas A01740197, Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;

class Percusion extends Instrumentos implements Serializable{

	public boolean afinados;
	public Baquetas palos;
	
	Percusion (String nombre, String marca, int fechaFabricacion, int electrico, int afinadosotro, Baquetas palos){
		super(nombre,marca,fechaFabricacion,electrico);
		this.palos = palos;
		if (afinadosotro==1)
			this.afinados=true;
		else 
			this.afinados=false;
	}

	Percusion(){}

	String getNombre(){
		return nombre;
	}

	String getMarca(){
		return marca;
	}
		
	public Percusion crear(String nombre, String marca, int fechaFabricacion, int electrico){
		String menu = "¿Es de tipo afinado?\n" + "1.- Si\n" + "2.- No";
		int afinado = Opcion.inputInt(menu,"Percusion",1,2);
		int op = 99, temp = 99;
		Baquetas palos;
	 	menu  = "Tu instrumento usa palos?\n";
		menu += "1.- Si\n"; 
		menu += "2.- No\n";
		op = Opcion.inputInt(menu,"Palos para Percusion",1,2);
		if (op == 1){
			String tipoMadera = "", forma = "", nombrePalos = "";
			tipoMadera = Opcion.inputString("Que tipo de madera usan tus palos?", "Palos para Percusion");
			temp = Opcion.inputInt("Que tipo forma tienen tus palos?\n" + "1.- Ovalada\n" + "2.- Cilindrica\n", "Palos para Percusion",1,2);
			if (temp == 1)
				forma = "Ovalada";
			else 
				forma = "Cilindrica";
			temp = Opcion.inputInt("Como le llamas a tus palos?\n" + "1.- Baquetas\n" + "2.- Masas\n", "Palos para Percusion",1,2);
			if (temp == 1)
				nombrePalos = "Baquetas";
			else 
				nombrePalos = "Masas";
			palos = new Baquetas(tipoMadera,forma,nombrePalos);
		}
		else 
			palos = null;
		return new Percusion (nombre,marca,fechaFabricacion,electrico,afinado,palos);
	}

	public String toString(){
		return super.toString() + "\nTipo: Percusion" + "\nAfinado: " + afinados + "\nSe toca con: " + palos;
	}
	
}
