package javaTask;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int num_of_digits = 0;

		System.out.println("The java program to find the number of digits on the integer number");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Integer value: ");
		number = input.nextInt();

		while (number != 0) {
			number = number / 10;
			num_of_digits = num_of_digits + 1;
		}
		System.out.println("The number of digits of integer number is "+num_of_digits);
	}

}
