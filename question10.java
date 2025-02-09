package javaTask;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		String num_of_digits;
		
		System.out.println("The java program to find the number of digits on the integer number");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Integer value: ");
		number = input.nextInt();
		
		num_of_digits = Integer.toString(number);
		System.out.println("The Number of Digits in an integer number: " + num_of_digits.length());
	}

}
