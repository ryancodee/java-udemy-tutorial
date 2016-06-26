package tutorial7;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// create scanner object
		Scanner input = new Scanner(System.in);

		// output the prompt
		System.out.println("Enter a floating point value: ");

		// wait for the user to enter something
		// String line = input.nextLine();

		// int value = input.nextInt();
		double value = input.nextDouble();

		// tell them what they entered.
		// System.out.println("You entered: " + line);
		System.out.println("You entered: " + value);
	}
}
