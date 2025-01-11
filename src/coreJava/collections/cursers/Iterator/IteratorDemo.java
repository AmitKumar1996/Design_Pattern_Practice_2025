package coreJava.collections.cursers.Iterator;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar= new ArrayList<>();
		
		ArrayList a= new ArrayList();
		
		System.out.println(ar.size());
		
		System.out.println(a.size());
		
		
		
		
		for(int i=0;i<=10;i++) {
			
			
			
			a.add(i);
			
		}

		
		
		System.out.println(a);
		
		Iterator itr=a.iterator();
		
		while(itr.hasNext()) {
			
			Integer i = (Integer)itr.next();
			if(i%2 == 0) {
				
				System.out.println(i);
			}
			else {
				itr.remove();
			}
		}
		
		System.out.println(a);
		
		
		
	}

}
