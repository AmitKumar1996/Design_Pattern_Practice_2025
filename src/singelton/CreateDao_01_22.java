package singelton;

public class CreateDao_01_22 {
	
	private static CreateDao_01_22 createDao_01_22=null;
	
	
	private static CreateDao_01_22 getInstance() {
		
		if(createDao_01_22 == null) {
			createDao_01_22= new CreateDao_01_22();
			
		}
		return createDao_01_22;
	}

	public static void main(String[] args) {
		
		CreateDao_01_22 obj1= new CreateDao_01_22().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_01_22 obj2= new CreateDao_01_22().getInstance();
		
		System.out.println(obj2.hashCode());
		
CreateDao_01_22 obj3= new CreateDao_01_22().getInstance();
		
		System.out.println(obj3.hashCode());
		
CreateDao_01_22 obj4= new CreateDao_01_22().getInstance();
		
		System.out.println(obj4.hashCode());
		
	
		// TODO Auto-generated method stub

	}

}
