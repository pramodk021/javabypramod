package com.pramod.test;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        System.out.println("========= Start ====================");
        print();
        System.out.println("=========== End ====================");
    }

    public static void print() {
        // Traditional approach using an anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world!");
            }
        };
        runnable.run();  // Ensure that the runnable is actually run

        // Using lambda expression
        Runnable lambdaRunnable = () -> {
            System.out.println("Hello, world!");
        };
        lambdaRunnable.run();  // Ensure that the lambda runnable is actually run
    }
}
