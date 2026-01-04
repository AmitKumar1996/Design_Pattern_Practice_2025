package abstracT;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import Java_8.ReverseArray;


public class DailyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a string, find the length of the longest substring without repeating characters.
//
//		Example:
//
      	String str = "abcabcbb";
//
//		Answer : Length : 3 Substring : abc and bca and cab
      	
      	
      	
      	int counter=0;
      	
		
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<str.length()-1;j++) {
				
				
				if(str.charAt(j)==str.charAt(j+1)) {
					counter++;
					
				}
				else {
					break;	
				}
			}
			
		}
		
		System.out.println(counter);
		
		int product=1;
		int[] A= {1,2,3,-1,6,3,6};
		
//		for(int i=0;i<A.length;i++) {
//			
//		for(int j=i;j<A.length;j++) {
//			
//			
//		}
//			
//		}
		
//		
//		Optional<Integer> first = Arrays.stream(A).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		System.out.println(first.get());
//	

	}

}
