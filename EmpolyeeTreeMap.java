package javaTask;

import java.util.TreeMap;

public class EmpolyeeTreeMap {
	
	//Declare the tree map
	static TreeMap<String,Integer> myEmployeeMap = new TreeMap();
	
	//Method to TreeMap employee details
	public static void addEmployeeValue() {
		//Adding the value on the treeMap
		myEmployeeMap.put("Chakkaravarthi",23);
		myEmployeeMap.put("Himanshu",34);
		myEmployeeMap.put("Fadil", 20);
		myEmployeeMap.put("Anitha",56);
	}

	//Method to display the empolyeeName in alphabets order
	public static void displayEmployeeName() {
		
		//Displaying the actual TreeMap value
		System.out.println("The Actual TreeMap value: "+ myEmployeeMap);
		
		//Display the empolyeeName only
		System.out.println("The EmployeeName : " + myEmployeeMap.sequencedKeySet());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling the add Employee value method
		addEmployeeValue();
		//Calling the display Employee Name method
		displayEmployeeName();
	}

}
