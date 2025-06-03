package string;

import java.util.LinkedHashSet;
import java.util.Set;

// ✅ Approach 1: Using LinkedHashSet to maintain order

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Amit kumar";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println("Unique characters: " + result);
    }
}
