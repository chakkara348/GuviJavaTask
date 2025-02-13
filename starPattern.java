package javaTask;

public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i < n / 2 + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < n - 2 - 2 * i; j++) {
				System.out.print(" ");
			}

			if (i != n / 2) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n / 2 - 1; i >= 0; i--) {
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j < n - 2 - 2 * i; j++) {
				System.out.print(" ");
			}

			if (i != n / 2) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
