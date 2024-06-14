package com.pramod.test;

public interface MyInterface {
	default void publicMethod() {
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("Private method in interface.");
	}
}