package Exercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Test Data:\n ");
		System.out.print("Enter the radius: ");
		
		double radius = sc.nextDouble();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2.0);
		
		System.out.printf("Perimeter is = %f\n", perimeter);
		System.out.printf("Area is = %f", area);
		
		System.out.println("\n\nExpected output: "
				+ "Expected Output\r\n"
				+ "Perimeter is = 47.12388980384689\r\n"
				+ "Area is = 176.71458676442586");
		sc.close();
	}
}
