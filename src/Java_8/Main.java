//package Java_8;
//
//
//class A{
//	public void sayHello(String S){
//		System.out.println("Hello"+S);
//	}
//}
//
//class B extends A{
//
//	public void sayHello(String S){
//		System.out.println("Hello");
//	}
//
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		A a = new B();
//		a.sayHello("Amit");
//	}
//
//	
//}

package Java_8;


class A{
	protected void sayHello(String S){
		System.out.println("Hello"+S);  // Hello Amit
	}
}

class B extends A{

	public void sayHello(String S){
		System.out.println("Hello");   // Hello
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a = new B();
		a.sayHello("Amit");
	}

	
}



//package Java_8;
//
//
//class A{
//	public void sayHello(String S){
//		System.out.println("Hello");
//	}
//	public void sayHello(String S, String M){
//		System.out.println("Hello"+S);
//	}
//}
//
//class B extends A{
//	
//
//	public void sayHello(String S, String M){
//		System.out.println("Hello");
//	}
//
//
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		A a = new B();
//		a.sayHello("Amit");
//	}
//
//	
//}
