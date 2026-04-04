package abstracT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the max occurrence of chars in the string "apple"

public class main123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="applea";

		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				if(map.get(c)>1) {}
				//System.out.println(c);
			}
			else {
				map.put(c, 1);
			}
		}
		
	  char r= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap :: new, Collectors.counting()))
	.entrySet().stream()
	.max(Map.Entry.comparingByValue()).get().getKey();
	  System.out.println(r);
	  
	         //LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		//System.out.println(map);
		
		
		//for (Map<Character, Integer> m: map) {
			
		//}
		
		/*
		map.put('a', 1);
		System.out.println(map.get('a'));
		map.put('a', 1);
		System.out.println(map.v);
		*/
	}

}
