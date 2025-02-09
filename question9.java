package javaTask;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int citizen_age;
		String citizen_name;

		System.out.println("The jave program to find a citizen is senior citizen or not");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Citizen name: ");
		citizen_name = input.next();
		System.out.print("Enter Citizen age: ");
		citizen_age = input.nextInt();

		if (citizen_age < 60) {
			System.out.println("The Citizen " + citizen_name + " is not senior citizen");
		} else {
			System.out.println("The Citizen " + citizen_name + " is senior citizen");
		}

	}

}
