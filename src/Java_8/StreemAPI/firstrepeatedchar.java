package Java_8.StreemAPI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstrepeatedchar {
    public static void main(String[] args) {
        String a = "Java as a programming language";

        // Step 1: Convert the string into a stream of characters
        Optional<Character> firstRepeated = a.chars() // gives IntStream of char codes
            .mapToObj(c -> (char) c) // convert each int to char -> Stream<Character>
            
            // Step 2: Collect into a LinkedHashMap where:
            // key = character, value = count of occurrences
            .collect(Collectors.groupingBy(
                Function.identity(),           // group by the character itself
                LinkedHashMap::new,            // maintain insertion order
                Collectors.counting()          // count occurrences
            ))
            
            // Step 3: Convert the map to a stream of entries
            .entrySet().stream()
            
            // Step 4: Filter out entries that occur more than once (i.e., repeated)
            .filter(entry -> entry.getValue() > 1)
            
            // Step 5: Take the key (character) of the first repeated entry
            .map(Map.Entry::getKey)
            
            // Step 6: Return the first match as Optional<Character>
            .findFirst();

        // Step 7: Output the result
        if (firstRepeated.isPresent()) {
            System.out.println(firstRepeated.get() + " is the First Repeated Character");
        } else {
            System.out.println("No repeated character found.");
        }
    }
}
