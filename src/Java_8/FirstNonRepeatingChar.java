package Java_8;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        /* Convert the string into a stream of characters and find the first non-repeating character */
        Character result = str.chars() 
                .mapToObj(c -> (char) c) // Convert ASCII to Character
                .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new)) // Count occurrences
                .entrySet().stream() // Convert map to stream of entries
                .filter(entry -> entry.getValue() == 1) // Filter characters that appear once
                .map(Map.Entry::getKey) // Extract the key (character)
                .findFirst() // Get the first unique character
                .orElse(null); // Return null if no unique character is found

        System.out.println("First Non-Repeating Character: " + result);
    }
}





/*
Short Notes on Used Java 8 Methods
chars()
Converts a String into an IntStream of character ASCII values.
Example: "swiss".chars() → [115, 119, 105, 115, 115]

mapToObj(c -> (char) c)
Converts IntStream ASCII values into Stream<Character>.
Example: 115 → 's', 119 → 'w'

collect(LinkedHashMap::new, (map, c) -> map.put(c, map.getOrDefault(c, 0) + 1), Map::putAll)

Groups characters with their frequency count while preserving order.
Example: {s=3, w=1, i=1}

entrySet().stream()
Converts the Map into a Stream<Map.Entry<Character, Integer>>.
Example: {s=3, w=1, i=1} → [s=3, w=1, i=1]

filter(entry -> entry.getValue() == 1)
Filters only non-repeating characters.
Example: {s=3, w=1, i=1} → [w=1, i=1]

findFirst().orElse(null)
Finds the first non-repeating character or returns null.
Example: w=1 → 'w'
 */