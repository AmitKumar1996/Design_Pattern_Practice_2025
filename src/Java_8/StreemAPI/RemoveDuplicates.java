package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10);

        List<Integer> uniqueNumbers = numbers.stream()
            .distinct()
            .collect(Collectors.toList());
        Optional<Integer> first = numbers.stream().distinct().sorted((s1,s2)->-s1.compareTo(s2)).skip(1).findFirst();
        if(first.isPresent()) {
        System.out.println(first.get());
        }
        else {
        	System.out.println("Second Max is not Possible");
        }
        
        

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}

