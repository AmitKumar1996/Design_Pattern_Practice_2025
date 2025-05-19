package abstracT;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GlobalLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(5);
		// 4->4 5->3 3->2 2->1 1->1 
//		
//		
//	Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst();
//	System.out.println(first.get());
		
		
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy((Function.identity()), Collectors.counting()));
		
		
		
		
		
		
		
	//	System.out.println(collect);
		
}
		
	}


