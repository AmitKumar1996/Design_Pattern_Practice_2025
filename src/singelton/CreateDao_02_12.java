package singelton;

public class CreateDao_02_12 {
	
	private static CreateDao_02_12 createDao_02_12=null;
	
	private CreateDao_02_12 getInstance() {
		
		if(createDao_02_12 == null) {
			 createDao_02_12 = new CreateDao_02_12();
		}
		return createDao_02_12;
	}
	
	

	public static void main(String[] args) {
		
		CreateDao_02_12 obj1= new CreateDao_02_12().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_12 obj2= new CreateDao_02_12().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
