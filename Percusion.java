// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 05 de Febrero del 2018
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
		int op = 99;
		String 	menu  = "Tu instrumento usa palos?\n";
				menu += "1.- Si\n"; 
				menu += "2.- No\n";
		while(op>=3 || op<=0){ 
			op = Opcion.input(menu,"Palos para Percusion");
			if (op>=3 || op<=0){
				JOptionPane.showMessageDialog(null, "Número no válido");
			}
		}
		if (op == 1){
			String tipoMadera = "", forma = "", nombrePalos = "";
			tipoMadera = Opcion.inputString("Que tipo de madera usan tus palos?", "Palos para Percusion");
			while(!"conica".equalsIgnoreCase(forma) || !"cilindrica".equalsIgnoreCase(forma)){ 
				forma = Opcion.inputString("Que tipo forma tienen tus palos?\n" + "1.- Conica\n" + "2.- Cilindrica\n", "Palos para Percusion");
				if (!"conica".equalsIgnoreCase(forma) || !"cilindrica".equalsIgnoreCase(forma)){
					JOptionPane.showMessageDialog(null, "Solo numeros !");
				}
			}
			while(!"masas".equalsIgnoreCase(nombrePalos) || !"masas".equalsIgnoreCase(nombrePalos)){ 
				nombrePalos = Opcion.inputString("Como le llamas a tus palos?\n" + "1.- Baquetas\n" + "2.- Masas\n", "Palos para Percusion");
				if (!"baquetas".equalsIgnoreCase(nombrePalos) || !"masas".equalsIgnoreCase(nombrePalos)){
					JOptionPane.showMessageDialog(null, "Solo numeros !");
				}
			}
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
