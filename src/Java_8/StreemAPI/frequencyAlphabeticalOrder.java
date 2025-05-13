package Java_8.StreemAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class frequencyAlphabeticalOrder {

    public static void main(String[] args) {
        String input = "crocodile";

        // Step 1: Convert the input string into a stream of characters
        // input.chars() gives an IntStream of character codes
        // mapToObj(c -> (char) c) converts it to Stream<Character>
        Map<Character, Long> collect = input.chars()
            .mapToObj(c -> (char) c)

            // Step 2: Group the characters and count their occurrences
            // Function.identity() means group by the character itself
            // Collectors.counting() counts how many times each character appears
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

            // Step 3: Convert the resulting map to entrySet, then stream it for sorting
            .entrySet().stream()

            // Step 4: Sort the map entries by key (character) in alphabetical order
            .sorted(Map.Entry.comparingByKey())

            // Step 5: Collect the sorted entries into a new LinkedHashMap to preserve order
            .collect(Collectors.toMap(
                Map.Entry::getKey,         // key mapper
                Map.Entry::getValue,       // value mapper
                (e1, e2) -> e1,            // merge function (not used here)
                LinkedHashMap::new         // supplier to create ordered map
            ));

        // Step 6: Print the sorted frequency map
        System.out.println(collect);
    }
}
