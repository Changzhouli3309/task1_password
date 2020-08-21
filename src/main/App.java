package main;

import java.util.Scanner;

public class App {

	private static Scanner scan = new Scanner(System.in);
	// import scanner

	public static void main(String[] args) {
		String pass = "pass1234"; // saved password
		boolean isMatch = false;

		for (int i = 0; i < 3; i++) { // 3 times to try

			System.out.print("Enter password: ");
			String input = scan.nextLine(); // User input

			isMatch = pass.equals(input); // Check input
			if (isMatch) {
				System.out.println("Progress...");
				break; // get out when password is matched
			}

			System.out.println("Wrong Password, try again (" + (2 - i) + " trise left.)\n");
		}

		if (!isMatch) { // information when password is not matched
			System.out.println("This account is now locked.");
		}
	}

}
