package abstracT;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

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
	

	}

}
