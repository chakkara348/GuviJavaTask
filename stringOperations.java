package GuviLearning;

import java.util.Scanner;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word,reversed_word="";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word to check palindrome: ");
		word = input.next();
		
		for(int length_of_string = word.length()-1;length_of_string >=0;length_of_string--) {
			reversed_word = reversed_word + word.charAt(length_of_string);
		}
		if (word.equals(reversed_word)) {
			System.out.print("The palindrome");
		}else {
			System.out.print("Not palindrome");
		}
	}

}
