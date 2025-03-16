package singelton;

public class CreateDao_16_03 {
	
	private static CreateDao_16_03 createDao_16_03=null;
	
	private static CreateDao_16_03 getInstance() {
		if(createDao_16_03 == null) {
			createDao_16_03 = new CreateDao_16_03();
		}
		return createDao_16_03;
	}

	public static void main(String[] args) {
		CreateDao_16_03 obj1= new CreateDao_16_03().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_16_03 obj2= new CreateDao_16_03().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
