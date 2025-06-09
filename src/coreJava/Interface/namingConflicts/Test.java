package coreJava.Interface.namingConflicts;

public class Test implements Left,Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println(x); // Error 
		
		System.out.println(Right.x);
		
		System.out.println(Left.x);
		
	}

}
