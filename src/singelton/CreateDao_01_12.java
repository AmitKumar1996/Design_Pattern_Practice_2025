package singelton;

public class CreateDao_01_12 {
	
	private static CreateDao_01_12 createDao_01_12=null;
	
	
	private static CreateDao_01_12 getInstance() {
		
		if(createDao_01_12 == null) {
			createDao_01_12 = new CreateDao_01_12();
		}
		return createDao_01_12;
	}

	public static void main(String[] args) {
		
		
		CreateDao_01_12 obj1= new CreateDao_01_12().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CreateDao_01_12 obj2= new CreateDao_01_12().getInstance();
		System.out.println(obj2.hashCode());
		
		// TODO Auto-generated method stub

	}

}
