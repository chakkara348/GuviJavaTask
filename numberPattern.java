package javaTask;

import java.util.Scanner;

public class numberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,row,column,number_display=1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for number of rows to display: ");
		number = input.nextInt();
		
		for (row=0;row<number;row++) {
			for(column=0;column<=row;column++) {
				System.out.print(number_display);
				number_display++;
			}
			System.out.println();
		}
	}

}
