package singelton;

public class CreateDao_02_04 {
	
	private  static CreateDao_02_04 createDao_02_04= null;
	
	private static CreateDao_02_04 getInstance() {
		if(createDao_02_04 == null) {
			createDao_02_04 = new CreateDao_02_04();
		}
		return createDao_02_04;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateDao_02_04 obj1 = new CreateDao_02_04().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_02_04 obj2= new CreateDao_02_04().getInstance();
		System.out.println(obj2.hashCode());

	}

}
