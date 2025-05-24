package abstracT;

import java.util.*;
import java.util.Map.Entry;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DailyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="amit kumar";
		String replace = str.replace(" ", "");
		
		
		Map<Character, Long> collect1 = replace.chars().mapToObj(c->(char)c)
				.collect(Collectors
						.groupingBy(Function.identity(),
								Collectors.counting() ));
		
		
		System.out.println(collect1);
		
		for(Entry<Character, Long> m: collect1.entrySet())
	       
		
		System.out.println(replace);

	}

}
