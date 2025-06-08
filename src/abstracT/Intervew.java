package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Intervew {

	public static String  reverse(String str) {
		
		String newString="";
		for(int i=str.length()-1;i>=0;i--) {
			
			newString = newString+str.charAt(i);
			
			
		}
		return newString;
		
	}
	public static void main(String[] args) {

		
		String s="amit is a good boy";
		
		String str="";
		
		// tima si a doog yob
		
		String[] A=s.split(" ");
		
//		for(String i:A)
//		
//		System.out.println(i);
		
		for(int i=0;i<A.length;i++) {
			
			str +=" "+reverse(A[i]);
			
			
			
		}
		
		str.trim();
		System.out.println(str.toString());
	
    
	
	}

}
