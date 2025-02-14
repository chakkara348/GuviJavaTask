package javaTask;

import java.util.Scanner;

public class biggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[3];
		int count,biggest;
		
		Scanner input = new Scanner(System.in);
		
		for(count=1;count<=numbers.length;count++) {
			System.out.print("Enter number "+count+":");
			numbers[count-1]=input.nextInt();
		}
		
		biggest = numbers[0];
		
		for(count=1;count<3;count++) {
			
			if (biggest > numbers[count]) {
				biggest = biggest;
			}else {
				biggest = numbers[count];
			}
		}
		System.out.print("The biggest number is "+biggest);
	}

}
