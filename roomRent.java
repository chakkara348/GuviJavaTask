package javaTask;

import java.util.Scanner;

public class roomRent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number_of_month,number_of_days;
		float rent,total_rent;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of month to stay: ");
		number_of_month = input.nextInt();
		
		System.out.print("Enter rent amount per day: ");
		rent = input.nextFloat();
		
		System.out.print("Enter number of days for stay: ");
		number_of_days = input.nextInt();
		
		switch(number_of_month) {
		
		case 4:
		case 5:
		case 11:
		case 12:
			System.out.println("This is peak month so 20% extra will be high than actual room rent");
			total_rent = (float) ((rent+(rent*0.2)) * number_of_days);
			System.out.printf("The total rent amount: %.2f",total_rent);
			break;
		default:
			System.out.println("This is not a peak month");
			total_rent = rent * number_of_days;
			System.out.printf("The total rent amount: %.2f",total_rent);
			break;
		}
	}

}
