package singelton;

public class CreateDao_15_03 {
	
	private static CreateDao_15_03 createDao_15_03=null;
	
	private static CreateDao_15_03 getInstance() {
		if(createDao_15_03 == null) {
			createDao_15_03= new CreateDao_15_03();
		}
		return createDao_15_03;
	}

	public static void main(String[] args) {
		
		CreateDao_15_03 obj1= new CreateDao_15_03().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_15_03 obj2= new CreateDao_15_03().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
