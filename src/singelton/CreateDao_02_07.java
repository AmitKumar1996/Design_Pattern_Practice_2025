package singelton;

public class CreateDao_02_07 {
	
	private static CreateDao_02_07 createDao_02_07=null;
	
	private static CreateDao_02_07 getInstance() {
		if(createDao_02_07 == null) {
			createDao_02_07= new CreateDao_02_07();
		}
		return createDao_02_07;
		
	}

	public static void main(String[] args) {
		CreateDao_02_07 obj1= new CreateDao_02_07().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_07 obj2= new CreateDao_02_07().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
