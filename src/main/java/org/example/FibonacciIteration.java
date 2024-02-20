package org.example;

public class FibonacciIteration {
    public static long fibonacci (int n) {
        if (n <=1) {
            return n;
        }
        long fib1 = 1;
        long fib2 = 1;
        long fib3 = 1;
        for (int i = 3; i <= n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;

        }
        return fib3;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 2;
        long result = fibonacci(n);
        System.out.println(("Fibonacci (" + n + ") = " + result));
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("TIME: " + time);
    }
}
