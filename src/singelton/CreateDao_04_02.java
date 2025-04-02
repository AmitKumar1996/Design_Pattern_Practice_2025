package singelton;

public class CreateDao_04_02 {
	
	private static CreateDao_04_02 createDao_04_02=null;
	
	
	private static CreateDao_04_02 getInstance() {
		if(createDao_04_02 == null) {
			createDao_04_02  = new CreateDao_04_02();
		}
		return createDao_04_02;
	}

	public static void main(String[] args) {
		
		CreateDao_04_02 obj= new CreateDao_04_02().getInstance();
		System.out.println(obj.hashCode());
		
		CreateDao_04_02 obj2= new CreateDao_04_02().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
