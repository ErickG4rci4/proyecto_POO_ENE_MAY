import javax.swing.JOptionPane;
public class opcion {
    public static void main(String[] args) {
    	String  menu  = "1. Hacer algo \n";
    			menu += "2. Hacer otra cosa\n";
    			menu += "3. no hacer nada\n";
    			menu += "4. salir\n\n";
    			menu += "Que quieres hacer ?";
    	String opx = null;
		try{
			opx = JOptionPane.showInputDialog(null, menu, "Tareax.y", JOptionPane.PLAIN_MESSAGE);
	        System.out.println(opx);
	        if (opx.equals(""))
	        	JOptionPane.showMessageDialog(null, "Escribe algo !" );
	        else{
	        	int op = Integer.parseInt(opx);
	        	// entra a un switch
	        	JOptionPane.showMessageDialog(null, "tu opcion es " + op + " !");
	        }
		}	
		catch(NumberFormatException x){
			JOptionPane.showMessageDialog(null, "Escribe numeros !" );
		};
        //System.exit(0);
    }
}