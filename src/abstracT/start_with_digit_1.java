package abstracT;

import java.util.*;
import java.util.stream.Collectors;

public class start_with_digit_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 15, 16, 21, 31, 123);

        // Filter numbers that start with digit '1'
        List<Integer> newList = list.stream()
            .filter(i -> String.valueOf(i).startsWith("1"))
            .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + newList);
    }
}
