package Exercises;

public class SwapVariables {

	public static void main(String[] args) {
		
		int a = 15, b = 27, temp;
		
		// Print the values before swapping
		System.out.println("Before swapping : a, b = " + a + ", " + b);
		
		// Perform the swap using a temporary variable
		temp = a;
		a = b;
		b = temp;

		// Print the values after swapping
		System.out.println("After swapping : a, b = " + a + ", " + b);
	}
}