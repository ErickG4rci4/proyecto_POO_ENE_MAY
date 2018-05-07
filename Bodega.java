// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.util.ArrayList;
import java.io.*;
class Bodega implements Serializable {
	ArrayList<Instrumentos> misInstrumentos = new ArrayList<Instrumentos>();

	public void agregar(){
		String nombre;
		String marca;
		int fechaFabricacion;
		int electrico;

		nombre = Opcion.inputString("¿Cual es el nombre de tu instrumento?","Instrumento");
		marca = Opcion.inputString("¿Que marca es?","Instrumento");
		fechaFabricacion = Opcion.input("¿En que anio se fabrico?","Instrumento");
		electrico = Opcion.inputInt("¿Es electrico?","Instrumento",1,2);

		String tipoIns  = "1.- Percusion\n";
 			   tipoIns += "2.- Cuerda\n";
   			   tipoIns += "3.- Viento\n";
   		int opcion = Opcion.inputInt(tipoIns,"Instrumento",1,3);
   		
   		if (opcion == 1) {
   			Viento miPercusion = new Viento();
   			misInstrumentos.add(miPercusion.crear(nombre,marca,fechaFabricacion,electrico));
   			System.out.println(misInstrumentos.get(0));
   		}
   		/*else if (opcion == 2) {
   			InstCuerda miCuerda = new InstCuerda();
   			miCuerda.crear(nombre,marca,fechaFabricacion,electrico);

   		}
   		else if (opcion == 3) {
   			Viento miViento = new Viento ();
   			miViento.crear(nombre,marca,fechaFabricacion, electrico);
   			misInstrumentos.add(miViento);
   		}*/
	}

	public void guardar(){
		Archivo.guardar(misInstrumentos);
		System.out.println(misInstrumentos);
	}

	/*
	eliminar(){

	}

	buscar(){

	}*/

}