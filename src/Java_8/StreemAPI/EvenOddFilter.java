package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.Collectors;

public class EvenOddFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
