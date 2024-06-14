package com.pramod.test;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Java21VirtualThread {

//	public static void main(String[] args) {
//		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
//			IntStream.range(0, 500_000).forEach(i -> {
//				executor.submit(() -> {
//					Thread.sleep(Duration.ofSeconds(1));
//					return i;
//				});
//			});
//		} // executor.close() is called implicitly, and waits
//	}

}
