package singelton;

public class CreateDao_02_007 {
	private static CreateDao_02_007 createDao_02_007=null;
	
	private static CreateDao_02_007 getInstance() {
		if(createDao_02_007 == null) {
			createDao_02_007= new CreateDao_02_007();
		}
		return createDao_02_007;
	}

	public static void main(String[] args) {
		
		CreateDao_02_007 obj1= new CreateDao_02_007().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_007 obj2= new CreateDao_02_007().getInstance();
		System.out.println(obj2.hashCode());
		
		
		
	}

}
