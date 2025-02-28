package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import abstracT.countOfChar;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		
		String s="aaababahaaha";
		
		List<Character> list= new ArrayList<>();
		
		for(int i=0; i< s.length();i++) {
			list.add(s.charAt(i));
			
		}
		System.out.println(list);
		
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(Character c : list) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(collect);

	}

}
