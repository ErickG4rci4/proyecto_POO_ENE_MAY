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
    		int input2;
    		int opcion = 0;
    		boolean centinela;
    		while(opcion!=7){
    			input = Opcion.input(menu,titulo);
    			opcion = input;
    			switch (opcion) {
    				case 1:
    				try{
    					miBodega.agregar();
    				}
					catch(NullPointerException e){
						Opcion.output("Cancelando--------------");
					}
    				break;
    				case 2: 
    				try{
    					miBodega.eliminar();
    				}
    				catch (NullPointerException e) {
    					Opcion.output("Cancelando--------------");
    				}
    				break;
    				case 3:
    				miBodega.mostrarTodos();
    				break;
    				case 4:
    				input2 = Opcion.inputInt(("Como los quieres Ordenar\n" + "1.- Nombre\n" + "2.- Marca"),"Ordenar",1,2);
    				if(input2 == 1){
    					miBodega.ordenaNombre();
                    }
    				else{   
    				    miBodega.ordenaMarca();	
                    }
    				break;
    				case 5: 
    				try{
    					miBodega.buscar();
    				}
    				catch (NullPointerException e) {
    					Opcion.output("Cancelando--------------");
    				}
    				break;
    				case 6: 
    				miBodega.guardar();
    				break;
    				case 7:
    				Opcion.output("Adios");
    				break;
    				default: Opcion.output("Opcion no valida");
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