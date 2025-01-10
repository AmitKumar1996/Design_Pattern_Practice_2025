package singelton;

public class CreateDao_01_10 {
	
	private static CreateDao_01_10 createDao_01_10=null;
	
	
	private static CreateDao_01_10 getInstance() {
		
		if(createDao_01_10== null) {
			
			createDao_01_10 = new CreateDao_01_10();
		}
		return createDao_01_10;
	}
	
	

	public static void main(String[] args) {
		
		CreateDao_01_10 obj1= new CreateDao_01_10().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_10 obj2= new CreateDao_01_10().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
