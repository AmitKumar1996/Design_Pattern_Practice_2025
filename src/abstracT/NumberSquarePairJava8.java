package abstracT;
import java.util.*;
import java.util.stream.Collectors;
import java.util.AbstractMap.SimpleEntry;

public class NumberSquarePairJava8 {
    public static void main(String[] args) {
        // Input list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Stream to map number -> (number, number^2)
        List<SimpleEntry<Integer, Integer>> result = numbers.stream()
            .map(num -> new SimpleEntry<>(num, num * num))
            .collect(Collectors.toList());

        // Printing the result
        result.forEach(entry -> System.out.println("Pair<" + entry.getKey() + "," + entry.getValue() + ">"));
    }
}
