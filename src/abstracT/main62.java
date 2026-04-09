package abstracT;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class main62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdcdd";
		
     Map<Character , Integer> newMap= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy( Function.identity(), LinkedHashMap :: new ,Collectors.counting()));

	
	}

}
