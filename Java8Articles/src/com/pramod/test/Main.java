package com.pramod.test;

class Person implements Greeting {
	// No need to override the default greet() method
}

class myClass implements MyInterface{
	
}

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.greet(); // Will use the default method implementation
		
		myClass class1=new myClass();
		class1.publicMethod();
	}
}