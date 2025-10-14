package STREAMAPI_PRACTICE.TOP_20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(5,3,4,61,7,8);
		
		Integer max = list.stream().filter(i->i%2==0).max(Integer :: compare).orElseThrow();
		System.out.println(max);
		
		Integer max1 = list.stream().max(Integer::compare).orElseThrow();
		
		System.out.println(max1);

	int[] A= {5,3,4,61,7,8,10};
	Integer integer = Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
	System.out.println(integer);
		long count = Arrays.stream(A).filter(i->i%2==0).count();
		
		System.out.println(count);
		
		
	}

}
