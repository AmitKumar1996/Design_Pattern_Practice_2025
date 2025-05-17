//package abstracT;
//
//import java.security.KeyStore.Entry;
//import java.util.HashMap;
//import java.util.Set;
//
//public class Interview7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	String str=	"work fulture oc volkswagen is awesome";
//	
//str=str.replace(" ", "");
//System.out.println(str);
//	
//	HashMap<Character, Integer> map=new HashMap<>();
//	
//	for(int i=0;i<str.length();i++) {
//		
//		if(map.containsKey(str.charAt(i))) {
//			map.put(str.charAt(i), map.get(str.charAt(i))+1);
//		}
//		else {
//			map.put(str.charAt(i), 1);
//			}
//	}
//	
//	
////	Set<java.util.Map.Entry<Character, Integer>> entrySet = map.entrySet();
//	
////	
////	for(java.util.Map.Entry<Character, Integer> i:entrySet) {
////		
////	if(i.getValue()==1) {
////		
////		System.out.println(i);
////		
////	}
////	}
//	
//	
//	for(int i=0;i<str.length();i++) {
//		
//		if(map.containsKey(str.charAt(i))) 
//		{
//			if(map.get(str.charAt(i))==1){
//				System.out.println(str.charAt(i));
//				break;
//				
//			}
//		}
//	
//	}
//
//	//System.out.println(map);
//	
//	
//	
//
//	}
//
//}


package abstracT;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview7 {

    public static void main(String[] args) {
        String str = "work fulture oc volkswagen is awesome";

        // Remove spaces
        str = str.replace(" ", "");
        System.out.println(str);

        // Count character frequency using Java 8 streams
        Map<Character, Long> map = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find and print the first non-repeating character
        map.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .findFirst()
            .ifPresent(entry -> System.out.println(entry.getKey()));
    }
}

