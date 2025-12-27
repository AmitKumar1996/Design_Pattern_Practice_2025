package abstracT;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
package com.start.abstractclass;

abstract class Custom {

	String msg = "hello";

	static String txt = "hello there";

	static final public int NUM_VALUE = 100;

	abstract void greeting();

	void m1() {
		System.out.println("hi from m1()");
	}

}

class Demo extends Custom{


	void greeting() {
		
		
	}
	
}

interface Example  {
	
	int x = 10;//final
	static int y = 19;

	void m2();

	default void m3() {

	}

	static void m4() {

	}
}

class Test implements Example {

	@Override
	public void m2() {
		
		
	}
	
}

public class Main {

}


send
Send message
15:39
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,355,66,7,8,2,3,3,3};
		Integer A[]= {2,14,6,14,5};
		
		
		Integer reduce = Arrays.stream(a).boxed()
				.reduce(0,Integer :: sum);
		
		System.out.println(reduce);
		//Stream.of(a).distinct().sorted(Comparator<T>)
		
Integer sm= 	Arrays.stream(a).boxed().distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1).findFirst().get();

        // Arrays.stream(A).

     List<int[]> list=Arrays.asList(a);
     
     Long count=Arrays.stream(a)
    		 .boxed()
    		 .filter(i-> i%2==0).count();
     
     System.out.println(count);
     
     
     List<String> liststr= List.of("amit", "sumit","aaa","AAAA");
     
     List<String> up=liststr.stream()
    		 .map(s->s.toUpperCase())
     .collect(Collectors.toList());
     System.out.println(up);
     
   List<String> str=
		   liststr.stream()
      .map(s->s.subSequence(0, 1)
    		  +""+s.substring(1, 2)
    		  .toUpperCase()+""+s.substring(2)).toList();
   
  // System.out.println(str); 
   
   List<String> list2 = liststr.stream()
		   
		   .filter(s->s.startsWith("a") || s.startsWith("A")).toList();
   
  // System.out.println(list2);
   
   
   
     Map<String, Integer> map=new HashMap<>();
     
     
     
       map.put("amit", 2);
       map.put("sumit", 1);
       map.put("anil", 3);
     //  Set<Entry<String, Integer>> entrySet = map.entrySet();
       
  //  Map.Entry<String, Integer> em= map.entrySet();
     
//     for(Map.Entry<String, Integer> em: map.entrySet())
//     System.out.println(em);
       
    //   System.out.println(entrySet);
   
 //  int a[]= {1,2,355,66,7,8,2,3,3};
   
    List<Integer> list3 = Arrays.stream(a).boxed()
   .collect(Collectors
   .groupingBy(Function.identity(), Collectors.counting()))
   .entrySet().stream().filter(i->i.getValue()>1)
   .map(i->i.getKey()).toList();
   
  // System.out.println(list3);
   
   
  

   Map<String, Integer> map2 = new HashMap<>();
   map2.put("A", 1);
   map2.put("B", 2);
   System.out.println("-----------");
   System.out.println(map2.entrySet());
   

   Stream<Map.Entry<String, Integer>> entryStream = map2.entrySet().stream();
   // You can now apply stream operations, e.g., filtering entries where value > 1
   entryStream.filter(entry -> entry.getValue() > 1).forEach(System.out::println); 

   
   
     
     
      
       
       
       


//      
//     boolean test(T t);
//   (t)->{
//	   if(t==0) return false;
//	   else return true;
//   }



	}

}
