package abstracT;

import java.util.ArrayList;
import java.util.HashMap;

public class countOfChar {

	public static void main(String[] args) {
		
	//	Given a string, write a function to perform basic string compression using counts of repeated characters. If the compressed string is not shorter than the original string, return the original string.
	//			Example: For "aabcccccaaa", the output should be "a2b1c5a3".
		
		ArrayList<Character> a= new ArrayList<>();
		
		a.add('a');
		a.add('a');
		a.add('a');
		a.add('b');
		a.add('b');
		a.add('c');
		
		System.out.println(a);
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(int i=0;i<a.size();i++) {
			
			if(map.containsKey(a.get(i))) {
				map.put(a.get(i), map.get(a.get(i))+1);
			}
			else {
				map.put(a.get(i), 	1);
			}
		}
		
		System.out.println(map);
		
		

	}

}
