package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private static Map<Integer, Long> memory = new HashMap<>();
    public static long fibonacci (int n) {
        if (n <= 1 ) {
            return n;
        }
        if (memory.containsKey(n)) {
            return memory.get(n);
        }
        long fib = fibonacci(n-1) + fibonacci(n-2);
        memory.put(n, fib);
        return fib;
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
