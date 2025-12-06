package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class RectangleAreaAndPerimeter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Test Data:\n ");
		System.out.print("Enter the width of Rectangle: ");
		double width = sc.nextDouble();
		
		System.out.print("Enter the height of Rectangle: ");
		double height = sc.nextDouble();
		double area = width * height;
		double perimeter = (2 * width) + (2 * height);
		
		System.out.printf("\nArea is %.1f * %.1f = %.2f", width, height, area);
		System.out.printf("\nPerimeter is 2 * (%.1f + %.1f) = %.2f", width, height, perimeter);
		
		System.out.println("\nExpected Output: "
				+ "Area is 5.6 * 8.5 = 47.60\r\n"
				+ "Perimeter is 2 * (5.6 + 8.5) = 28.20");
		
		sc.close();
	}
}
