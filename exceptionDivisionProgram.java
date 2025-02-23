package javaTask;

import java.util.Scanner;

public class exceptionDivisionProgram {

	// Declare the variable to get a input from user
	int num1, num2;

	// Create a object for scanner class to get a input from user
	Scanner input = new Scanner(System.in);

	// Constructor method to get a input value from user
	exceptionDivisionProgram() {

		System.out.print("Enter Number 1: ");
		num1 = input.nextInt();
		System.out.print("Enter Nubmer 2: ");
		num2 = input.nextInt();
	}

	public void division() {

		// Checking the number2 is zero/not
		try {

			System.out.println("Division of two numbers is " + num1 / num2);

		} 
		//if number 2 is zero the exception is catch and handled on this catch method
		catch (ArithmeticException e) {
			if (num2 == 0) {
				System.out.println("The number 2 is 0 so arithmetic exception is displayed");
				System.out.print("Enter Nubmer 2 except 0: ");
				num2 = input.nextInt();
				System.out.println("Division of two numbers is " + num1 / num2);
			}
		}
		//Printing the program is completed
		finally {
			System.out.println("The Program is completed");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare the object for class
		exceptionDivisionProgram Obj = new exceptionDivisionProgram();
		//Calling the method
		Obj.division();

	}

}