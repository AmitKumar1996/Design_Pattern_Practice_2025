package singelton;

public class CreateDao_04_06 {
	private static CreateDao_04_06 createDao_04_06= null;
	private static CreateDao_04_06 getInstance() {
		if(createDao_04_06 == null) {
			createDao_04_06 = new CreateDao_04_06();
		}
		return createDao_04_06;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateDao_04_06 obj1= new CreateDao_04_06().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_04_06 obj2= new CreateDao_04_06().getInstance();
		System.out.println(obj2.hashCode());

	}

}
