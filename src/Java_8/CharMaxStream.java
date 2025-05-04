package Java_8;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharMaxStream {
    public static void main(String[] args) {
        String str = "hello"; // Expected output: 'l'

        char maxChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Most frequent character: " + maxChar);
        
        
 
    }
}




//public class CharMax {
//    public static void main(String[] args) {
//        String str = "hello";  // Expected output: 'l'
//
//        char maxChar = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Comparator.comparingLong(Map.Entry::getValue))
//                .get()
//                .getKey();
//
//        System.out.println(maxChar);
//    }
//}

/*
Short Notes on Used Java 8 Methods
1. chars()
Converts a String into an IntStream of character ASCII values.

Example: "hello".chars() → [104, 101, 108, 108, 111]

2. mapToObj(c -> (char) c)
Converts the IntStream (ASCII values) into a Stream<Character>.

Example: 104 → 'h', 101 → 'e'

3. collect(Collectors.groupingBy(c -> c, Collectors.counting()))
Groups elements by character and counts occurrences.

Returns a Map<Character, Long>.

Example: {h=1, e=1, l=2, o=1}

4. entrySet()
Converts the Map into a Set of key-value pairs.

Example: {h=1, e=1, l=2, o=1} → [h=1, e=1, l=2, o=1]

5. stream()
Creates a stream from the set of key-value pairs.

Example: Set<Map.Entry<Character, Long>> → Stream<Map.Entry<Character, Long>>

6. max(Comparator.comparingLong(Map.Entry::getValue))
Finds the entry with the maximum value (most frequent character).

Example: {h=1, e=1, l=2, o=1} → l=2

7. get()
Retrieves the value from the optional result of max().

8. getKey()
Extracts the character (key) from the maximum entry.

Example: l=2 → 'l'

Summary
These methods together convert a string into a character frequency map and find the most frequent character in a clean and efficient way using Java 8 Streams API. 🚀


*/