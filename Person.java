package javaTask;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	
	Person() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = input.next();
		System.out.print("Enter Age: ");
		age = input.nextInt();
	}
	
	public void getter() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Obj = new Person();
		Obj.getter();
	}

}
