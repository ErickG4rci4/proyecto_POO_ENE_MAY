// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018


import javax.swing.JOptionPane;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
		Bodega miBodega = new Bodega();
		try{
			String  menu  = "1.- Insertar \n";
    				menu += "2.- Eliminar\n";
    				menu += "3.- Mostrar Todos\n";
    				menu += "4.- Ordenar\n";
    				menu += "5.- Buscar\n";
    				menu += "6.- Guardar\n";
    				menu += "7.- Salir\n";
    		String titulo = "Administrador de Instrumentos";
    		int input;
    		int opcion = 0;
    		while(opcion!=7){
    			input = Opcion.input(menu,titulo);
    			opcion = input;
    			switch (opcion) {
    				case 1:
					miBodega.agregar();
    				break;
    				case 2: 
    				miBodega.eliminar();
    				break;
    				case 3:
    				miBodega.mostrarTodos();
    				break;
    				case 4:
    				break;
    				case 5: 
    				break;
    				case 6: 
    				miBodega.guardar();
    				break;
    				case 7: 
    				break;
    				default: 
    				System.out.println("");
    			}
			}
		}
		catch (NullPointerException e){
			Opcion.output("Adios");
		}
		finally{
			miBodega.guardar();
		}
	}
}