package Sequential_Structure;

import java.util.Scanner;

public class MainDisplayMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DisplayMessage myMessage = new DisplayMessage();
		
		System.out.print("Please enter the message name: ");
		String message = sc.nextLine();
		System.out.println();
		

		myMessage.displayMessage(message);
		sc.close();
	}
}