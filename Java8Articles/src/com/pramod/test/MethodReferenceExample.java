package com.pramod.test;

import java.util.Arrays;

public class MethodReferenceExample {

	public static void main(String[] args) {
		String[] words = { "date", "banana", "cherry", "elderberry", "apple" };

		// Using explicit lambda expression for sorting
		//Arrays.sort(words, (a, b) -> a.compareToIgnoreCase(b));

		// Using method reference to sort the array
        Arrays.sort(words, String::compareToIgnoreCase);
        
		for (String string : words) {

			System.out.println(string);
		}
	}
}
