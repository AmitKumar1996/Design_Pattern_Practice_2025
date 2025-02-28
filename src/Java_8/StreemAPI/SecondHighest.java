package Java_8.StreemAPI;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 9, 2, 1, 9, 5);
        
        int secondHighest = numbers.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No second highest element"));
        
        System.out.println("Second Highest Number: " + secondHighest);
    }
}
