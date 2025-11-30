package Sequential_Structure;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1; // First number
		int num2; // Second number
		
		System.out.print("Enter first integer: "); // prompt
		num1 = sc.nextInt(); // Reads the first number by user
		
		System.out.print("Enter second integer: "); // prompt
		num2 = sc.nextInt(); // Reads the first number by user
		
		sc.close();
		
		if (num1 == num2) {
			System.out.printf("%d = %d\n", num1, num2);
		}
		
		if (num1 != num2) {
			System.out.printf("%d != %d\n", num1, num2);
		}
		
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
		}
		
		if (num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
		}
		
		if (num1 <= num2) {
			System.out.printf("%d <= %d\n", num1, num2);
		}
		
		if (num1 >= num2) {
			System.out.printf("%d >= %d\n", num1, num2);
		}	
	}
}