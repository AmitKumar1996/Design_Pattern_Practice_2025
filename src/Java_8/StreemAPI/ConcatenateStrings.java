package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        
//        String result = words.stream().collect(Collectors.joining(" "));
//
//        System.out.println("Concatenated String: " + result);
    	
    	List<String> asList = Arrays.asList("Java", "is", "Programing", "Language");
    	
    	List<Integer> asList2 = Arrays.asList(1,2,3,4,5,6,7,8,6,7,9,11);
    	
    	
    	String collect = asList.stream().collect(Collectors.joining(" "));
    	
    	
    	System.out.println(collect);
    	
    	
    	Optional<Integer> first = asList2.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    	System.out.println(first.get());
    	
    	 List<String> list1 = Arrays.asList("apple", "orange", "berry","kiwi","berry", "blueberry");
         
	        List<String> newList1 = list1.stream()
	                .map(str -> str.toUpperCase())           // Convert to uppercase
	                .filter(i -> i.startsWith("B"))     // Filter strings that start with "B"
	                .collect(Collectors.toList());      // Collect to a list            
      System.out.println("2--->"+newList1);
      
      
      
      
      
      
      
    }
}
