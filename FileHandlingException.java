package javaTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHandlingException {
	
	//Method for read a value from file using property
	public static void readValueFromFile() throws IOException {
		
		//using fileinputstream read a file name.txt which is not on the system
		FileInputStream file = new FileInputStream("name.txt");
		//using read method to check file have data on it
		int isValueOnFile = file.read();
		//Checking the file have data or not
		if (isValueOnFile != -1) {
			System.out.println("File have data on it");
		}else {
			System.out.println("The file don't have data");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			readValueFromFile();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("The file is not found " + e);
		}
	}

}
