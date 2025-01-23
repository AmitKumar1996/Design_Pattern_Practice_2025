package singelton;

public class CreateDao_01_23 {
	
	private static CreateDao_01_23 createDao_01_23=null;
	
	public static CreateDao_01_23 getInstance() {
		if(createDao_01_23 == null) {
			
			
			createDao_01_23 = new CreateDao_01_23();
			
		}
		return createDao_01_23;
	}

	public static void main(String[] args) {
		
		CreateDao_01_23 obj1= new CreateDao_01_23().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_23 obj2= new CreateDao_01_23().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
