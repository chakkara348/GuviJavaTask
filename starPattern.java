package javaTask;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows to display: ");
		number = input.nextInt();

		for (int i = 0; i < number / 2 + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < number - 2 - 2 * i; j++) {
				System.out.print(" ");
			}

			if (i != number / 2) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = number / 2 - 1; i >= 0; i--) {
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < number - 2 - 2 * i; j++) {
				System.out.print(" ");
			}

			if (i != number / 2) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
