package abstracT;

import Deloitte.pattern;

class Parent{
	
	public void m1() {
		System.out.println("I am parent m1");
	}
	
}

class child extends Parent{
	
	public void m1() {
		System.out.println("I am child m1");
	}
	
}

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent o1=new Parent();
		//o1.m1(); // -> I am parent m1
		
		
	    Parent o2=new child(); 
	    // o2.m1();-> I am child m1
	    
	    child o3=new child();
	   // o3.m1();-> I am child m1
	     
	     
		
	   // child o4=new Parent();
	
		

	}
	
	

}
