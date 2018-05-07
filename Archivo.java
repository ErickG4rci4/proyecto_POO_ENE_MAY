// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;
import java.util.*;

class Archivo implements Serializable{


	public static void borrar(){

	}

	public static <T> void guardar(ArrayList<T> inputArray ){
		String tmp, line;
		File archivo = new File("Data.txt");
		try {
			FileOutputStream arch = new FileOutputStream(archivo);
			ObjectOutputStream Obj = new ObjectOutputStream(arch);
			Obj.writeObject(inputArray);
			Obj.close();
		}
		catch (IOException e) {
    		System.err.println(e);
    		System.exit(1);
		}
	}

	public static <T> ArrayList cargar(){
		String line;
		ArrayList<T> ArrayInst = null; 
		try {
			BufferedReader read = new BufferedReader(new FileReader("Data.txt"));
			line = read.readLine();
			FileInputStream uno = null;
			ObjectInputStream dos = null;
			uno = new FileInputStream("Data.txt");
			dos = new ObjectInputStream(uno);
			List<T> Obj = (List<T>) dos.readObject();
			System.out.println(Obj);
		}
		catch (IOException e) {
    		System.err.println(e);
    		System.exit(1);
		}
		catch (ClassNotFoundException e){
			System.err.println("No esta agarrando !");
		}
		return ArrayInst;
	}

}