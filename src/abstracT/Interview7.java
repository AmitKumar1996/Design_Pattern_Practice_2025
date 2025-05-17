package abstracT;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class Interview7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str=	"work fulture oc volkswagen is awesome";
	
str=str.replace(" ", "");
System.out.println(str);
	
	HashMap<Character, Integer> map=new HashMap<>();
	
	for(int i=0;i<str.length();i++) {
		
		if(map.containsKey(str.charAt(i))) {
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		else {
			map.put(str.charAt(i), 1);
			}
	}
	
	
//	Set<java.util.Map.Entry<Character, Integer>> entrySet = map.entrySet();
	
//	
//	for(java.util.Map.Entry<Character, Integer> i:entrySet) {
//		
//	if(i.getValue()==1) {
//		
//		System.out.println(i);
//		
//	}
//	}
	
	
	for(int i=0;i<str.length();i++) {
		
		if(map.containsKey(str.charAt(i))) 
		{
			if(map.get(str.charAt(i))==1){
				System.out.println(str.charAt(i));
				break;
				
			}
		}
	
	}

	//System.out.println(map);
	
	
	

	}

}
