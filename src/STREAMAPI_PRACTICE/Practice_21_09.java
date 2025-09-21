package STREAMAPI_PRACTICE;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_21_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="amit";
		String ans=s.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a);
		System.out.println(ans);
		
		 String join=s.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining(" "));
		 
		 System.out.println(join);
		 
		List<Integer> list=List.of(5,3,9,1,7);
		
		   Integer number=list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
		      Integer number1=         list.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().orElseThrow();
		   
		   System.out.println(number1);

	}

}
