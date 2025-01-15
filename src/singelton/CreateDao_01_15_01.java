package singelton;

public class CreateDao_01_15_01 {
	
	private static CreateDao_01_15_01 createDao_01_15_01=null;
	
	private static CreateDao_01_15_01 getInstance() {
		
		if(createDao_01_15_01 == null) {
			createDao_01_15_01 = new CreateDao_01_15_01();
		}
		return createDao_01_15_01;
	}

	public static void main(String[] args) {
		
		CreateDao_01_15_01 obj1= new CreateDao_01_15_01().getInstance();
		
		System.out.println(obj1.hashCode());
		
		
		
		CreateDao_01_15_01 obj2= new CreateDao_01_15_01().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
