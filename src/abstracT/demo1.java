package abstracT;

import java.util.*;

public class demo1 {

    public static void main(String[] args) {
        String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

        // Map to hold sorted character string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : arr) {
            // Remove any trailing spaces and convert to char array
            char[] chars = str.trim().toCharArray();
            Arrays.sort(chars); // Sort the characters
            String key = new String(chars); // Create the key

            // Add to the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str.trim());
        }

        // Print only those entries which have more than 1 anagram
        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                System.out.println(group + " contains same characters");
            }
        }
    }
}
