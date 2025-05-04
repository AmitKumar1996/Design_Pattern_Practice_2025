package abstracT;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cg {

	public static void main(String[] args) {
		
		
		String str="ammit";  
		
        Map<Character, Long> freq=	str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println(freq);
        
       char[] a=str.toCharArray();
       
       for(int i=0;i<a.length;i++) {
    	   System.out.println(i+"->"+a[i]);
       }
		// TODO Auto-generated method stub

	}

}
