package abstracT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class interview11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
//		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//		System.out.println("This is using Stream API:- "+collect);
		
		HashSet<Integer> set=new HashSet<Integer>();
//		
//		for(Integer i: list) {
//			
//			set.add(i);
//			
//		
//			
//		}
//		System.out.println("This is set :-"+set);
	
		
		List<Integer> collect = list.stream().filter(i-> set.add(i)).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		list.
		
		
	}

}
