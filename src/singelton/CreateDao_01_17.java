package singelton;

public class CreateDao_01_17 {
	
	private static CreateDao_01_17 createDao_01_17=null;
	
	private static  CreateDao_01_17 getInstance() {
		if(createDao_01_17 == null) {
			createDao_01_17 = new CreateDao_01_17();
		}
		return createDao_01_17;
	}

	public static void main(String[] args) {
		
		CreateDao_01_17 obj1= new CreateDao_01_17().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_17 obj2= new CreateDao_01_17().getInstance();
		
		
		System.out.println(obj2.hashCode());
		
CreateDao_01_17 obj3= new CreateDao_01_17().getInstance();
		
		
		System.out.println(obj3.hashCode());
		// TODO Auto-generated method stub

	}

}
