package com.pramod.test;

interface Greeting {
	// A default method in the interface
	default void greet() {
		System.out.println("Hello, from the interface!");
	}
}