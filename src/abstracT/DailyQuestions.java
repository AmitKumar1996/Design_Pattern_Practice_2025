package abstracT;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DailyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="amit kumar";
		 str = str.replace(" ", "");
		
	Map<Character, Long>frequecncyMap=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	for(Map.Entry<Character, Long> i: frequecncyMap.entrySet()) {

		System.out.println(i.getKey()+"->"+i.getValue());
		
	}
			
		int arr[]= {1,2,3,4,5};
	Optional<Integer> secondhighest=	Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	
	System.err.println(secondhighest.get());
		

	}

}
