package Java_8;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapToList_01_31 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(1, "Amit");
		
		map.put(2, "kumar");
		
		map.put(3, "Yadav");
		
		
	List<Integer> listKey=	map.keySet().stream().collect(Collectors.toList());
	
for(Integer i: listKey) {
	
	System.out.println(i);
	
}


List<String> collect = map.values().stream().collect(Collectors.toList());

for(String s: collect) {
	System.out.println(s);
}



		
		// TODO Auto-generated method stub

	}

}
