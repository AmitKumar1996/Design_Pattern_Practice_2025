package singelton;

import java.util.*;

public class ContactDao_01_11_01 {
	private static ContactDao_01_11_01 contactDao_01_11_01=null;
	
	
	private static ContactDao_01_11_01 getInstance() {
		
		
		if(contactDao_01_11_01 == null) {
			contactDao_01_11_01 = new ContactDao_01_11_01();
		}
		return contactDao_01_11_01;
	}
	
	

	public static void main(String[] args) {
		
		ContactDao_01_11_01 obj1= new ContactDao_01_11_01().getInstance();
		
		System.out.println(obj1.hashCode());
		
		
		ContactDao_01_11_01 obj2= new ContactDao_01_11_01().getInstance();
		
		System.out.println(obj2.hashCode());
		
		
		
		
	}

}
