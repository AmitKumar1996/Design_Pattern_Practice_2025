package singelton;

public class CreateDao_01_30 {
	
	private static CreateDao_01_30 createDao_01_30=null;
	
	private static CreateDao_01_30 getInstance() {
		
		if(createDao_01_30 == null) {
			createDao_01_30= new CreateDao_01_30();
		}
		return createDao_01_30;
	}

	public static void main(String[] args) {
		
		CreateDao_01_30 obj1= new CreateDao_01_30().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_30 obj2= new CreateDao_01_30().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
