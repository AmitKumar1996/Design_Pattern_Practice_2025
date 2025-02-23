package singelton;

public class CreateDao_02_23 {
	
	private static CreateDao_02_23 createDao_02_23=null;
	
	private static CreateDao_02_23 getInstance() {
		if(createDao_02_23==null) {
			createDao_02_23 = new CreateDao_02_23();
		}
		return createDao_02_23;
		
		
	}
	
	

	public static void main(String[] args) {
		
		CreateDao_02_23 obj1= new CreateDao_02_23().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_23 obj2= new CreateDao_02_23().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
