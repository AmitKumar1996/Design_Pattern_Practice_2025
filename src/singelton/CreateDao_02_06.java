package singelton;

public class CreateDao_02_06 {
	
	private static CreateDao_02_06 createDao_02_06= null;
	
	private CreateDao_02_06 getInstance() {
		
		if(createDao_02_06 == null) {
			createDao_02_06 = new CreateDao_02_06();
		}
		return createDao_02_06;
	}

	public static void main(String[] args) {
		
		CreateDao_02_06 obj1= new CreateDao_02_06().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_06 obj2= new CreateDao_02_06().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
