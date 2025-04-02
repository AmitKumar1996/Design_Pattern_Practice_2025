package Java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFreq {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Frequency: " + frequencyMap);
    }
}



/*
Short Notes on Used Java 8 Methods
chars()
Converts a String into an IntStream of ASCII values.
Example: "programming".chars() → [112, 114, 111, 103, 114, 97, 109, 109, 105, 110, 103]

mapToObj(c -> (char) c)
Converts IntStream ASCII values into Stream<Character>.
Example: 112 → 'p', 114 → 'r'

collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
Groups characters and counts occurrences.
Example: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}


 */