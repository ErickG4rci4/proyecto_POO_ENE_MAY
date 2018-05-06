class Baquetas{
	public String nombre;
	public String tipoMadera;
	public String forma;

	Baquetas(String nombre,String tipoMadera, String forma){
		this.nombre = nombre;
		this.tipoMadera = tipoMadera;
		this.forma = forma;
	}

	public String toString(){
		return forma;
	}
}