package org.example;

public class FibonacciRecursive {
    public static long fibonacci (int n) {
        if (n <= 1 ) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 6;
        long result = fibonacci(n);
        System.out.println(("Fibonacci (" + n + ") = " + result));
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("TIME: " + time);
    }
}
