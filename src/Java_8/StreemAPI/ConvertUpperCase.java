package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amit", "kumar", "java");
        
        List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}
