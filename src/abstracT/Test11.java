package abstracT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S="amit  is my name";
//		
//		String[] s1=S.split(" ");
//		
//	S.chars().mapToObj(c->(char)c).collect(Function.identity())
		
		List<String> list=new ArrayList<String>();
		list.add("amit");
		list.add("sumit");
		list.add("kumar");
		
		list.stream().distinct().sorted(s1, s2)
	

	}

}
