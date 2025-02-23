package javaTask;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListProgram {
	
	//Declare the Arraylist
	static ArrayList<String> myList = new ArrayList();
	
	//Method to add the value in string
	public static void addValue() {
		
		//Adding the value on the arraylist
		myList.add("Chakkaravarthi");
		myList.add("Himanshu");
		myList.add("Guvi");
		myList.add("Zenclass");
		
		//Displaying ArrayList value
		System.out.println("Values on the ArrayList: "+myList);
	}
	
	//Method to remove the value on the array list
	public static void removeValue() {
		
		//Removing the value on the ArrayList
		Scanner input = new Scanner(System.in);
		System.out.println("There are "+myList.size()+" elements available on the list");
		System.out.print("Enter which element need to remove (started from 0): ");
		int element = input.nextInt();
		try {
			myList.remove(element);
			
			System.out.println("After the removing the element "+element+" on the ArrayList");
			System.out.println("The Remaining Arraylist elements are "+myList);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("You're selected the element which is not existed");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling the addValue method
		addValue();
		//Calling the removeValue method
		removeValue();
	}

}
