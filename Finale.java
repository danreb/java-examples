import javax.swing.JOptionPane;

public class Finale {
	/**
	 * @param args
	 * @author Adolfo G. Nasol
	 * @website http://danreb.com
	 * 
	 */	
	public static void main(String[] args) {
		// Call FinaleMenu function
        FinaleMenu();
	}	
    // Create the Menu as custom function
	public static void FinaleMenu() {
		// Prepare the activity menu as object selections array
		Object selections[] = { "Please Select Activity", "Earthquake", 
				"Body Mass Index", "Calculate Speed", "Calculate Grades", "Find Celcius" };
		// Show Select Menu
		Object selected = JOptionPane.showInputDialog(null, "", 
				"Compilation of Java Activity", JOptionPane.INFORMATION_MESSAGE, 
				null, selections, selections[0]);
		if(selected == null) {
			int confirm = JOptionPane.showConfirmDialog(null, 
					"Do you really want to cancel?", "Cancel Program?", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		     if (confirm != 0) { FinaleMenu(); }
		} else {			
    	    String s = (String)selected;
			switch(s) {
			case "Earthquake":
	          Earthquake quake = new Earthquake();
	          quake.equals(quake);
	          break;
			case "Body Mass Index":
				BodyMassIndex bmi = new BodyMassIndex();
				bmi.equals(bmi);
				break;
			case "Calculate Speed":
				CalculateSpeed speed = new CalculateSpeed();
				speed.equals(speed);
				break;
			case "Calculate Grades":
				 StudentGrade grade = new StudentGrade();
				 grade.equals(grade);
				break;
			case "Find Celcius":
				Celcius celcius = new Celcius();
				celcius.equals(celcius);
				break;
	        default:
	        	JOptionPane.showMessageDialog(null, 
	        			"Oh Boy! please select activity\n in the dropdown menu!");
	        	FinaleMenu();
	          break;	
			}
			// Use this to loop and go back to Drop down Menu, Recursion technique
			FinaleMenu();
		  }
	  } 
}

	