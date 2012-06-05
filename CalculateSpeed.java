import javax.swing.JOptionPane;

public class CalculateSpeed {

	public CalculateSpeed() {
		String speed = JOptionPane.showInputDialog(null, "How Speed the Aircraft is?\nExample: 600", 
				"Input Speed of the Aircraft", JOptionPane.QUESTION_MESSAGE);
		try {
		    int s = Integer.parseInt(speed);
		    if( s >= 1100 ) {
		    	JOptionPane.showMessageDialog(null, "It's a Civilian Aircraft");
		    } else if( s >= 500 ) {
		    	JOptionPane.showMessageDialog(null, "That is a Military Aircraft");
		    } else {
		    	JOptionPane.showMessageDialog(null, "It's only a bird");
		    }
		}
		catch(NumberFormatException nFE) {
			JOptionPane.showMessageDialog(null, "You've entered a non Numeric data!",
					"You've entered a non Numeric data!", JOptionPane.ERROR_MESSAGE);
		}
	}

}
