package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.Collectors;

public class AllInOneJavaExamples {
    public static void main(String[] args) {

        // 1. Word Frequency Counter
        String s = "I am going to office, I will be coming back from office from evening";
        String[] arr = s.replace(",", "").split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : arr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("\n--- Word Frequency (Count > 1) ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        // 2. Filter Even and Odd Numbers
        List<Integer> numbers = Arrays.asList(1, 4, 5, 6, 7, 8, 11);

        List<Integer> evenList = numbers.stream()
            .filter(i -> i % 2 == 0)
            .collect(Collectors.toList());

        List<Integer> oddList = numbers.stream()
            .filter(i -> i % 2 != 0)
            .collect(Collectors.toList());

        System.out.println("\n--- Even Numbers ---\n" + evenList);
        System.out.println("--- Odd Numbers ---\n" + oddList);

        // 3. List<String> from words
        List<String> wordList = Arrays.asList("I", "am", "Amit");
        System.out.println("\n--- Word List ---\n" + wordList);

        // 4. Candidate Info Template
        String template = """
        \n--- Candidate Info ---
        Full Name: Amit Kumar
        Total Experience: 5+ years
        Relevant Experience: 5 years
        Current Location: Bangalore
        Current CTC: 17.5 LPA
        Expected CTC: 22 LPA
        Notice Period: 30 days
        Reason for Job Change: Looking for better growth and learning opportunities.
        """;

        System.out.println(template);
    }
} 
