package STREAMAPI_PRACTICE;

import java.util.stream.*;

import java.util.*;

public class Practice_23_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList = List.of("Amit", "kumar","Raja");
		       
//		
//		     arrayList.stream().sorted((s1,s2)->
//		    	 s1.
//		     )
		
		arrayList.stream().sorted((s1,s2)-> s1.substring(1).compareTo(s2.substring(1))).forEach(System.out::println);
		
	
	List<Integer> listmax=	List.of(1,2,4,3,5,9);
	
Integer max=	listmax.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();

System.out.println(max);

int A[]={1,2,3,4,5,6,1};

//Optional<Integer> max1=Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).findFirst();
//
//System.out.println(max1.get());


List<Integer> list=Arrays.stream(A).boxed().filter(i->i%2!=0).collect(Collectors.toList());

System.out.println(list);



HashSet<Integer> set=new HashSet<Integer>();



 List<Integer> collect=   Arrays.stream(A).boxed().filter(i-> !set.add(i)).collect(Collectors.toList());

System.out.println(collect);


 String s="123456789";

Integer filter = Arrays.stream(A).sum();
   
   System.out.println(filter);





		

		

	}

}


/*
 
 
 import java.util.*;

public class Practice_23_09 {
    public static void main(String[] args) {
        List<String> arrayList = List.of("Amit", "kumar", "Raja");

        arrayList.stream()
                 .sorted((s1, s2) -> s1.substring(1).compareTo(s2.substring(1)))
                 .forEach(System.out::println);
    }
}

 
 * */
