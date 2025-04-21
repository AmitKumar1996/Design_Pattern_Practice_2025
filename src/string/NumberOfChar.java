package string;

import java.util.*;

public class NumberOfChar {
    public static void main(String[] args) {
        String s = "abcaaa abbbd  e fghijk";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') { // skip spaces
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character frequency map:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


/*
 package string;

import java.util.*;

public class NumberOfChar {
    public static void main(String[] args) {
        String s = "abcaaa   abbbd     e  fghijk"; // multiple spaces included

        // Remove all types of whitespace (spaces, tabs, newlines, etc.)
        s = s.replaceAll("\\s+", "");

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequency map:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

 * */
 
 
 
 
 
 
 
 /*
  * 
  * 
  
  
  
  
  package string;

import java.util.*;
import java.util.stream.*;

public class NumberOfChar {
    public static void main(String[] args) {
        String s = "abcaaa   abbbd     e  fghijk";

        // Remove all whitespaces
        s = s.replaceAll("\\s+", "");

        // Count character frequencies using Java 8 streams
        Map<Character, Long> freqMap = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                c -> c,
                Collectors.counting()
            ));

        // Print the frequency map
        freqMap.forEach((ch, count) -> 
            System.out.println(ch + " = " + count)
        );
    }
}

  
  * 
  * /*
  */