package singelton;

import java.util.*;

public class CreateDao_01_11 {
	
	
	private static CreateDao_01_11 createDao_01_11=null;
	
	private static CreateDao_01_11 getInstance() {
		
		if(createDao_01_11  == null) {
			createDao_01_11 = new CreateDao_01_11();
		}
		return createDao_01_11;
		
	}

	public static void main(String[] args) {
		
		CreateDao_01_11 obj1= new CreateDao_01_11().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_11 obj2= new CreateDao_01_11().getInstance();
		
		System.out.println(obj2.hashCode());
		

	}

}
