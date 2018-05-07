// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import java.io.*;

class Cuerdas implements Serializable{
	//Atributos
	private String material;
	private String marca;
	private String estado;
	private boolean afinado;

	//Constructor
	Cuerdas(String material, String marca, String estado, boolean afinado){
		this.material = material;
		this.marca = marca;
		this.estado = estado;
		this.afinado  = afinado;
	}

	String getMaterial(){
		return material;
	}

}