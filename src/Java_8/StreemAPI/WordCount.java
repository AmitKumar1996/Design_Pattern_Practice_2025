package Java_8.StreemAPI;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java Stream API is powerful";
        
        long wordCount = Arrays.stream(sentence.split("\\s+"))
            .count();
        
        System.out.println("Word Count: " + wordCount);
    }
}
