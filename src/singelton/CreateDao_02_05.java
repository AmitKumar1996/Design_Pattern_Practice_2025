package singelton;

public class CreateDao_02_05 {
	
	private static CreateDao_02_05 createDao_02_05= null;
	
	private CreateDao_02_05 getInstance() {
		
		if(createDao_02_05 == null) {
		
		createDao_02_05 = new CreateDao_02_05();
	}
		return createDao_02_05;
	}

	public static void main(String[] args) {
		
		CreateDao_02_05 obj1= new CreateDao_02_05().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_02_05 obj2= new CreateDao_02_05().getInstance();
		System.out.println(obj2.hashCode());
		
		CreateDao_02_05 obj3= new CreateDao_02_05().getInstance();
		System.out.println(obj3.hashCode());
		// TODO Auto-generated method stub

	}

}
