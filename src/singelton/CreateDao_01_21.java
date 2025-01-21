package singelton;

public class CreateDao_01_21 {
	private static CreateDao_01_21 createDao_01_21=null;
	private static CreateDao_01_21 getInstance() {
		if(createDao_01_21 == null) {
			createDao_01_21 = new CreateDao_01_21();
		}
		return createDao_01_21;
	}

	public static void main(String[] args) {
		CreateDao_01_21 obj1= new CreateDao_01_21().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CreateDao_01_21 obj2= new CreateDao_01_21().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
