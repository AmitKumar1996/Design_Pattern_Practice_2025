package coreJava.collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo_01_10 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add("A");

		a.add(10);

		a.add("M");

		a.add(null);

		a.add(11);

		System.out.println(a);

		a.remove(2);

		System.out.println(a);

		a.add(2, "AMIT");

		System.out.println(a);

		a.add(21);

		System.out.println(a);

	}

}
