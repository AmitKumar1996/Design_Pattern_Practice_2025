package Java_8;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class cg {


	
	/*
	 1=2

2=2

3=2

4=2

5=1
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		1=2
//				1=2
//				2=2
//				2=2
//				3=2
//				3=2
//				3=2
//				4=2
//				4=2
//				5=1
		
		int[] arr= {1,2,3,4,5,2,3,4,1,7,5};
		
		HashMap<Integer, Integer> map= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
			
			}
			else {
				map.put(arr[i], 1);
			}
		}
	
		
		for(int i=0;i<arr.length;i++) {
			
			int temp=map.get(arr[i]);
			int count=temp;
			
			while(temp>0) {
				System.out.println(arr[i]+" "+count);
				temp--;
			}
			
			//System.out.println(temp);
		}
		
		 Map<Integer, Long> freqMap = Arrays.stream(arr)
	                .boxed()
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

	        // Step 2: Print each number along with its frequency, repeated as many times as frequency
	        Arrays.stream(arr)
	                .forEach(num -> {
	                    long count = freqMap.get(num);
	                    for (int i = 0; i < count; i++) {
	                        System.out.println(num + " " + count);
	                    }
	                });
		
		
		
		
		
		
		
		

	}

}
