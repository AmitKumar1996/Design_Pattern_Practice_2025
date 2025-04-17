package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import Java_8.countOfChar;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		
		String s="aacccababahaaha";
		
		List<Character> list= new ArrayList<>();
		
		for(int i=0; i< s.length();i++) {
			list.add(s.charAt(i));
			
		}
		list.add(null);
	//	System.out.println(list);
		
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(Character c : list) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		//System.out.println(map);   123 4  a b c d
		
		
		
	  //  TreeMap<Character, Long> collect = list.stream().collect(Collectors.groupingBy(data->data, TreeMap :: new, Collectors.counting()));
		Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(data->data,  Collectors.counting()));
	   System.out.println(collect);
		
//		System.out.println(map);
//		
//		Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		System.out.println(collect);

	}

}
