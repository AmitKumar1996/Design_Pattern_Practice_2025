package Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        Set<String> duplicates = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate Elements: " + duplicates);
 
    }
    }
/*
 Short Notes on Used Java 8 Methods
stream()
Creates a Stream from a List.
Example: List<String> → Stream<String>

collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
Counts occurrences of each element.
Example: {apple=2, banana=2, orange=1, grape=1}

entrySet().stream()
Converts Map into a Stream<Map.Entry<String, Long>>.
Example: {apple=2, banana=2, orange=1, grape=1} → [apple=2, banana=2]

filter(entry -> entry.getValue() > 1)
Filters only duplicate elements.
Example: [apple=2, banana=2]

map(Map.Entry::getKey)
Extracts only the duplicate elements.
Example: [apple, banana]

collect(Collectors.toSet())
Collects the result into a Set.
Example: {apple, banana}
 */