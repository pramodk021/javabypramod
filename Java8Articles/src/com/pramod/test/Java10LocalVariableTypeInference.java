package com.pramod.test;

public class Java10LocalVariableTypeInference {
	public static void main(String[] args) {
		var name = "John Doe"; // Infers String type
		var age = 30; // Infers int type
		var salary = 50000.0; // Infers double type

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		// Compile-time error: var must be initialized
		// var uninitializedVar;
	}
}
