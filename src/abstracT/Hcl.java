package abstracT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hcl {

	public static void main(String[] args) {
	
		    
		        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit", "orange");

		        Optional<String> longest = strings.stream()
		            .max(Comparator.comparingInt(String::length));
		        
		        
		        
		        System.out.println(longest.get());
		        
		        List<String> list = Arrays.asList("A", "B", "C", "B", "A");
		        long count = list.stream().count(); // Total count

		        long countA = list.stream().filter(i -> i.equals("A")).count(); // count of "A"
		        
		        
		        List<Integer> list12 = Arrays.asList(1, 2, 3, 4);
		        List<Integer> result = IntStream.range(0, list12.size())
		            .mapToObj(i -> list12.get(i) * i)
		            .collect(Collectors.toList());

		        System.out.println(result); // Output: [0, 2, 6, 12]

		        
		        List<Employee> sortedEmployee = EmpList.stream()
		        	    .collect(Collectors.Compare(String::name))
		        	    .filter(i -> i.getAge() > 30);




		

		
		

String s="earth@heart";

		//earth, heart, 1


//String s="their@ather";
		
//		their, ather, 0



String[] str=s.split("@");

// System.out.println(str[0]+" "+str[1]);

String s1=str[0];

String s2=str[1];



//
//HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
//HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
//
//for(int i=0;i<)



Map<Character, Long> map1 = s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


Map<Character, Long> map2 = s2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


//System.out.println(map1);
//
//
//
//System.out.println(map2);


//for(int i=0;i<map1.size();i++) {
//	
//	if(map2.containsKey(map1.get(map2)))
//}

int flag=1;


for(Entry<Character, Long> i: map1.entrySet()) {
	
if(map2.containsKey(i.getKey())) {
	
	if(map1.get(i.getKey())==map2.get(i.getKey())) {
	
	}
	else {
		flag=0;
		
	}
}
else {
	flag=0;
}
	
}


		
	if(flag==1) {
		System.out.println(s1+""+s2+"1");
	}	
	else {
		System.out.println(s1+""+s2+"0");
	}

	}

}
