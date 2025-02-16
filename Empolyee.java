package javaTask;

import java.util.Scanner;

public class Empolyee {
	
	int id,salary;
	String firstname,lastname,name;
	static Scanner input = new Scanner(System.in);
	
	public void getID(){
		System.out.print("Enter Empolyee ID: ");
		id = input.nextInt();
	}
	
	public void getFirstName(){
		System.out.print("Enter Empolyee First Name: ");
		firstname = input.next();
	}
	public void getLastName(){
		System.out.print("Enter Empolyee Last Name: ");
		lastname = input.next();
	}
	public void getName() {
		name = firstname +" "+ lastname;
	}
	
	public void getSalary() {
		System.out.print("Enter Empolyee Salary: ");
		salary = input.nextInt();
	}
	public void getAnnualSalary() {
		salary=salary*12;
	}
	public void raiseSalary(int percent) {
		salary = salary + (salary*percent/100);
	}
	public void displayEmpolyeeDetails() {
		System.out.print("Empolyee ID: "+id+" Empolyee name: "+name+" Salary: "+salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empolyee obj = new Empolyee();
		obj.getID();
		obj.getFirstName();
		obj.getLastName();
		obj.getName();
		obj.getSalary();
		obj.getAnnualSalary();
		System.out.print("Enter Salary percentage %: ");
		int salary = input.nextInt();
		obj.raiseSalary(salary);
		obj.displayEmpolyeeDetails();
		}

}
