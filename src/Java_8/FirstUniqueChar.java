package Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueChar {
    public static void main(String[] args) {
    	
    	// Part-1---------------------------------------------------------------------------------------------------
    	
    	
        String str = "Opposition";

        Map<Character, Long> frequencyMap = str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> result = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        
  //      System.out.println(result.get());
        result.ifPresent(System.out::println);  // Output: s
        
    	// Part-2---------------------------------------------------------------------------------------------------

        
        List<Integer> numbers = Arrays.asList(1, 2, 11, 21, 31, 42, 56, 23, 16);
        List<Integer> result1 = numbers.stream()
                .filter(i -> Integer.toString(i).charAt(0) == '1')
                .collect(Collectors.toList());

        System.out.println(result1);
        
        
        
    	// Part-3---------------------------------------------------------------------------------------------------

        
        /*
         
         ✅ 2. Optional Handling in Java 8
🔹 Template:
java
Copy
Edit
Optional<SecondHighest> user = employeeRepository.findById(123L);

user.ifPresentOrElse(
    emp -> System.out.println("SecondHighest found: " + emp),
    () -> System.out.println("SecondHighest not found")
);
✅ Note: ifPresentOrElse() is available in Java 9 and above.
If using Java 8, use:


if (user.isPresent()) {
    System.out.println("SecondHighest found: " + user.get());
} else {
    System.out.println("SecondHighest not found");
}

         
         
         * */

    }
}
