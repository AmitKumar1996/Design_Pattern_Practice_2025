package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringbasedOnNumberOfCheracter {

	public static void main(String[] args) {
		ArrayList<String> l= new ArrayList<String>();
		
		l.add("A");
		l.add("AA");
		l.add("AAAAA");
		l.add("AAAA");
		l.add("AAA");
		
		
		for(String s:l)
		System.out.println(s);

		
		
		Comparator<String> c=(s1, s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		
		List<String> collect = l.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
