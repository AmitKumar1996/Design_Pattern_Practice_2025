package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingExample_23_03 {

	public static void main(String[] args) {
		
ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
System.out.println(l);

List<Integer> l1= l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(l1);
    List<Integer>l2=l1.stream().map(i->i+10).collect(Collectors.toList());
    System.out.println(l2);
    Long count= l.stream().filter(i->i%2==0).count();
    System.out.println(count);
   List<Integer> l3= l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
   System.out.println(l3);
 List<Integer>l4=  l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
 System.out.println(l4);
Integer min=l.stream().min((s1,s2)->s1.compareTo(s2)).get();
 Integer max=l.stream().max((s1,s2)->s1.compareTo(s2)).get();
 System.out.println("min: "+min);
 System.out.println("max: "+max);
 l.forEach(i->System.out.print(" "+i));
 System.out.println();
 l.forEach(System.out::println);
 
 
                 

                   

	}

}
