// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;
import java.util.*;

class Archivo{

	public static void borrar(){}

	public static <T> void guardar( T[] inputArray ){
		String tmp;
		File archivo = new File("Data.txt");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
			for (T element : inputArray){
				tmp = element.toString();
				writer.write(tmp);
				writer.newLine();
			}
			writer.close();
		} 
		catch (IOException e) {
    		System.err.println(e);
    		System.exit(1);
		}
	}

}