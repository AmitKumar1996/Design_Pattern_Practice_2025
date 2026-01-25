package abstracT;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;



class P{
	public void m1() {
		
		System.out.println("m1");
	}
	
}
class C extends P{
public void m1() {
   System.out.println("m2");
	}
	
}
public class Main21 {
		
	public static void main(String[] args) {		
		//P p = new P();
		
		P o2=new C();
		System.out.println();
		o2.m1();

	}

}
