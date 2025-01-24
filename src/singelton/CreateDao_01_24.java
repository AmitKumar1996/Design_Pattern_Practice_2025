package singelton;

public class CreateDao_01_24 {
	
	
	private static CreateDao_01_24 createDao_01_24=null;
	
	private static CreateDao_01_24 getInstance() {
		
		if(createDao_01_24 == null) {
			
			createDao_01_24 = new CreateDao_01_24();
		}
		return createDao_01_24;
	}
	

	public static void main(String[] args) {
		
		
		CreateDao_01_24 obj1= new CreateDao_01_24().getInstance();
		
		System.out.println(obj1.hashCode());
		
		
		CreateDao_01_24 obj2= new CreateDao_01_24().getInstance();
		
		System.out.println(obj2.hashCode());
		
		

	}

}
