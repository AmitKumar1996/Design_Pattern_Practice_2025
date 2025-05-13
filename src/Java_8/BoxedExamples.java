package Java_8;

import java.util.*;
import java.util.stream.*;

public class BoxedExamples {
    public static void main(String[] args) {
        
        // Example 1: Basic boxed() conversion
        System.out.println("\n--- Example 1: Basic boxed() conversion ---");
        int[] primitiveNumbers = {1, 2, 3, 4, 5};
        
        // Convert IntStream to Stream<Integer> using boxed()
        Stream<Integer> boxedStream = Arrays.stream(primitiveNumbers)
                                          .boxed();
        
        boxedStream.forEach(num -> System.out.println("Number: " + num));
        
        
        // Example 2: Collecting to List
        System.out.println("\n--- Example 2: Collecting to List ---");
        double[] prices = {9.99, 15.50, 22.30};
        
//        List<Double> priceList = Arrays.stream(prices)
//                                     .boxed()  // Convert DoubleStream to Stream<Double>
//                                     .collect(Collectors.toList());
                              Stream<Double> boxed = Arrays.stream(prices).boxed();
                              boxed.forEach(c->System.out.println("Amit"+c));
        
      //  System.out.println("Price List: " + priceList);
        
        
        // Example 3: Using with findFirst()
        System.out.println("\n--- Example 3: Using with findFirst() ---");
        long[] bigNumbers = {100L, 200L, 300L};
        
        Arrays.stream(bigNumbers)
             .boxed()  // Convert LongStream to Stream<Long>
             .findFirst()
             .ifPresent(first -> System.out.println("First number: " + first));
        
        
        // Example 4: Combining with filter
        System.out.println("\n--- Example 4: Combining with filter ---");
        int[] scores = {85, 92, 78, 90, 88};
        
        List<Integer> highScores = Arrays.stream(scores)
                                       .boxed()
                                       .filter(score -> score >= 90)
                                       .collect(Collectors.toList());
        
        System.out.println("High Scores: " + highScores);
        
        
        // Example 5: Performance comparison
        System.out.println("\n--- Example 5: Performance comparison ---");
        int[] largeArray = new int[1000000];
        Arrays.fill(largeArray, 10);
        
        // Without boxed() - faster for primitive operations
        long sumPrimitive = Arrays.stream(largeArray)
                                 .sum();
        
        // With boxed() - slower due to boxing overhead
        long sumBoxed = Arrays.stream(largeArray)
                            .boxed()
                            .mapToInt(Integer::intValue)
                            .sum();
        
        System.out.println("Sum (primitive): " + sumPrimitive);
        System.out.println("Sum (boxed): " + sumBoxed);
    }
}
