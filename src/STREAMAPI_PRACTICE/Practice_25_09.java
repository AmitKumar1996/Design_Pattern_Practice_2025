package STREAMAPI_PRACTICE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_25_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	System.out.println("Hello World");
		
		List<Integer> list=List.of(1,2,2,3,4,5,6,6);
		int[] A={1,6,2,3,4,5,6,6,3};
		
	Integer max1=Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		
			System.out.println(max1);
	int max=list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		
			System.out.println(max);
			
	long count=	Arrays.stream(A).boxed().filter(i->i%2==0).count();
		
		System.out.println(count);
		
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
	List<Integer> listset=Arrays.stream(A).boxed().filter(i->  !set.add(i)).collect(Collectors.toList());

		System.out.println(listset);
		
	List<Integer> list3=Arrays.stream(A).boxed().limit(3).collect(Collectors.toList());
	
	
		System.out.println(list3);
		
	List<Integer> list4=	Arrays.stream(A).boxed().skip(2).collect(Collectors.toList());
	
	
		System.out.println(list4);
		
	long list5	=Arrays.stream(A).sum();
	
	
		System.out.println("list5:--->"+""+list5);
		
		
	long list6=list.stream().mapToInt(Integer :: intValue).sum();
	
	
	
		System.out.println("list6:--->"+""+list6);
	
		
	boolean check=	list.stream().allMatch(i->i%2==0);
	
	
		
		System.out.println("check:--->"+""+check);
		

	}

}
