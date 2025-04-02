package Java_8;

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
