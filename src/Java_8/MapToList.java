package Java_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map= new HashMap<>();
		
		map.put(1, "Amit");
		map.put(2, "kumar");
		map.put(3, "yadav");
	
		
		List<Integer> listKey= new ArrayList<>();
		
		List<String> listString= new ArrayList<>();
		
	listKey=	map.keySet().stream().collect(Collectors.toList());
	
	for(Integer i: listKey) {
		System.out.println(i);
	}
	
	System.out.println("*--------------------------------------*");
listString	 =map.values().stream().collect(Collectors.toList());
		
for(String s: listString) {
	
	System.out.println(s);
}
		

	}

}
