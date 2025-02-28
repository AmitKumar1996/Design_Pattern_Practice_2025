package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        
        String result = words.stream().collect(Collectors.joining(" "));

        System.out.println("Concatenated String: " + result);
    }
}
