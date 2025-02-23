package javaTask;

public class ArrayAndStringException {
	
	//Method for ArrayIndexOutOfBoundException
	public static void arrayExceptionMethod() {
		
		//Declare the integer type array and define it
		int[] numbersArray = {1,2,3,4,5,6,7};
		
		//try block to display the which index is not existed on the array
		try {
			System.out.println("Try to display the last index's value in array using length method");
			System.out.println("Last value in array: "+ numbersArray[numbersArray.length]);
		} 
		//Catch the ArrayIndexOutOfBound exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The length of the actual array index is "+ ((numbersArray.length)-1));
			System.out.println("But you're called an index which is not existed on the array "+numbersArray.length);
		}
		//printing finally part
		finally {
			System.out.println("==========================================================");
		}
	}
	
	//Method for StringIndexOutOfBoundException
	
	public static void stringExceptionMethod() {
		
		//Declare and define the string value
		String name = "Chakkaravarthi";
		//Try block to displayed the index which is not existed on the string
		try {
			
			System.out.println("The index of string"+name.charAt(name.length()));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You're tring to dislpayed the string index value is not existed on the string");
		}		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling the Array exception method
		System.out.println("The Method for array index exception");
		arrayExceptionMethod();
		//Calling the string exception method
		System.out.println("The method for String index exception");
		stringExceptionMethod();
		
	}

}
