package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 20, 40, 50);

        List<Integer> uniqueNumbers = numbers.stream()
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}

