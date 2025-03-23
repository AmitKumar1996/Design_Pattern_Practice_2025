package Java_8;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapToList_23_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map= new HashMap<>();
map.put(1, null);
map.put(1, "Amit");
map.put(2, "kumar");
List<Integer> key=map.keySet().stream().collect(Collectors.toList());
List<String> value=map.values().stream().collect(Collectors.toList());

System.out.println(key);
System.out.println(value);



	}

}
