package javaTask;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1, number2,swap;
		
		//get a integer value from user
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		number1 = input.nextInt();
		System.out.print("Enter Number 2: ");
		number2 = input.nextInt();
		
		//Swapping the number1 to number 2 and number 2 to number 1
		
		swap = number1;
		number1 = number2;
		number2 = swap;
		
		//Displayed the swapped numbers
		System.out.println("Swapped Number 1: " + number1);
		System.out.println("Swapped Number 2: " + number2);
		
	}

}
