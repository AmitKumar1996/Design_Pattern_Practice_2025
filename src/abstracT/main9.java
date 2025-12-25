package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main9 {

	public static boolean checkVowel(char c) {
		
		if(c=='a' || c== 'e' || c== 'i' || c== 'o' || c== 'u' || c=='A' || c== 'E' || c== 'I' || c== 'O' || c== 'U') {
			
			return true;
			
		}
		else {
			return false;
		}
		
		
		
		
	}
	
	
	public static int countChar(char c , int ptr, char ch[]) {
		
		boolean flag=true;
		int count=1;
		while(flag) {
			if(ch[ptr]==ch[ptr+1]) {
				ptr++;
				count++;
			}
			else {
				flag= false;
			}
		}
		System.out.println(c+"->"+count);
		if(ptr+1==ch.length-1 && ch[ptr]!=ch[ptr+1]) {
			System.out.println(ch[ptr+1]+"->"+1);
			
			
		}
			
		return ptr+1;
	}
	
	
	
	public static void main(String[] args) {
		
//		
	String s="aaabbbbccaabbzzzzzxx";
		
	//String s="aabb";
	     // a3b4c2a2b2z1
		
		
		
	//	System.out.println(s.length());
		
		
	  char ch[]=s.toCharArray();
	  
	  
	  for(int i=0;i<ch.length;i++) {
		  if(i==ch.length-1) {
			  if(ch[i]==ch[ch.length-1]) {
				  System.out.println(ch[i]+"->"+2);
				  break;
			  }
		  }
		  i=countChar(ch[i], i,ch);
	  }
	  
	  for(int i=0;i<ch.length;i++) {
		  
		  int ptr=1;
		  boolean flag=true;
		  
		  while(flag) {
			  
			  
			  
			  if(i==ch.length-1) {
				  if(ch[i-1]==ch[ch.length-1]) {
					  
					  System.out.println(ch[i]+""+ptr);
					// System.out.println(ptr+"-->"+i);
					 flag=false;
					 break;
					  
				  }
				  else {
					  System.out.println(ch[i]+""+ptr);
					  flag=false;
					// System.out.println("p1");
					  break;
				  }
			  }	
			  
			  
			  
			  
			  
			  
			  
			  if(ch[i]==ch[i+1]) {
				  i++;
				  ptr++;
			  }
			  else {
				  System.out.println(ch[i]+""+ptr);
				//  System.out.println("p2");
				  flag=false;
				  break;
				  
				  
			  }
		  }
		  
	  }

		
		
//		
////		
////		nput: s = "IceCreAm"
////
////				 
////
////				Output: "AceCreIm"
//		
//		
//		String s="IceCreAm";
//		
//		char c[]=s.toCharArray();
//		
//		int p1=0;
//		int p2=s.length()-1;
//		
//
//		while(p1<p2) {
//			
//           if(checkVowel(c[p1])) {
//        	   
//        	   
//        	   if(checkVowel(c[p2])) {
//        		   
//        		   char temp=c[p1];
//        		   c[p1]=c[p2];
//        		   c[p2]=temp;
//        		   
//        		   p1++;
//        		   p2--;
//        		   
//        	   }
//        	   
//        	   else {
//        		   p2--;
//        	   }
//           }
//           else {
//        	   p1++;
//           }
//			
//			
//		}
//		
//		
//		
//		
//		
//		for(Character i: c) {
//			System.out.print(i);
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
	int A[]= {98, 100, 35, 75, 73, 81, 86, 75, 100, 100,75, 35, 75, 17, 98, 35, 75, 73, 81, 86,125,125};
	
// Arrays.stream(A).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		
//  
//  
//  System.out.println(first.get());
	
	
//	Map<Integer, Long> map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(i->i, Collectors.counting()));
//	
//	
//	Optional<Integer> first = Arrays.stream(A).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//	
//	System.out.println(map.get(first.get()));
//	
//	
//	String s="amit kumar";
//	
//	s=s.replace(" ", "");
//	
//	LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap:: new , Collectors.counting()));
//	
//	
//	System.out.println(collect);
	
       
//       if(!first.isEmpty()) {
//    	 System.out.println(first.get());
//    		
//    	   
//       }


	
	
	
//	int fm=A[0]; // 98
//	int sm=A[1]; // 100
//	
//
//	
//	Arrays.sort(A);
//	for(Integer i: A){
//		System.out.println(i+"   ");
//		
//	}
//	int k=A[A.length-2];
//System.out.print(k);
//	
//	int counter=0;
//	//int k=98;
//	
//for(int i=0;i<A.length;i++) {
//	if(k==A[i]) {
//		counter++;
//		
//	}
//}
//
//
//System.out.println(counter);
//	
//	if(fm<sm) {
//		int temp=fm;
//		fm=sm;
//		sm=temp;
//	}
//	System.out.println(sm);
//		
//	for(int i=2;i<A.length;i++) {
//		
//		
//		if(fm<A[i]) {
//		sm=fm;
//		fm=A[i];
//		
//			
//		}
//		
//		else if(A[i]>sm) {
//			sm=A[i];
//		}
//		
//	}
//	
////	System.out.println(sm);
//		
//		
	

	}

}
