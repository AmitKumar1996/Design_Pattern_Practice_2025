package singelton;

public class CreateDao_02_17 {
	
	private static CreateDao_02_17 createDao_02_17=null;
	
	private static CreateDao_02_17 getInstance() {
		
		if(createDao_02_17 == null) {
			createDao_02_17 = new CreateDao_02_17();
		}
		return createDao_02_17;
	}

	public static void main(String[] args) {
		
		CreateDao_02_17 obj1=new CreateDao_02_17().getInstance();
		 
		System.out.println(obj1.hashCode());
		
		CreateDao_02_17 obj2= new CreateDao_02_17().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
