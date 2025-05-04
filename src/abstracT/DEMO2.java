package abstracT;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Java_8.MargeArrayAndFindMedian;

public class DEMO2 {

    public static void main(String[] args) {

        int[] A = {1, 2, 2, 4, 5};
        int[] B = {4, 4, 4, 4, 10};
          
        
        
         
//
//        // Combine both arrays into one list using streams
//        List<Integer> combinedList = IntStream.concat(Arrays.stream(A), Arrays.stream(B))
//                                              .boxed()
//                                              .collect(Collectors.toList());
//
//        // Count frequency of each number
//        Map<Integer, Long> frequencyMap = combinedList.stream()
//            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        // Find the number with maximum frequency
//        Optional<Map.Entry<Integer, Long>> maxEntry = frequencyMap.entrySet()
//            .stream()
//            .max(Map.Entry.comparingByValue());
//
//        // Output result
//        maxEntry.ifPresent(entry -> 
//            System.out.println("Most frequent number: " + entry.getKey() + " (Count: " + entry.getValue() + ")"));
    }
}
