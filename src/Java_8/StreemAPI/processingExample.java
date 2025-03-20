package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class processingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0));
		//ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0));
		
	List<Integer> l1=	arrayList.stream().map(i->i+10).collect(Collectors.toList());
	
	System.out.println(l1);
	Long count=l1.stream().filter(i->i%2==0).count();
	System.out.println("count"+count);
	
	List<Integer> l2=l1.stream().sorted().collect(Collectors.toList());
	System.out.println(l2);
	
	List<Integer> l3=l2.stream().sorted((s1, s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(l3);
	    Integer min= l3.stream().min((s1,s2)-> s1.compareTo(s2)).get();
	  	Integer max=  l3.stream().max((s1,s2)-> s1.compareTo(s2)).get();
	  	System.out.println("Max,"+max+" Min"+min);
		l3.stream().forEach(i->System.out.print(" "+i));
		
		l3.stream().forEach(System.out::println);

	}

}
