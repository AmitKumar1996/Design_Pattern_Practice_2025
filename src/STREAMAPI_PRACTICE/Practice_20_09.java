package STREAMAPI_PRACTICE;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice_20_09 {

	public static void main(String[] args) {
		
		
		String s="amit";
		
		List<Character> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		System.out.println(collect);
	}

}
