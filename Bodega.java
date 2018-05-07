// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.util.ArrayList;
import java.io.*;
class Bodega {
	ArrayList<Instrumentos> misInstrumentos = new ArrayList<Instrumentos>();

	public void agregar(){
		String nombre;
		String marca;
		int fechaFabricacion;
		int electrico;

		nombre = Opcion.inputString("Cual es el nombre de tu instrumento?","Instrumento");
		marca = Opcion.inputString("Que marca es?","Instrumento");
		fechaFabricacion = Opcion.input("En que anio se fabrico?","Instrumento");
		electrico = Opcion.inputInt(("Es electrico?\n" + "1.- Si\n" + "2.- No"),"Instrumento",1,2);

		String tipoIns  = "1.- Percusion\n";
 			   tipoIns += "2.- Cuerda\n";
   			   tipoIns += "3.- Viento\n";
   		int opcion = Opcion.inputInt(tipoIns,"Instrumento",1,3);
   		
   		if (opcion == 1) {
   			Percusion miPercusion = new Percusion();
   			misInstrumentos.add(miPercusion.crear(nombre,marca,fechaFabricacion,electrico));
   			System.out.println(misInstrumentos.get(0));
   		}
   		else if (opcion == 2) {
   			InstCuerda miCuerda = new InstCuerda();
   			misInstrumentos.add(miCuerda.crear(nombre,marca,fechaFabricacion,electrico));
   		}
   		else if (opcion == 3) {
   			Viento miViento = new Viento ();
   			misInstrumentos.add(miViento.crear(nombre,marca,fechaFabricacion, electrico));
   		}
	}

	public void eliminar(){
		String menu = Opcion.showNombre(misInstrumentos);
		int eleccion = Opcion.inputInt(menu,"Eliminar",1,(misInstrumentos.size())-1);
		misInstrumentos.remove(eleccion-1);
		menu = Opcion.showNombre(misInstrumentos);
		Opcion.output(menu);
	}

	public void mostrarTodos(){
		Opcion.showAll(misInstrumentos);
	}

	public void guardar(){
		Archivo.guardar(misInstrumentos);
		System.out.println(misInstrumentos);
	}

	public  void cargar(){
		ArrayList<Instrumentos> mi = new ArrayList<Instrumentos>();
		mi = Archivo.cargar();
	}

	/*
	buscar(){

	}*/

}