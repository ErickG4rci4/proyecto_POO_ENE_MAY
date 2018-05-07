// Erick Jair Garcia Barradas A01740197 ,  Carlos Orozco A01328800
// 07 de Mayo del 2018

import javax.swing.JOptionPane;

public class Opcion {

   	public static int input(String menu, String titulo){
   		String input = "null";
   		boolean centinela = false;
   		int output = 99;
		while(centinela == false){
			try{
				input = JOptionPane.showInputDialog(null, menu, titulo, JOptionPane.PLAIN_MESSAGE);
        		if (input.equals(""))
        			JOptionPane.showMessageDialog(null, "Tienes que elegir una opcion!" );
        		else {
	        		output = Integer.parseInt(input);
	        		centinela = true;
        		}
			}	
			catch(NumberFormatException x){
				JOptionPane.showMessageDialog(null, "Escribe numeros !" );
			}
		}
		return output;
	}

	public static int inputInt(String menu, String titulo, int a, int b){
		String input;
		int output = 0;
		boolean centinela = false;
		while(centinela == false){
			input = JOptionPane.showInputDialog(null,menu,JOptionPane.PLAIN_MESSAGE);
			if (input.equals("")) 
				JOptionPane.showMessageDialog(null,"Escribe algo");
			try{
				output = Integer.parseInt(input);
				if (output < a || output > b)
					JOptionPane.showMessageDialog(null,"Numero no valido");
				else
					centinela = true;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Solo numeros");
			}
		}
		return output;
	}


	public static String inputString(String menu, String titulo){
   		String input = "null", output = "null";
   		boolean centinela = false;
		while(centinela == false){
			input = JOptionPane.showInputDialog(null, menu, titulo, JOptionPane.PLAIN_MESSAGE);
        	if (input.equals(""))
        		JOptionPane.showMessageDialog(null, "Tienes que escribir algo!");
        	else{
	        	output = input;
	        	centinela = true;
        	}
		}
		return output;
	}

	public static void output(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}
}