// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 05 de Febrero del 2018

import javax.swing.JOptionPane;

public class Opcion {

		String 	titulo;
		String 	input;
    	String  menu;

    	public int input(String menu, String titulo){
    		String input = null;
    		int output = -1;
			try{
				input = JOptionPane.showInputDialog(null, menu, titulo, JOptionPane.PLAIN_MESSAGE);
	        	System.out.println(input);
	        	if (input.equals("")){
	        		JOptionPane.showMessageDialog(null, "Tienes que elegir una opcion!" );
	        	}
	        	else{
	        		output = Integer.parseInt(input);
	        	}
			}	
			catch(NumberFormatException x){
				JOptionPane.showMessageDialog(null, "Escribe numeros !" );
			}
			return output;
		}

}