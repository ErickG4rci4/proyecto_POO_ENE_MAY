import javax.swing.JOptionPane;
public class Opcion {

   	public static int input(String menu, String titulo){
   		String input="null";
   		boolean centinela = false;
   		int output = 99;
		while(centinela==false){
			try{
				input = JOptionPane.showInputDialog(null, menu, titulo, JOptionPane.PLAIN_MESSAGE);
        		if (input.equals(""))
        			JOptionPane.showMessageDialog(null, "Tienes que elegir una opcion!" );
        		else{
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

	public static void output(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}
}