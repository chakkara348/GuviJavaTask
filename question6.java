package javaTask;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int fact=1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number fpr factorial: ");
		number = input.nextInt();
		
		for (int i=1; i <= number;i++) {
			fact = fact * i;
		}
		
		System.out.print("The Factorial of number "+number+" is "+fact);
	}
}
