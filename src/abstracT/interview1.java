package abstracT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="swiss chocolrrate";
		
		char[] array=str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
	     LinkedHashMap<Character, Long> Map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()));
	     
	     System.out.println("LinkedHashMap"+Map);
	     
	     
	     
	    
	     
		
		for(int i=0;i<array.length;i++) {
			if(hm.containsKey(array[i])) {
				hm.put(array[i], hm.get(array[i])+1);
			}
			else {
				hm.put(array[i], 1);
			}
		}
		//System.out.println(hm);
	 HashSet<Character> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			if(hm.get(array[i])>1) {
				set.add(array[i]);
			
			}
		}
		//System.out.println(set);
		
		for(Character Strin:set) {
		System.out.println(Strin+"->"+hm.get(Strin));	
			
		}

	}

}
