package Java_8;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighest {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 30, 25};

        OptionalInt secondHighest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst();

        System.out.println("Second Highest Number: " + secondHighest.orElse(-1));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

        
        OptionalInt first = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst();
        
        if(first.isPresent()) {
        	System.out.println(first.getAsInt());
        }else {
        	System.out.println("Not present ");
        }
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

        
        
    }
}


/**
Short Notes on Used Java 8 Methods
stream()
Converts an int[] into an IntStream.
Example: [10, 5, 20, 15, 30, 25] → Stream<Integer>

distinct()
Removes duplicate values.
Example: [10, 5, 20, 15, 30, 25] → [10, 5, 20, 15, 30, 25] (no duplicates here)

sorted()
Sorts elements in ascending order.
Example: [5, 10, 15, 20, 25, 30]

skip(numbers.length - 2)
Skips to the second last element.
Example: skip(4) → [25]

findFirst()
Gets the first element from the filtered stream.
Example: 25

orElse(-1)
Returns -1 if no second-highest number is found.
Example: 25
 */