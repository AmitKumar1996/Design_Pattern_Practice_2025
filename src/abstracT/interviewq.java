package abstracT;

import java.util.ArrayList;
import java.util.List;

public class interviewq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How do you convert a List<String> of comma-separated values into a single list of all values using Streams 
	//	List<String> data = List.of("a,b", "c,d,e", "f"); List<String> Output= ["a","b","c","d","e","f"]

		List<String> data = List.of("a,b", "c,d,e", "f");
		
		
		
	//	List<String> data = List.of("a","b", "c","d","e", "f"); 
//		
//		String str="";
//		
//	for(int i=0;i<data.size();i++) {
//		
//		str = str + data.get(i);
//		
//	}
//		
//	///System.out.println(str);
//	
//	char[] charArray = str.toCharArray();
	
	
	List<String> output=new ArrayList<>();
	
	data.forEach(i-> output.add(i));
	
	System.out.println(output);
	
	
	//for(int i=0;i<)
	
//	System.out.println(charArray);
		
	//	char[] ans=data.to
		
		
		
	//	List<String> Output= ["a","b","c","d","e","f"]
		
		
	}

}
