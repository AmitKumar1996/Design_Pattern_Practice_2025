package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringbasedOnNumberOfCheracter {

	public static void main(String[] args) {
		ArrayList<String> l= new ArrayList<String>();
		
		l.add("Ad");
		l.add("AA");
		l.add("AbAAAA");
		l.add("AAAA");
		l.add("AAA");
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
	
//		for(String s:l)
//		System.out.println(s);

	List<String> l3=l.stream().sorted().collect(Collectors.toList());
	System.out.println("Not sordet based on String Length: "+l3);
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

	
	
	Comparator<String> c=(s1, s2)->{
		
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2) {
			return +1;
		}
		else {
			return s1.compareTo(s2);
		}
	};
	
	
	
	
//		Comparator<String> c=(s1, s2)->{
//			int l1=s1.length();
//			int l2=s2.length();
//			if(l1<l2) return -1;
//			else if(l1>l2) return +1;
//			else return s1.compareTo(s2);
//		};
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

		List<String> collect = l.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println("Sorted Based on Length: "+collect);
		
		
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}
