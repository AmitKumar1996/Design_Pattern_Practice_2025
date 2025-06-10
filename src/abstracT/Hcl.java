package abstracT;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String s="earth@heart";

		//earth, heart, 1


//String s="their@ather";
		
//		their, ather, 0



String[] str=s.split("@");

// System.out.println(str[0]+" "+str[1]);

String s1=str[0];

String s2=str[1];



//
//HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
//HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
//
//for(int i=0;i<)



Map<Character, Long> map1 = s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


Map<Character, Long> map2 = s2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


//System.out.println(map1);
//
//
//
//System.out.println(map2);


//for(int i=0;i<map1.size();i++) {
//	
//	if(map2.containsKey(map1.get(map2)))
//}

int flag=1;


for(Entry<Character, Long> i: map1.entrySet()) {
	
if(map2.containsKey(i.getKey())) {
	
	if(map1.get(i.getKey())==map2.get(i.getKey())) {
	
	}
	else {
		flag=0;
		
	}
}
else {
	flag=0;
}
	
}


		
	if(flag==1) {
		System.out.println(s1+""+s2+"1");
	}	
	else {
		System.out.println(s1+""+s2+"0");
	}

	}

}
