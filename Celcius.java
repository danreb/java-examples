import javax.swing.JOptionPane;

public class Celcius {

	public Celcius() {
		String celcius = JOptionPane.showInputDialog(null, "What is the Celcius?", 
				"Input the Celcius", JOptionPane.QUESTION_MESSAGE);
		try {
		    int c = Integer.parseInt(celcius);
		    int f = (c * 9/5) + 32;
		    int k = c + 273;
		    
		    JOptionPane.showMessageDialog(null, "Farenheight is equal to " + f);
		    JOptionPane.showMessageDialog(null, "Kelvin is equal to " + k);
		}
		catch(NumberFormatException nFE) {
			JOptionPane.showMessageDialog(null, "You've entered a non Numeric data!",
					"You've entered a non Numeric data!", JOptionPane.ERROR_MESSAGE);
	   }
   }
}
