package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class isPalandrome {

	public static void main(String[] args) {
		
		
		  String str = "My favourite color is green ";

	        String[] words = str.split(" ");

	        String longestWord = Arrays.stream(words)
	            .filter(word -> !word.isEmpty()) // skip empty words
	            .max((w1, w2) -> Integer.compare(w1.length(), w2.length()))
	            .orElse(""); // if no word found

	        System.out.println("Longest word: " + longestWord);
	        System.out.println("Length: " + longestWord.length());
		
	        List<String> list1 = Arrays.asList("a", "b", "c");
	        List<String> list2 = Arrays.asList("x", "y", "z");
	        List<Integer> list3 = Arrays.asList(1, 2, 3);

	        List<String> list4 = list2.stream()
	            .flatMap(l2 -> list3.stream()
	                .flatMap(l3 -> list1.stream()
	                    .map(l1 -> l2 + l3 + l1)))
	            .collect(Collectors.toList());

	        System.out.println(list4);

	}

}
