// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import javax.swing.JOptionPane;

class Percusion extends Instrumentos{
	//Atributos
	public boolean afinados;
	public Baquetas palos;
	
	//Constructor
	Percusion (String nombre, String marca, int fechaFabricacion, boolean electrico, boolean afinados){
		super(nombre,marca,fechaFabricacion,electrico);
		this.afinados = afinados;
	}
		
	//Metodos

	public void crear(){
		int op = 99, temp = 99;
		String 	menu  = "Tu instrumento usa palos?\n";
				menu += "1.- Si\n"; 
				menu += "2.- No\n";
		op = Opcion.inputInt(menu,"Palos para Percusion",1,2);
		if (op == 1){
			String tipoMadera = "", forma = "", nombrePalos = "";
			tipoMadera = Opcion.inputString("Que tipo de madera usan tus palos?", "Palos para Percusion");
			temp = Opcion.inputInt("Que tipo forma tienen tus palos?\n" + "1.- Conica\n" + "2.- Cilindrica\n", "Palos para Percusion",1,2);
			if (temp == 1)
				forma = "Conica";
			else 
				forma = "Cilindrica";
			temp = Opcion.inputInt("Como le llamas a tus palos?\n" + "1.- Baquetas\n" + "2.- Masas\n", "Palos para Percusion",1,2);
			if (temp == 1)
				nombrePalos = "Baquetas";
			else 
				nombrePalos = "Masas";
			palos = new Baquetas(tipoMadera,forma,nombrePalos);
		}
		else {
			palos = null;

		}
	}

	public String toString(){
		return super.toString() + "\nTipo: Percusion" + "\nAfinado: " + afinados + "\nSe toca con: " + palos;
	}
}
