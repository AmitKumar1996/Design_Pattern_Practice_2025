package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "java stream api";
        
        
        Map<Character, Long> frequencyMap = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(frequencyMap);
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
         Map<Character, Long> collect = s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
         
         System.out.println(collect+"--->");
         
         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

         
         Map<Character, Long> collect2 = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
         
         System.out.println(collect2);
    }
}
