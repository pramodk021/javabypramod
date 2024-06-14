package com.pramod.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

		// Using Stream API to filter and transform elements
		List<String> result = fruits.stream().filter(fruit -> fruit.length() > 5).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result); // Output: [BANANA, ORANGE]
	}
}
