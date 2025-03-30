package Java_8;

import java.util.*;
import java.util.stream.*;

/**
 * This class demonstrates the use of findFirst() method in Java 8 Streams.
 * It shows how to get the first element from both List and Array collections.
 */
public class FindFirstElement {
    public static void main(String args[]) {
        
        // =====================================================================
        // Example 1: Using findFirst() with a List
        // =====================================================================
        
        // Create a list of integers
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        
        // Stream pipeline:
        // 1. Convert List to Stream
        // 2. findFirst() returns Optional containing first element
        // 3. ifPresent() checks if Optional has value and prints it
        myList.stream()
              .findFirst()
              .ifPresent(System.out::println); // Output: 10
        
        // =====================================================================
        // Example 2: Using findFirst() with an Array
        // =====================================================================
        
        // Create an array of primitive ints
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        
        // Stream pipeline:
        // 1. Arrays.stream() creates IntStream from array
        // 2. boxed() converts primitive ints to Integer objects
        // 3. findFirst() gets first element
        // 4. ifPresent() prints the value if exists
        Arrays.stream(arr)
              .boxed()
              .findFirst()
              .ifPresent(System.out::print); // Output: 10
    }
}

// =============================================================================
// Key Takeaways:
// =============================================================================
// 1. findFirst() is a terminal operation that returns an Optional of the first element
// 2. It works with both collections (List) and arrays
// 3. For primitive arrays, we need to use boxed() to convert to object stream
// 4. ifPresent() is used to safely handle the Optional result
// 5. This is particularly useful when you only need the first element of a stream
//
// Future Use Cases:
// 1. Getting default/initial values from collections
// 2. Validation of non-empty collections
// 3. Pipeline optimization when you only need one element
// 4. Working with parallel streams while maintaining order
// =============================================================================