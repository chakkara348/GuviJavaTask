package javaTask;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare variable
		int a, b, c, d, sum_a_and_b, sum_c_and_d;
		Scanner input = new Scanner(System.in);
		System.out.println("The Java program to find sum of two numbers which one is greater");
		System.out.print("Enter integer value for A: ");
		a = input.nextInt();
		System.out.print("Enter integer value for B: ");
		b = input.nextInt();
		System.out.print("Enter integer value for C: ");
		c = input.nextInt();
		System.out.print("Enter integer value for D: ");
		d = input.nextInt();
		sum_a_and_b = a + b;
		sum_c_and_d = c + d;
		if (sum_a_and_b > sum_c_and_d) {
			System.out.println("The sum of a and b is " + sum_a_and_b + " greater than sum of c and d " + sum_c_and_d);
		} else if (sum_a_and_b == sum_c_and_d) {
			System.out.println("The sum of a and b is " + sum_a_and_b + " equal to sum of c and d " + sum_c_and_d);
		} else {
			System.out.println("The sum of c and d is " + sum_c_and_d + " greater than sum of a and b " + sum_a_and_b);
		}

	}
}
