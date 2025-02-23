package javaTask;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	
	//Declare the List
	static List<Integer> myList = new ArrayList();
	
	//Method for Add and display the value on List
	public static void addValueOnList() {
		
		myList.add(3);
		myList.add(1);
		myList.add(5);
		
		System.out.println("The List : "+ myList);
	}
	
	//Method for list into Array
	public static void changeListToArray() {
		int[] array = new int[myList.size()];
		
		for (int index=0;index<myList.size();index++) {
			int value = myList.get(index);
			array[index]=value;
		}
		
		for (int index=0;index<array.length;index++) {
			System.out.println("The Array value of an index: "+index+" is "+array[index]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addValueOnList();
		changeListToArray();

	}

}
