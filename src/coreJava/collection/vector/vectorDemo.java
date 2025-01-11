package coreJava.collection.vector;

import java.util.Vector;
public class vectorDemo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		
		System.out.println(v.capacity());
		
		for(int i=0;i<v.capacity();i++) {
			v.add(i);
		}
		
		System.out.println(v.capacity());
		
		v.add("Amit");
		
		System.out.println(v.capacity());
		
		System.out.println(v);
	}

}
