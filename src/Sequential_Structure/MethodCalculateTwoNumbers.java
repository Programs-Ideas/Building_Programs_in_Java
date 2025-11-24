package Sequential_Structure;

import java.util.*;

public class MethodCalculateTwoNumbers {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter the first number: ");
		 int x = sc.nextInt();
		 System.out.print("Enter the second number: ");
		 int y = sc.nextInt();
		 
		 System.out.println("The sum of numbers is " + calcular(x,y));
		 
		 sc.close();
	}
	
	public static int calcular(int x, int y) {
		int calcular = x + y;
		return calcular;
	}	
}