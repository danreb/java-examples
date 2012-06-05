import javax.swing.JOptionPane;

public class Earthquake {
	/**
	 * @param args
	 * {@code Create Earthquake class}
	 */
	public Earthquake() {
      String earthq = JOptionPane.showInputDialog(null, "Please Enter the intensity\n(1 to 10) example: 7.2",
    		  "Earthquake Intensity", JOptionPane.INFORMATION_MESSAGE);
      try {
	      double eq = Double.parseDouble(earthq);
	      if(eq < 4.99) {
	         JOptionPane.showMessageDialog(null, "Little or No Damage");
	      } else if(eq <= 5.49) {
	    	  JOptionPane.showMessageDialog(null, "Some Damage");
	      } else if(eq <= 6.49) {
	    	  JOptionPane.showMessageDialog(null, "Serious Damage");
	      } else if(eq <= 7.49){
	    	  JOptionPane.showMessageDialog(null, "It's a Disaster");
	      } else if(eq <= 7.99){
	    	  JOptionPane.showMessageDialog(null, "Such a Catastrophe");
	      } else {
	    	  JOptionPane.showMessageDialog(null, "Such a Catastrophe");
	      }
		}
      catch(NumberFormatException nFE) {
			JOptionPane.showMessageDialog(null, "You've entered a non Numeric data!",
					"You've entered a non Numeric data!", JOptionPane.ERROR_MESSAGE);
      }
	}
}
