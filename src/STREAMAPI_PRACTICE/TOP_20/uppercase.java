package STREAMAPI_PRACTICE.TOP_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class uppercase {
	

	
	
	public static void main(String[] args) {
	
	
		
//		List.of("Amit","sumit", "kohli","virat");
		
		List<String> list=List.of("Amit","sumit", "kohli","virat");
		
	//	List<String> collect = list.stream().map(String:: toUpperCase).collect(Collectors.toList());
		
	//	System.out.println(collect);
		
		
		List<Integer> List =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		int target=9;
		
		HashMap<Integer, Integer> map=new HashMap<>();
		int i=0;
		  
		for(Integer l:List) {
			int temp=target-l;
			if(map.containsKey(temp)) {
				System.out.println(l+"-->>"+temp);
			}else {
				map.put(l, i++);
			}
		}
		
		
		
	}
}
