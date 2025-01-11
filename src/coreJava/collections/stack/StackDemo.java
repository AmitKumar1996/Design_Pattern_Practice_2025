package coreJava.collections.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack s= new Stack();
		
		
		s.add('r');
		s.add('a');
		s.add('m');
		s.add('u');
		s.add('k');
		
		System.out.println(s);
		
		s.add('t');
		s.add('i');
		
		s.add('m');
		s.add('A');
		
		System.out.println(s.pop());

	}

}
