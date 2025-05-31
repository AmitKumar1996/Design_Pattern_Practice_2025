package abstracT;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview71 {

	public static void main(String[] args) {
		String str="amitkumar";
		
		Map<Character, Long> frequency = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(frequency);
		
		
		
		
		

	}

}
