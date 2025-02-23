package javaTask;

import java.util.Scanner;

public class InvalidAgeException extends Exception{

	//Constructor method for custom exception
	public InvalidAgeException(String message) {
		super(message);//pass the message to parent class
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the integer type for age
		int age;
		
		//Declare the object for scanner class to get user input for age
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Age: ");
		age = input.nextInt();//assign user value to variable age
		
		//Try block to check the age is greater than 18 or not
		try {
			
			if (age > 18) {
				System.out.println("You're not restricted");
			}
			else {
				throw new InvalidAgeException("Your age is below 18 so you're restricted");
			}
			
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("The caught exception - "+e.getMessage());
		}
	}

}
