package javaTask;

import java.util.Scanner;

public class reversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word, reversed_word = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Enter String word: ");
		word = input.next();

		for (int length_of_string = word.length() - 1; length_of_string >= 0; length_of_string--) {
			reversed_word = reversed_word + word.charAt(length_of_string);
		}

		System.out.println("The actual String: " + word);
		System.out.print("The reversed String: " + reversed_word);
	}

}
