package com.pramod.test;

public class Java12StringIndentandTransform {

	public static void main(String[] args) {
		String original = "Hello\nWorld";
		String indented = original.indent(4);
		System.out.println(indented);
		// Output:
		// Hello
		// World
		
		String original1 = "Hello";
		String transformed = original1.transform(s -> s.toUpperCase());
		System.out.println(transformed); // Output: HELLO
	}
}
