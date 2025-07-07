//package abstracT;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class start_with_digit_1 {
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 15, 16, 21, 31, 123);
//
//        // Filter numbers that start with digit '1'
//        List<Integer> newList = list.stream()
//            .filter(i -> String.valueOf(i).startsWith("1"))
//            .collect(Collectors.toList());
//
//        System.out.println("Numbers starting with 1: " + newList);
//    }
//}



package demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.*;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
}

@FunctionalInterface
interface StringOperation {
    String apply(String str);
}

public class start_with_digit_1 {
    public static void main(String[] args) {

        // 1️⃣ Filter numbers starting with digit '1'
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 15, 16, 21, 31, 123);
        List<Integer> newList = list.stream()
            .filter(i -> String.valueOf(i).startsWith("1"))
            .collect(Collectors.toList());
        System.out.println("1️⃣ Numbers starting with 1: " + newList);

        // 2️⃣ Reverse a String
        String str = "Interview";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("2️⃣ Reversed string: " + reversed);

        // 3️⃣ Find the square of even numbers
        List<Integer> squares = list.stream()
            .filter(i -> i % 2 == 0)
            .map(i -> i * i)
            .collect(Collectors.toList());
        System.out.println("3️⃣ Squares of even numbers: " + squares);

        // 4️⃣ Count frequency of characters in a string
        String word = "banana";
        Map<Character, Long> freq = word.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("4️⃣ Character frequency in 'banana': " + freq);

        // 5️⃣ Use Abstract class: Area of circle
        Shape circle = new Circle(5);
        System.out.println("5️⃣ Area of Circle: " + circle.area());

        // 6️⃣ Functional Interface with Lambda
        StringOperation upperCaseOp = s -> s.toUpperCase();
        System.out.println("6️⃣ Functional Interface result: " + upperCaseOp.apply("java"));

        // 7️⃣ Remove duplicates from list
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("7️⃣ Distinct list: " + distinct);

        // 8️⃣ Find max value
        int max = list.stream().max(Integer::compare).orElse(-1);
        System.out.println("8️⃣ Max value: " + max);

        // 9️⃣ Join strings with delimiter
        List<String> names = Arrays.asList("Amit", "Neha", "Rahul");
        String joined = String.join(", ", names);
        System.out.println("9️⃣ Joined string: " + joined);

        // 🔟 Check if any number > 100
        boolean anyMatch = list.stream().anyMatch(i -> i > 100);
        System.out.println("🔟 Any number > 100: " + anyMatch);

        // 1️⃣1️⃣ Sort strings alphabetically
        List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println("1️⃣1️⃣ Sorted names: " + sorted);

        // 1️⃣2️⃣ Convert List<Integer> to comma-separated String
        String commaStr = list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(", "));
        System.out.println("1️⃣2️⃣ List as comma-separated string: " + commaStr);

        // 1️⃣3️⃣ Filter out null values
        List<String> nameList = Arrays.asList("Amit", null, "Ravi", null, "Neha");
        List<String> filtered = nameList.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
        System.out.println("1️⃣3️⃣ After removing nulls: " + filtered);

        // 1️⃣4️⃣ Count words in a sentence
        String sentence = "Java is a powerful language";
        long wordCount = Arrays.stream(sentence.split(" ")).count();
        System.out.println("1️⃣4️⃣ Word count: " + wordCount);
        
        // 1️⃣4️⃣ Count words in a sentence
        String sentence1 = "Java is a powerful language";
        long wordCount1 = Arrays.stream(sentence1.split(" ")).count();
        System.out.println("1️⃣4️⃣ Word count: " + wordCount1);

        // 1️⃣5️⃣ Group words by length
        List<String> words = Arrays.asList("Java", "is", "awesome", "and", "fun");
        Map<Integer, List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("1️⃣5️⃣ Words grouped by length: " + grouped);
    }
}
