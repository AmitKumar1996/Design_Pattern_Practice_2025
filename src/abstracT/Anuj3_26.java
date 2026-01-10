package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Anuj3_26 {
	

	public static void  main( String  Args[]) {
	
		String s="anujyadav";
		
		 LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c->(char)c)
		.collect(Collectors
				.groupingBy(Function.identity(),LinkedHashMap :: new , 
						Collectors.counting()));
		 
		 System.out.println(collect);
		 
		 int[] A= {1,2,3,4,5,7,6,5};
		 
		 Integer first = Arrays.stream(A).boxed().distinct()
		 .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
		 
		 System.out.println(first);
		 
		 List<int[]> asList = Arrays.asList(A);
		 
		 
		   List<Integer> list = Arrays.stream(A).boxed().toList();
		   
		         List<Integer> list2 = list.stream().sorted((a,b)->
		         -b.compareTo(a)
		        	 
		         ).distinct().toList();
		         
		         System.out.println(list2);
		         

List<EmployeeRecord> empList = new ArrayList<>();

empList.add(new EmployeeRecord("IT", 200.0, "Amit"));
empList.add(new EmployeeRecord("HR", 150.0, "Rohit"));
empList.add(new EmployeeRecord("Finance", 300.0, "Neha"));
empList.add(new EmployeeRecord("IT", 250.0, "Suman"));
empList.add(new EmployeeRecord("Admin", 180.0, "Pooja"));
empList.add(new EmployeeRecord("HR", 220.0, "Ankit"));
empList.add(new EmployeeRecord("Finance", 275.0, "Kavita"));
empList.add(new EmployeeRecord("IT", 320.0, "Rahul"));
empList.add(new EmployeeRecord("Support", 160.0, "Priya"));
empList.add(new EmployeeRecord("IT", 290.0, "Vikas"));

//first salary
Map<String, Optional<EmployeeRecord>> collect2 = empList.stream().collect(Collectors
		.groupingBy(EmployeeRecord :: getDepartment, 
				Collectors.maxBy(Comparator.comparing(EmployeeRecord:: getSalry))));

System.out.println(collect2);

// second salary

 Map<String, Optional<EmployeeRecord>> collect3 = empList.stream().collect(Collectors.groupingBy(EmployeeRecord :: getDepartment,
		
		Collectors.collectingAndThen(Collectors.toList() , l->l.stream()
				
				.sorted(Comparator.comparing(EmployeeRecord :: getSalry).reversed()).skip(1).findFirst()
				
				)
		
		));

		
	}
	
}
