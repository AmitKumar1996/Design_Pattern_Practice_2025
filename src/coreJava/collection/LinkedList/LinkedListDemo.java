package coreJava.collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		
		l.add("Amit");
		
		l.add("kumar");
		
		l.add("yadav");
		System.out.println(l);
		
		l.add(29);
		System.out.println(l);
		
		l.set(0, "Raja");
		
		System.out.println(l);
		l.removeLast();
		
		
	
		System.out.println(l);
	}

}
