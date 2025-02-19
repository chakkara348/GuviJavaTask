package GuviLearning;

import java.util.Scanner;

public class divisionProgram {

	// Declare the variable to get a input from user
	int num1, num2;

	// Create a object for scanner class to get a input from user
	Scanner input = new Scanner(System.in);

	// Constructor method to get a input value from user
	divisionProgram() {

		System.out.print("Enter Number 1: ");
		num1 = input.nextInt();
		System.out.print("Enter Nubmer 2: ");
		num2 = input.nextInt();
	}

	public void division() {

		// Checking the number2 is zero/not
		try {

			System.out.println("Division of two numbers is " + num1 / num2);
			System.out.print("The program is completed");

		} catch (ArithmeticException e) {
			if (num2 == 0) {
				System.out.println("The division number 2 is 0 so arithmetic exception is displayed");
				System.out.print("Enter Nubmer 2 except 0: ");
				num2 = input.nextInt();
				System.out.println("Division of two numbers is " + num1 / num2);
				System.out.print("The program is completed...");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divisionProgram Obj = new divisionProgram();
		Obj.division();

	}

}
