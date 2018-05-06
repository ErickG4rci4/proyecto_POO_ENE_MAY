import javax.swing.JOptionPane;
import java.util.ArrayList;
class Main{
	
	public static void main(String[] args) {
		String  menu  = "1.- Insertar \n";
    			menu += "2.- Eliminar\n";
    			menu += "3.- Mostrar Todos\n";
    			menu += "4.- Ordenar\n";
    			menu += "5.- Buscar\n";
    			menu += "6.- Guardar\n";
    			menu += "7.- Salir\n";
    	String input = null;
    	int opcion = 0;
    	ArrayList <Instrumentos> misInstrumentos = new ArrayList<Instrumentos>();
    	while(opcion!=7){
    		try{
    			input = JOptionPane.showInputDialog(null, menu, "Administrador instrumentos", JOptionPane.PLAIN_MESSAGE);	
    			System.out.println(input);
    			if (input.equals("")){
    				JOptionPane.showMessageDialog(null,"Tienes que elegir una opcion");
    				opcion = 0;
    			}
    			else
    				opcion = Integer.parseInt(input);
    		}
    		catch (NumberFormatException e){
    			JOptionPane.showMessageDialog(null,"Solo pon numeros");
    		}
    		switch (opcion) {
    			case 1:
    				agregar(input);
    			break;
    			case 2: 
    			break;
    			case 3: 
    			break;
    			case 4:
    			break;
    			case 5: 
    			break;
    			case 6: 
    			break;
    			case 7: 
    			break;
    			default: 
    			System.out.println("");

    		}
		}
	}

	public static void agregar(String input){
		String menu  = "1.- Precusion\n";
			   menu += "2.- Cuerda\n";
			   menu += "3.- Viento\n";
		String nombre=null;
		String marca=null;
		int fechaFabricacion=0;
		int opcion = 0;
		boolean centinela=false;
		boolean electrico=false;
		while(nombre==null){
			input = JOptionPane.showInputDialog(null,"Dame el nombre de tu Instrumento", JOptionPane.PLAIN_MESSAGE);
			if (input.equals(""))
				JOptionPane.showMessageDialog(null,"Escribe algo");
			else
				nombre = input;
		}

		while(marca==null){
			input = JOptionPane.showInputDialog(null,"Que marca es?",JOptionPane.PLAIN_MESSAGE);
			if (input.equals("")) 
				JOptionPane.showMessageDialog(null,"Escribe algo");
			else
				marca = input;
		}

		while (fechaFabricacion==0) {
			input = JOptionPane.showInputDialog(null,"Anio de fabricacion",JOptionPane.PLAIN_MESSAGE);
			if (input.equals(""))
				JOptionPane.showMessageDialog(null,"Escribe algo");
			else{
				try{
					fechaFabricacion = Integer.parseInt(input);
				}
				catch (NumberFormatException e){ 
					JOptionPane.showMessageDialog(null,"Solo numeros");
				}
			}
		}

		while(centinela==false){
			input = JOptionPane.showInputDialog(null,"Es electrico?\n1.- Si\n2.- No",JOptionPane.PLAIN_MESSAGE);
			if (input.equals("")) 
				JOptionPane.showMessageDialog(null,"Escribe algo");
			try{
				opcion = Integer.parseInt(input);
				if (opcion<1 || opcion>2)
					JOptionPane.showMessageDialog(null,"Numero no valido");
				else if (opcion==1) {
					electrico = true;
					centinela = true;
				}
				else
					centinela = true;			
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Solo numeros");
			}
		}

		try{
			input = JOptionPane.showInputDialog(null,menu,"Instrumento", JOptionPane.PLAIN_MESSAGE);
			if (input.equals("")) 
				JOptionPane.showMessageDialog(null,"Elige una opcion!");
			else if (Integer.parseInt(input)>3 || Integer.parseInt(input)<1)
				JOptionPane.showMessageDialog(null,"Numero no valido");
			else
				opcion = Integer.parseInt(input);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Solo numeros");
		}
		
		switch (opcion) {
			case 1: 
				boolean afinados=false;
				centinela = false;
				while(centinela==false){
					input = JOptionPane.showInputDialog(null,"Es de tipo afinado?\n1.- Si\n2.- No",JOptionPane.PLAIN_MESSAGE);
					if (input.equals("")) 
						JOptionPane.showMessageDialog(null,"Escribe algo");
					try{
						opcion = Integer.parseInt(input);
						if (opcion<1 || opcion>2)
							JOptionPane.showMessageDialog(null,"Numero no valido");
						else if (opcion==1) {
							afinados = true;
							centinela = true;
						}
						else
							centinela = true;			
					}
					catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null,"Solo numeros");
					}
				}
			break;
			case 2: 

			break;
			case 3: 

			break;
			default: 	
		}		
	}
}