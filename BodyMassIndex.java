import javax.swing.JOptionPane;

public class BodyMassIndex {

	public BodyMassIndex() {
        String Weight = JOptionPane.showInputDialog(null, "What is your Weight in pounds\nenter 110 for 110 lbs?", 
        		"Enter your Weight in pounds", JOptionPane.QUESTION_MESSAGE);
        int weight = Integer.parseInt(Weight);
        String Height = JOptionPane.showInputDialog(null, "What is your Height in inches\nHint: 1 foot = 12 inches?", 
        		"Enter your Height in inches", JOptionPane.QUESTION_MESSAGE);
        float height = Float.parseFloat(Height);
        // Formula reference -> http://www.whathealth.com/bmi/formula.html
        float z = height * height;
        float bmi = (weight * 703) / z;
        JOptionPane.showMessageDialog(null, "Body Mass Index is: " + bmi);
    }
}
