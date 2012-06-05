import javax.swing.JOptionPane;


public class StudentGrade {

	public StudentGrade() {
		String GradeEM = JOptionPane.showInputDialog(null, "What's your Grade in EM?", 
				"Input Grade in EM 100", JOptionPane.QUESTION_MESSAGE);
		int g1 = Integer.parseInt(GradeEM);
		String GradeWEB = JOptionPane.showInputDialog(null, "What's your Grade in Web Design?", 
				"Input Grade in Web Design", JOptionPane.QUESTION_MESSAGE);
		int g2 = Integer.parseInt(GradeWEB);
		String GradeLinux = JOptionPane.showInputDialog(null, "What's your Grade in Linux?", 
				"Input Grade in Linux", JOptionPane.QUESTION_MESSAGE);
		int g3 = Integer.parseInt(GradeLinux);
		String GradeNetworking = JOptionPane.showInputDialog(null, "What's your Grade in Networking?", 
				"Input Grade in Neworking", JOptionPane.QUESTION_MESSAGE);
		int g4 = Integer.parseInt(GradeNetworking);
		String GradeJava = JOptionPane.showInputDialog(null, "What's your Grade in Java Programming?", 
				"Input Grade in Java Programming", JOptionPane.QUESTION_MESSAGE);
		int g5 = Integer.parseInt(GradeJava);
		String GradeTechSkills = JOptionPane.showInputDialog(null, "What's your Grade in Technical Skills?", 
				"Input Grade in Technical Skills", JOptionPane.QUESTION_MESSAGE);
		int g6 = Integer.parseInt(GradeTechSkills);
		
		// Add all grades
		int Total = g1 + g2 + g3 +g4 + g5 + g6;
		int Average = Total/6;
		
		if( Average >= 88 || Average >= 90) {
			JOptionPane.showMessageDialog(null, "Average: " + Average + " %, your qualified as First Honor");
		} else if ( Average >= 85 || Average >= 87) {
			JOptionPane.showMessageDialog(null, "Average: " + Average + " %, your qualified as Second Honor");
		}  else if ( Average >= 81 || Average >= 84) {
			JOptionPane.showMessageDialog(null, "Average: " + Average + " %, your qualified as Third Honor");	   
	   } else {
		    JOptionPane.showMessageDialog(null, "Average: " + Average + " %");
	   }
     }
}
