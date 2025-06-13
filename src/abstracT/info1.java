package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import javax.management.StringValueExp;

public class info1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	(25,30,56,44,30,56,25 ) - Remove the duplicates & print in asc order ---> (25 ,30,44,56)

		
	          // List<Integer> list=new ArrayList<Integer>();
	           
	           List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	           
	           

		list.add(1);
		list.add(2);
		list.add(1);
		list.add(25);
		list.add(30);
		list.add(56);
		list.add(56);
		
		System.out.println("Before Sort:- "+list);
		
	 Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst();
	 
	 List<Integer> collect = list.stream().filter(i-> String.valueOf(i).startsWith("2")).collect(Collectors.toList());
	 System.out.println(collect);
	 
	// System.out.println("After Sort:- "+collect);
	 
	 System.out.println(first.get());
	

	}

}
