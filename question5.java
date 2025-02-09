package javaTask;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		System.out.println("The jave program to find the number is prime or not");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Integer number: ");
		number = input.nextInt();
		int count = 0;
		
		for(int i=1;i<=number;i++) {
			if (number%i == 0) {
				count = count+1;
			}
		}
		
		if(count == 2) {
			System.out.print("The number "+number+" Prime number");
		}else {
			System.out.print("The number "+number+" not Prime number");
		}

	}

}
