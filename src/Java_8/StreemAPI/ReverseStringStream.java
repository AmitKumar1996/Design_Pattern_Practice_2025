package Java_8.StreemAPI;

import java.util.stream.Collectors;

public class ReverseStringStream {
    public static void main(String[] args) {
        String input = "Hello World";

        // Step 1: Convert the string into a stream of characters
        // Step 2: Collect them back into a single string
        // Step 3: Use StringBuilder to reverse the collected string
        String reversed = new StringBuilder(
                input.chars()                                  // IntStream of character codes
                     .mapToObj(c -> String.valueOf((char) c))  // Convert int → char → String
                     .collect(Collectors.joining())            // Join all into one string
        ).reverse().toString();                                // Reverse using StringBuilder

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}


/*
 🔎 Explanation:
input.chars()

Converts the string into an IntStream of Unicode values.

Example: "Hi" → [72, 105].

.mapToObj(c -> String.valueOf((char) c))

Converts each integer (character code) into a String.

Example: [72, 105] → ["H", "i"].

.collect(Collectors.joining())

Joins the stream of strings into a single string.

Example: ["H", "i"] → "Hi".

new StringBuilder(...).reverse().toString()

Wraps the collected string in a StringBuilder, calls .reverse(), and converts it back to a string.
 */