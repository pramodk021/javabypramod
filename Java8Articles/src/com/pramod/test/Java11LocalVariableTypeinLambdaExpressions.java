package com.pramod.test;

import java.util.ArrayList;
import java.util.List;

public class Java11LocalVariableTypeinLambdaExpressions {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		names.forEach((var name) -> {
			  System.out.println("Hello, " + name);
			});
	}
}

