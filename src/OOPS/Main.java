package OOPS;


class A{
	int d1=10;
	void fun1() {
		System.out.println("f1 of A");
	}
	int d=100;
	void fun() {
		System.out.println("fun of A");
	}
	
}

class B extends A {
	int d2=20;
	void fun1() {
		System.out.println("f1 of B");
	}
	int d=200;
	void fun() {
		System.out.println("fun of B");
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// Case 2
		A o2= new B();
		System.out.println(o1.d);
		
		//Case 3
		B o3= new B();
	System.out.println(o3.d1);
	

		

		
		
		//Case 1		
//		A o1= new A();
//		System.out.println(o1.d1);
//	//	System.out.println(o1.d2);
//		o1.fun1();	
		
		
		

	}

}
