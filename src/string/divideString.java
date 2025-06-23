package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class divideString {
	
	 public static String[] divideString1(String s, int k, char fill) {
	        StringBuilder sb = new StringBuilder(s);

	        while (sb.length() % k != 0) {
	            sb.append(fill);

	        }
            System.out.println(sb);

	        String res[] = new String[sb.length() / k];
	        for (int i = 0; i < sb.length() / k; i++) {
	            res[i] = sb.substring(i * k, (i + 1) * k);
	        }

	        List<String> list = Arrays.asList("apple", "orange", "berry","kiwi","berry", "blueberry");
                         
            List<Boolean> newList=list.stream().map(i->i.toUpperCase()).map(i-> i.startsWith("B")).collect(Collectors.toList());
            
            System.out.println(newList);
	        
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String	s = "abcdefghij";
	System.out.println(s.length());
	int k = 3;
	char fill = 'x';
		
		 String[] ans =divideString1(s, k,fill);
		 for(String s1: ans) {
			 System.out.println(s1);
			 
		 }

//		 System.out.println(ans);
	}

}
