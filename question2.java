package javaTask;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare the variable
		int number;
		
		System.out.println("The java program to find the number is even or not");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Integer number: ");
		number = input.nextInt();
		
		if (number%2 == 0) {
			System.out.println("The integer number " + number + " is even number");
		}else {
			System.out.println("The integer number " + number + " is not an even number");
		}
	}

}
