package Sequential_Structure;

import java.util.Scanner;

public class EscapeSequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Next two lines: ");
		String nextLine = sc.nextLine();
		System.out.println("\n" + nextLine);
		
		System.out.println("\nHorizontal tabulation: ");
		String horizontalTabulation = sc.nextLine();
		System.out.print("\t" + horizontalTabulation);
		
		System.out.println("\n\nCar return: ");
		String carReturn = sc.nextLine();
		System.out.print("\r" + carReturn);
		
		System.out.println("\n\nInverted bars: ");
		String invertedBars = sc.nextLine(); 
		System.out.print("\\" + invertedBars);
		
		System.out.println("\n\nDouble quotation marks: ");
		String doubleQuotationMarks = sc.nextLine();
		System.out.printf("\"%s\"", doubleQuotationMarks);
		
		
		System.out.println("\n\n1° - Input: ");
		String input = sc.nextLine();
		System.out.println("\n\n2° - Input:");
		String anotherInput = sc.nextLine();
		System.out.printf("\n1 - Output %s\n 2 	- Output %s\n", input, anotherInput);
		
		sc.close();
	}
}
