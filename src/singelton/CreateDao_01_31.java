package singelton;

public class CreateDao_01_31 {
	
	private static CreateDao_01_31 createDao_01_31=null;
	
	private static CreateDao_01_31 getInstance() {
		if(createDao_01_31 == null) {
			createDao_01_31 = new CreateDao_01_31();
		}
		return createDao_01_31;
	}

	public static void main(String[] args) {
		CreateDao_01_31 obj1= new CreateDao_01_31().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_31 obj2= new CreateDao_01_31().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
