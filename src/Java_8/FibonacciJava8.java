package Java_8;

import java.util.stream.Stream;

public class FibonacciJava8 {

    public static void main(String[] args) {
        int n = 10; // Find the 10th Fibonacci number

        // Get nth Fibonacci number using Java 8 Stream
        int result = Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]}) // Generate Fibonacci pairs
                .limit(n) // Limit to n terms
                .map(fib -> fib[0]) // Get the first element of each pair
                .skip(n - 1) // Skip to the nth element
                .findFirst() // Get the nth Fibonacci number
                .orElse(0); // Default to 0 if empty

        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
