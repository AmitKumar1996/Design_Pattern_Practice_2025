package singelton;

public class CreateDao_11_03 {
	private static CreateDao_11_03 createDao_11_03=null;
	
	private static CreateDao_11_03 getInstance() {
		if(createDao_11_03 == null) {
			createDao_11_03 = new CreateDao_11_03();
		}
		return createDao_11_03;
	}

	public static void main(String[] args) {
		CreateDao_11_03 obj1= new CreateDao_11_03().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_11_03 obj2= new CreateDao_11_03().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
