package coreJava.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(1);
		
		a.add(2);
		
		a.add(3);
		
		a.add(4);
		
		a.add(5);
		
		a.add(6);
		
		
		
		for(Integer i: a) {
			
			System.out.print(" "+i);
		}
		

	}

}
