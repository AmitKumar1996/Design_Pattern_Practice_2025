package Java_8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
public class MapToList_01_30 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Amit");
		map.put(2, "kumar");
		map.put(3, "yadav");
		
		
	List<Integer> keyList=	map.keySet().stream().collect(Collectors.toList());
	
	System.out.println(keyList);
	
List<String> values=	map.values().stream().collect(Collectors.toList());
     System.out.println(values);

	}

}
