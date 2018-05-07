// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.util.*;
import java.io.*;
class Bodega {
	static ArrayList<Instrumentos> misInstrumentos = new ArrayList<Instrumentos>();

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
		int eleccion = Opcion.inputInt(menu,"Eliminar",1,(misInstrumentos.size()));
		misInstrumentos.remove(eleccion-1);
		menu = Opcion.showNombre(misInstrumentos);
		Opcion.output(menu);
	}

	public void mostrarTodos(){
		Opcion.showAll(misInstrumentos);
	}

	public void buscar(){
		int encontrado = 0;
		String otro=Opcion.inputString("Dame la palabra clave","Busqueda");
		for (int i = 0;i < misInstrumentos.size();i++) {
			encontrado = misInstrumentos.get(i).compareTo(otro);
			if (encontrado==1){
				Opcion.output(misInstrumentos.get(i).toString());
				i = misInstrumentos.size();
			}
		}
		if (encontrado == 0) {
			Opcion.output("El elemento: " + otro + " no se encuentra");
		}
	}


	public void guardar(){
		Archivo.guardar(misInstrumentos);
		System.out.println(misInstrumentos);
	}

	public  void cargar(){
		ArrayList<Instrumentos> mi = new ArrayList<Instrumentos>();
		mi = Archivo.cargar();
	}

	public void ordenaNombre() {
		Instrumentos[] tmp = new Instrumentos[misInstrumentos.size()+1];
		int aux = misInstrumentos.size(), pos, a = 0, b = 0;
		for (int i = 0; i < aux; i++){
			pos = 0;
			for (int j = 0; j < aux; j++){
				if(misInstrumentos.get(i).getNombre().compareTo(misInstrumentos.get(j).getNombre()) > 0)
					pos++;
				if(misInstrumentos.get(i).getNombre().compareTo(misInstrumentos.get(j).getNombre()) == 0)
					a = misInstrumentos.get(i).getMarca().compareTo(misInstrumentos.get(j).getMarca());
					b = misInstrumentos.get(j).getMarca().compareTo(misInstrumentos.get(i).getMarca());
					if(a > b)
					pos++;
			}
			tmp[pos] = misInstrumentos.get(i);
		}
		misInstrumentos.clear();
		for (int k = 0; k < aux; k++){
			misInstrumentos.add(k, tmp[k]);
		}
	}

	public void ordenaMarca(){
		Instrumentos[] tmp = new Instrumentos[misInstrumentos.size()+1];
		int aux = misInstrumentos.size(), pos;
		for (int i = 0; i < aux; i++){
			pos = 0;
			for (int j = 0; j < aux; j++){
				if(misInstrumentos.get(i).getMarca().compareTo(misInstrumentos.get(j).getMarca()) > 0)
					pos++;
				if(misInstrumentos.get(i).getMarca().compareTo(misInstrumentos.get(j).getMarca()) == 0)
					if(misInstrumentos.get(i).getFechaFabricacion() > misInstrumentos.get(j).getFechaFabricacion())
					pos++;
			}
			tmp[pos] = misInstrumentos.get(i);
		}
		misInstrumentos.clear();
		for (int k = 0; k < aux; k++){
			misInstrumentos.add(k, tmp[k]);
		}
	}
}