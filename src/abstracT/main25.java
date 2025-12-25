package abstracT;

//TODO Auto-generated method stub

	// How to generate a stream of characters from 'A' to 'Z' using java8
		

		 
		 
//		 for(IntStream i: range)
//		 
//		 System.out.println(i);
		 
		 
		 
		// Check if a string is a palindrome using Java 8 streams
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class main25 {

	public static void main(String[] args) {
		
		
		IntStream range = IntStream.rangeClosed('a','z');
		 
		 
		 range.forEach(i-> System.out.println((char)i));
		
//		 
//		 String S="amit";
//		 
//		char c[]=S.toCharArray();
//		
//		int p1=0,flag=1;
//		int p2=S.length()-1;
//		
//		
//		while(p1<p2) {
//			
//			
//			
//			
//			if(c[p1]==c[p2]) {
//				p1++;
//				p2--;
//				
//			}
//			else {
//				flag=0;
//				System.out.println("Not a palindrome");
//				
//				break;
//			}
//		}
//		
//		if(flag==1) {
//			System.out.println("It is a palindrome");
//		}
		
		
//		
//		
		
		
		
	//	Java program that checks whether brackets are balanced in a given expression: String expression1 = "{[()]()}";
	//	        String expression2 = "([)]";
	
		 
		Stack<Character> sc=new Stack<Character>();
		String s="([)]";
	char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(sc.isEmpty()) {
				sc.push(c[i]);
			}
			else{
		
				if(c[i]=='}' && sc.peek()=='{') sc.pop();
				else if(c[i]=='}' && sc.peek()=='{') sc.pop();
				else if(c[i]==')' && sc.peek()=='(') sc.pop();
				else {
					sc.push(c[i]);
				}
			}
			
			
		}
		
		if(sc.isEmpty()) {
			System.out.println("Balanced expression");
		}
	else {
			System.out.println("Not Balanced expression");
			
		}
		
	

	}

}
