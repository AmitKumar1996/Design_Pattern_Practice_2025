package singelton;

public class CreateDao_01_09 {
	
	private static CreateDao_01_09 createDao_01_09;
	
	
	private CreateDao_01_09 getInstance() {
		
		if(createDao_01_09 == null) {
			
			createDao_01_09 = new CreateDao_01_09();
			
		}
		return createDao_01_09;
		
	}

	public static void main(String[] args) {
		
		CreateDao_01_09 obj1= new CreateDao_01_09().getInstance();
		
		System.out.println(obj1.hashCode());
		
		
		CreateDao_01_09 obj2 = new CreateDao_01_09().getInstance();
		
		System.out.println(obj2.hashCode());
		
		
		// TODO Auto-generated method stub

	}

}
