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
		String 	menu  = "1.- Si\n"; 
				menu += "2.- No\n";
		while(op>=3 || op<=0){ 
			op = Opcion.input(menu,"Tu instrumento usa palos?");
			if (op>=3 || op<=0){
				JOptionPane.showMessageDialog(null, "Número no válido");
			}
		}
		if (op == 1){
			String tipoMadera, forma, nombrePalos;
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
