package Java_8.StreemAPI;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Part 1: Initial list
        List<String> list = Arrays.asList("I", "am", "Amit");
        list.forEach(System.out::println);  // Output: I am Amit

        System.out.println("I am an Engineer\n");

        // Part 2: Count word frequency in a sentence
        String s = "I am going to office, I will be coming back from office from evening";
        String[] arr = s.split("[ ,]+");  // split by space and comma

        HashMap<String, Integer> map = new HashMap<>();

        for (String temp : arr) {
            temp = temp.trim();
            if (!temp.isEmpty()) {
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        System.out.println("Words with frequency > 1:");
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                System.out.println(m.getKey() + " -> " + m.getValue());
            }
        }

        // Part 3: Even and Odd filter
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> evenList = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddList = numbers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("\nEven Numbers: " + evenList);
        System.out.println("Odd Numbers: " + oddList);
    }
}
