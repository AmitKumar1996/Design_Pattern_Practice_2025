package string;

import java.util.stream.Collectors;

public class StringStr123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("hello");
		String s2="hello";
		String s3= new String("hello");
		String s4="hello";
			
		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.intern()==s2);
//
//		System.out.println(s2==s4);
			
		String s="anuj amit";
		
		String reduce = s.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a);

		
		System.out.println(reduce);
		String s21="12a3b4";
		int sum = s21.chars().filter(c->Character.isDigit(c)).map(c-> c-'0').sum();
		System.out.println(sum);
		
	}

}
