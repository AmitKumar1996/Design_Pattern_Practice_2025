package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class processingExample_20_03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,6));
	        
		System.out.println(l);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		
	List<Integer> l1=	l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println("l1:- "+l1);
	
	
 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	   List<Integer> l3=l.stream().map(i-> i*10).collect(Collectors.toList());
	   System.out.println("l3:- "+l3);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	   
	  Long num= l.stream().filter(i->i%2==0).count();
	  System.out.println("Even Count:- "+ num);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	  
	List<Integer> l4=  l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println("l4:- "+l4);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	
	
	
	           //   List<Integer> l5= l1.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());

Stream<Integer> sorted = l1.stream().sorted();
	              System.out.println("sorted "+sorted.toString());
	              
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	              
	    Integer l6= l.stream().min((s1,s2)->s1.compareTo(s2)).get();
	    System.out.println("min:- "+l6);
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	    
	    
	    
	Integer l7=    l.stream().max((s1,s2)->s1.compareTo(s2)).get();
	System.out.println("max:- "+l7);
	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
	
	
	
	l.forEach((i->System.out.print(" "+i)));
	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	
	l.forEach(System.out::println);
	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

	
	}
	

}
