package Java_8;

import java.util.Arrays;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java 8 is powerful";

        /* 
         * Split sentence into words, reverse each word using StringBuilder, and join back 
         */
        String reversedSentence = Arrays.stream(sentence.split(" ")) 
                /* 
                 * split(" ") → Splits the sentence into words based on spaces.
                 * Example: "Java 8 is powerful" → ["Java", "8", "is", "powerful"]
                 */
                .map(word -> new StringBuilder(word).reverse().toString()) 
                /* 
                 * map() → Transforms each word by applying a function.
                 * new StringBuilder(word).reverse().toString() → Reverses each word.
                 * Example: "Java" → "avaJ", "powerful" → "lufrewop"
                 */
                .collect(Collectors.joining(" ")); 
                /* 
                 * collect(Collectors.joining(" ")) → Joins all transformed words into a sentence.
                 * Example: ["avaJ", "8", "si", "lufrewop"] → "avaJ 8 si lufrewop"
                 */

        System.out.println("Reversed Words: " + reversedSentence);
    }
}




/*
Short Notes on Used Java 8 Methods:
split(" ")

Splits a sentence into an array of words.

Example: "Java 8 is powerful" → ["Java", "8", "is", "powerful"]

Arrays.stream()

Converts an array into a Stream for processing.

Example: ["Java", "8", "is"] → Stream<String>

map(word -> new StringBuilder(word).reverse().toString())

Transforms each word by reversing it.

Example: "Java" → "avaJ"

collect(Collectors.joining(" "))

Joins the reversed words back into a sentence.

Example: ["avaJ", "8", "si", "lufrewop"] → "avaJ 8 si lufrewop"

This Java 8 example helps you practice Streams, map(), and String manipulation using StringBuilder. 🚀
 */