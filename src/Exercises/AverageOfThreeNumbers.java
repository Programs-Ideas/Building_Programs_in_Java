package Exercises;

import java.util.Scanner;

public class AverageOfThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1° number for average: ");
		float firstNumber = sc.nextInt();
		
		System.out.print("Enter the 2° number for average: ");
		float secondNumber = sc.nextInt();
		
		System.out.print("Enter the 3° number for average: ");
		float thirdNumber = sc.nextInt();
		float average = (firstNumber + secondNumber + thirdNumber) / 3;
		
		System.out.printf("\nThe average of three numbers is %s", average);
		
		sc.close();
	}

}
