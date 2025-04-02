package Java_8;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java 8 streams are very useful in programming";

        /* Split sentence into words, find the longest word using max() */
        String longestWord = Arrays.stream(sentence.split(" ")) // Convert sentence into words
                .max(Comparator.comparingInt(String::length)) // Compare words by length
                .orElse(null); // Return null if no word found

        System.out.println("Longest Word: " + longestWord);
    }
}



/*
Short Notes on Used Java 8 Methods:
split(" ")

Splits a sentence into an array of words.

Example: "Java 8 streams are" → ["Java", "8", "streams", "are"]

Arrays.stream()

Converts an array into a Stream for processing.

Example: ["Java", "8", "streams"] → Stream<String>

max(Comparator.comparingInt(String::length))

Finds the longest word based on length.

Example: ["Java", "streams"] → "streams"

orElse(null)

If no words are found, return null instead of throwing an error.

This Java 8 example helps you practice working with Streams, Comparators, and functional programming. 🚀







 */