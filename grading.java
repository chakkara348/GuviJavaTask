package javaTask;

import java.util.Scanner;

public class grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student_mark;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Mark: ");
		student_mark = input.nextInt();
		
		if (student_mark == 100) {
			System.out.print("Your grade is S");
		}else if(student_mark <=99 && student_mark >=90) {
			System.out.print("Your grade is A");
		}else if (student_mark <=89 && student_mark >=80) {
			System.out.print("Your grade is B");
		}else if (student_mark <=79 && student_mark >=70) {
			System.out.print("Your grade is C");
		}else if (student_mark <=69 && student_mark >=60) {
			System.out.print("Your grade is D");
		}else if (student_mark <=59 && student_mark >=50) {
			System.out.print("Your grade is E");
		}else if (student_mark <50) {
			System.out.print("Your grade is F");
		}else {
			System.out.print("Invalid Input");
		}
	}

}
