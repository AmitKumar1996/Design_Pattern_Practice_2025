package abstracT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anuj28 {
	
	public static void main(String arg[]) {
		
		String s="anujyadav";
		
		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c)
		.collect(Collectors
		.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()));
		//System.out.println(collect);
		
		int[] A= {1,2,3,4,55,99,100,100};
		Set<Integer> set=new HashSet<Integer>();
		
		Object[] array = Arrays.stream(A).boxed().filter(i-> !set.add(i)).toArray();
		for(Object i : array) {
			//System.out.println(i);
			
		}
		
		
		
		
		Optional<Integer> first = Arrays.stream(A).boxed().distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst();
		
		//System.out.println(first.get());
	  long coung =Arrays.stream(A)
		.boxed().filter(i->i%2==0).reduce(1,(a,b)->a+b);
		
		//System.out.println(coung);
	  
	  List<String> list=List.of("Anuj", "amit","zkuvytfmar","ybjhadav");
	  
	  
	  
	   List<String> list2 = list.stream()
			   .map(i->i.substring(0,1)+""+i.substring(1,2)
			   .toUpperCase()+""+i.substring(2)).toList();
	   
	    Map<Integer, List<String>> collect2 = list.stream().collect(Collectors
			   .groupingBy(String :: length));
			   
	 
	//System.out.println(collect2);
	
// List<String> list3 = list.stream().sorted(Comparator.comparing(String :: length)).toList();
//	  
//		System.out.println(list3);
	    
	    
	    List<String> list3 = list.stream().sorted().toList();
		  
		//System.out.println(list3);
		
		
		
	List<List<String>> flatmap=	List.of(List.of("a","b"),List.of("c","d"),List.of("e","f"));
		
		
	//	System.out.println(flatmap);
		
		
 List<String> sl=	flatmap.stream().flatMap(List::stream).toList();
 
 //System.out.println(sl);
 
 
	
		String s1="anuj";
		
		String collect3 = s1.chars().mapToObj(c->String.valueOf((char)c))
		.collect(Collectors.joining(","));
		
		//System.out.println(collect3);
		
		
		
//		String strWithSpace = str.chars()
//				.mapToObj(c-> String.valueOf((char)c))
//				
//				.collect(Collectors.joining(" "));
		
//		
////		4 1 2 3
////		 
////		3 4 1 2 k=1  (0+k)%4  = (1+1)%4=2
////		2 3 4 1 k=2
//		1 2 3 4 k=3 k=3
//		4 1 2 3 k=4 k=4
		
		
		int[] arr= {4,1,2,3};
		
		int[] ans=new int[arr.length];
		int n=arr.length;
		int k=1;
		for(int i=0;i<arr.length;i++) {
			ans[(i+k)%n]=arr[i];
		}
		
		for(Integer i: ans) {
			System.out.print(i+"  ");
		}
		
	//	Print all permutations of a string
		
		String s2="anuj";
//		a
//		n
//		u
//		j
//		an au aj 
//		na nu nj
//		ua un uj
//		ja ju jn
//		anuj
//		
		int c=0;
		
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(i==s2.length()-1 || j==s2.length()-1) continue;
				c++;
				System.out.println(s2.substring(i,j));
			}
		}
		
		System.out.println(c);
		
		
		
		
		
		
		
		 
		
		 
		
		
	}

}
