// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;
import java.util.*;

class Archivo implements Serializable{


	public static void borrar(){

	}

	public static <T> void guardar(ArrayList<T> inputArray ){
		String tmp, line;
		boolean t = new File("Data.txt").exists();
		//if (t = false)
			File archivo = new File("Data.txt");
		try {
			//BufferedReader read = new BufferedReader(new FileReader("Data.txt"));
			//line = read.readLine();
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

	public static <T> ArrayList cargar(){
		String line;
		ArrayList<T> ArrayInst = null; 
		T Obj = null;
		try {
		BufferedReader read = new BufferedReader(new FileReader("Data.txt"));
		line = read.readLine();
		FileInputStream uno = null;
		ObjectInputStream dos = null;
		if (line == null){
			File archivo = new File("Data.txt");
		}
		else {
			int tmp = Integer.parseInt(line);
			for(int i = 0; i<tmp; i++){
				uno = new FileInputStream("Data.txt");
				dos = new ObjectInputStream(uno);
				Obj = (T) dos.readObject();
				System.out.println(Obj);			
				ArrayInst.add(Obj);
			}
		}
	}
	catch (IOException e) {
    	System.err.println(e);
    	System.exit(1);
	}
	catch (ClassNotFoundException e){
		System.err.println(e);
	}
	return ArrayInst;
	}
	
}