// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;
import java.util.*;

class Archivo implements Serializable{

	
	//public static void borrar(){}

	public static <T> void guardar( T[] inputArray ){
		String tmp;
		File archivo = new File("Data.txt");
		try {
			FileOutputStream arch = new FileOutputStream(archivo);
			ObjectOutputStream Obj = new ObjectOutputStream(arch);
			for (T element : inputArray){
				Obj.writeObject(element);
			}
			Obj.close();
		}
		catch (IOException e) {
    		System.err.println(e);
    		System.exit(1);
		}
	}

}