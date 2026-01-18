package Java_8.StreemAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8_18_jan {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
//		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
//		
//		System.out.println(collect);
//		
//		for(Map.Entry i:collect.entrySet()) {
//			System.out.println(i.getKey());
//			System.out.println(i.getValue());
//		}
		
		
		int[] A=new int[5];
		
		for(int i=0;i<A.length;i++) 
		{
			A[i]=i;
			
		}
		
		int[] B= {2,4,6,2,1,8,9,0};
		String str="madam2";
		
	int[] c=IntStream.concat(Arrays.stream(A), Arrays.stream(B)).sorted().distinct().toArray();
//	for(int j:c) {
//		
//		System.out.print(j+" ");
//	}
	
//	List<String> str=Arrays.asList("Amit","Sumit", "Raja","kumar");
//	
//    str.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    
//    Map<Integer,List<String>> collect = str.stream().collect(Collectors.groupingBy(String :: length));
//    
//    System.out.println(collect);
	
	
	boolean noneMatch = IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i) !=str.charAt(str.length()-1-i));
	if(noneMatch==true)
	System.out.println(str);
	else {
		System.out.println("Not palandrome");
	}
	
	
	
	}
	

}

