
public class MethodOverloading {

	public static void main(String[] args) {
		
		// Declare variable
		int val1 = 20;
		int val2 = 10;
		int val3 = 5;
		
		String s1 = "30";
		String s2 = "25";
		
		// We use the first AddValues method
		int result = AddValues(val1, val2);
		System.out.println("First AddValues method: " + result); // must be 30
		
		// We use the second AddValues method
		int result2 = AddValues(val1, val2, val3);
		System.out.println("Second AddValues method: " + result2); // must be 35
		
		// We use the third AddValues method
		int result3 = AddValues(s1, s2);
		System.out.println("Third AddValues method: " + result3); // must be 55
		
		
	}
	
	// Create the first AddValues method
	private static int AddValues(int int1, int int2) {
		return int1 + int2;
	}
	
	// Create the second AddValues method
	private static int AddValues(int int1, int int2, int int3) {
		return int1 + int2 + int3;
	}

	// Create the third AddValues method
	private static int AddValues(String s1, String s2) {
		int result1 = Integer.parseInt(s1);
		int result2 = Integer.parseInt(s2);
		return result1 + result2;
	}
}
