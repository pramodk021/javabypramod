package com.pramod.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java12FilesMismatch {

	public static void main(String[] args) throws IOException {
		Path filePath1 = Files.createTempFile("file1", ".txt");
		Path filePath2 = Files.createTempFile("file2", ".txt");
		Files.writeString(filePath1, "I love Java");
		Files.writeString(filePath2, "I love Technology");
		long mismatch = Files.mismatch(filePath1, filePath2); // It returns 7

		System.out.println(mismatch);
	}
}
